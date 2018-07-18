
								#*********System Integration-Script file for v850 rpm creation**********#
## Author Name: Daniel Chempolayil Abraham, daniel@in.bosch.com
##Prerequisities:
#1. Needed to be in SUPERUSER access
#2. Need to have the folder structure hierarchy, "*.dnl" file in /media/sf_share/For_integration_v850/ISC/  and "*.srpm" file in /media/sf_share/For_integra#tion_v850/srpm folder
#3. Give a command line argument for the release version; ex: ./v850_system-integration.sh <release_version>



#! /bin/bash  ##Shell script for jlrngi_v850 si

cd /media/sf_share/ 
ls For_integration_v850 ## list folders with name For_integration_v850
	if [ $? -eq 0 ]; then 
	cd For_integration_v850 ## Go inside the integration folder
	else 
	echo "##Error: Not found: "For_integration_v850" folder" 
	fi
 
ls srpm 	##list folders with name srpm
	if [ $? -eq 0 ]; then
	cd srpm
	else 
	echo "##Error: Not found: "srpm" folder"
	fi 

sudo cp $(ls -1t | head -1) /root  ## copy the latest one to root folder ##Prerequisite: The srpm has to be copied to the windows share path which has a path accessible in Fedora machine./media/sf_share/
echo "***********Copying srpm done succesfully*****************"
cd /root ## cd to root; because rpm creation takes place in root directory
ls rpmbuild
	if [ $? -eq 0 ]; then 
	sudo rm -rf rpmbuild ## Make sure that there are no folders with name "rpmbuild", if any delete it.
	echo "***********Successfully removed already found "rpmbuild" folder**************"
	fi 

rpm -ivh v850*.src.rpm ## extract the source rpm copied
	if [ $? -eq 0 ]; then
	echo "************RPM Extraction done succesfully***************" 
	else 
	echo "##:Error: RPM Extraction failed"
	fi

cd rpmbuild/SOURCES ## change directory to rpmbuild
ls v850-fw.tar.gz
	if [ $? -eq 0 ]; then 
	tar -xzvf v850-fw.tar.gz ## extract the tar file
	echo "************v850-fw folder extraction done succesfully*************"
	else
	echo "##:Error: Failed v850-fw folder extraction"
	fi 

cd v850-fw ## change directory to v850-fw
rm *.dnl ## remove existing dnl file
	if [ $? -eq 0 ]; then
	echo "***************Removed .dnl file successfully******************"
	else 
	echo "##:Error: Could not remove .dnl file"
	fi

cp /media/sf_share/For_integration_v850/ISC/*.dnl . ## Copying the the .dnl file to current folder ##Prerequisities: Needed to have this folder structure and proposed .dnl file from preintegration 
	if [ $? -eq 0 ]; then
	echo "*************Copied new .dnl file successfully**************"
	else 
	echo "##:Error: Could not copy new .dnl file"
	fi

cd .. ## Redirect to SOURCES folder
tar -czvf v850-fw.tar.gz v850-fw ## Again zip the folder to tar
	if [ $? -eq 0 ]; then
	echo "*************Tar creation for v850-fw done successfully*************"
	else
	echo "##:Error: Tar creation for v850-fw failed"
	fi

cd /home/ngiuser/Daniel/Automation/v850/  ## Redirect to v850 automation folder

##For JLR_PACK_RELEASE
var=$1 ## Command line argument given for release version
cd /root/rpmbuild/SPECS/
var1=`grep "JLR_PACK_RELEASE" v850-fw.spec | awk '{print $3}'`
sed -i "s/${var1}/${var}/g" v850-fw.spec

##For CARLINE,
var=`grep "%define CARLINE" v850-fw.spec | awk '{print $3}'`
cd /media/sf_share/For_integration_v850/ISC/
var1=`ls *.dnl | cut -d '-' -f1 | cut -d '_' -f2`
cd /root/rpmbuild/SPECS/
sed -i "s/${var}/${var1}/g" v850-fw.spec

##For CARD:
var=`grep "%define CARD" v850-fw.spec | awk '{print $3}'`
cd /media/sf_share/For_integration_v850/ISC/
var1=`ls *.dnl | cut -d '-' -f2`
cd /root/rpmbuild/SPECS/
sed -i "s/${var}/${var1}/g" v850-fw.spec

##For JLR_RELEASE:
var=`grep "%define JLR_RELEASE" v850-fw.spec | awk '{print $3}'`
cd /media/sf_share/For_integration_v850/ISC/
var1=`ls *.dnl | cut -d '-' -f3 | cut -d '_' -f1`
cd /root/rpmbuild/SPECS/
sed -i "s/${var}/${var1}/g" v850-fw.spec

##For JLR_FW_VERSION:
var=`grep "%define JLR_FW_VERSION" v850-fw.spec | awk '{print $3}' | cut -d '.' -f1`
cd /media/sf_share/For_integration_v850/ISC/
var1=`ls *.dnl | cut -d '.' -f2`
cd /root/rpmbuild/SPECS/
sed -i "s/${var}/${var1}/g" v850-fw.spec


rpmbuild --ba --target=i586 v850-fw.spec ## rpm creation command given, specifying particular spec file
echo "*********************RPM Creation succesfull*******************"

cd ../../
rm -rf /media/sf_share/For_delivery_v850/rpmbuild

cp -rf rpmbuild /media/sf_share/For_delivery_v850 ## Copy the complete folder rpm build to windows shared folder. rpm will be present in RPMS folder and srpm in SOURCES folder as well.
	if [ $? -eq 0 ]; then
	echo "**************Folder "rpmbuild" is Copied to windows shared folder D:\Daniel\VB_Fedora_Shared-folder\For_delivery_v850*************"
	else
	echo "##:Error: Could not copy folder "rpmbuild" to the windows shared folder"
	fi



