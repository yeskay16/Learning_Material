#!/usr/bin/perl
 

use strict;
use warnings;
	
	
	if ( -z "D:\\JenkinsWS\\jenkinsLabelsMaster.txt" ) 
	{
	
	my $filename = 'D:\\JenkinsWS\\Jobs\\AI_NGI_Wait_Int_labels_JOB\\workspace\\perl_mail_for_devrelease_labels.txt';
open(my $fh, '>', $filename) or die "Could not open file '$filename' $!";
print $fh "----------------------Automated Mail from Jenkins-------------------------------\n";
print $fh "################################################################################\n \n";
print $fh "		JLR NGI Label DEV Released Check: No Labels	available for Integration				\n";
print $fh "################################################################################\n \n";
print $fh "Hello All,\n"; 
print $fh "There are no labels Dev released currently\n";
print $fh "Label Merge and Build job will terminate\n \n \n";
print $fh "\n \n \n";
print $fh "Contact JLR NGI Integration team for further support and clarifications.\n";
   
}
else
 { 
 my $filename = 'D:\\JenkinsWS\\Jobs\\AI_NGI_Wait_Int_labels_JOB\\workspace\\perl_mail_for_devrelease_labels.txt';
open(my $fh, '>', $filename) or die "Could not open file '$filename' $!";
print $fh "----------------------Automated Mail from Jenkins-------------------------------\n";
print $fh "################################################################################\n \n";
print $fh "		JLR NGI Label DEV Released Check: Labels Available for Integartion			\n";
print $fh "################################################################################\n \n";
print $fh "Hello All,\n"; 
print $fh "There are labels Dev released\n";
print $fh "Label Merge and Build Started\n \n \n";
print $fh "\n \n \n";
print $fh "Contact JLR NGI Integration team for further support and clarifications.\n";
 }
 
 
 







