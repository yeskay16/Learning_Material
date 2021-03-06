<STYLE> 
BODY, TABLE, TD, TH, P { 
  font-family:Verdana,Helvetica,sans serif; 
  font-size:11px; 
  color:black; 
} 
h1 { color:black; } 
h2 { color:black; } 
h3 { color:black; } 
TD.bg1 { color:white; background-color:#0000C0; font-size:120% } 
TD.bg2 { color:white; background-color:#4040FF; font-size:110% } 
TD.bg4 { color:white; background-color:#FF0000; font-size:110% } 
TD.bg3 { color:white; background-color:#8080FF; } 
TD.test_passed { color:blue; } 
TD.test_failed { color:red; } 
TD.console { font-family:Courier New; } 
</STYLE> 
<BODY> 
<TABLE> 
 <!-- <TR><TD align="right"><IMG SRC="images/<%= build.result.toString() == 'SUCCESS' ? "Green.jpg" : build.result.toString() == 'FAILURE' ? 'Red.jpg' : 'yellow.jpg' %>" /> --> 
  </TD><TD valign="center"><B style="font-size: 200%;">BUILD ${build.result}</B></TD></TR> 
  <TR><TD>Build Number:</TD><TD>${build.number}</TD></TR> 
  <TR><TD>Build URL</TD><TD>${build.url}</TD></TR> 
  <TR><TD>Project:</TD><TD>JLR NGI</TD></TR> 
  <TR><TD>Date of build:</TD><TD>${it.timestampString}</TD></TR> 
  <TR><TD>Build duration:</TD><TD>${build.durationString}</TD></TR>  
</TABLE> 
<BR/> 
<BR/> 
 
 
 
 
<ARTIFACTS>
<% if(build.result==hudson.model.Result.SUCCESS) { %> 
 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>Label Details</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<TABLE> 
  <TR><TD>Label Details</TD></TR> 
  <TR><TD>&nbsp;&nbsp;VOB: ai_ngi</TD></TR> 
  <TR><TD>&nbsp;&nbsp;&nbsp;Newly applied Label is : <B></B></TD></TR> 
  <TR><TD>&nbsp;&nbsp;&nbsp;Last applied Label was : </TD></TR> 
  <TR><TD>&nbsp;&nbsp;VOB: ai_autosar</TD></TR> 
  <TR><TD>&nbsp;&nbsp;&nbsp;Newly applied Label is : <B>AI_AUTOSAR_G3_FEA_INT_16.0F06</B></TD></TR> 
  <TR><TD>&nbsp;&nbsp;&nbsp;Last applied Label was : AI_AUTOSAR_G3_FEA_INT_16.0F05</TD></TR> 
  <TR><TD>&nbsp;&nbsp;VOB: ai_projects</TD></TR> 
  <TR><TD>&nbsp;&nbsp;&nbsp;Newly applied Label is : <B>AI_PRJ_G3_NGI_FEA_INT_16.0F09</B></TD></TR> 
  <TR><TD>&nbsp;&nbsp;&nbsp;Last applied Label was : AI_PRJ_G3_NGI_FEA_INT_16.0F08</TD></TR> 
  <TR><TD> </BR></TD></TR> 
</TABLE> 
<BR/> 
<BR/> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>Integrated labels</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<TABLE> 
  <TR><TD>Integrated labels are</TD></TR> 
  <TR><TD><TABLE border="1"><TR><TD>Label</TD><TD>Vob</TD><TD>Released by</TD></TR><TR><TD>AI_NGI_G3_FEA_TAS_PARTNUMBER_05</TD><TD>ai_projects</TD><TD>ket5cob</TD></TR><TR>
  <TR><TD> </BR></TD></TR> 
  <TR><TD>Rejected labels are</TD></TR> 
  <TR><TD>NIL</TD></TR> 
  <TR><TD> </BR></TD></TR> 
  <TR><TD>Excluded labels for Integration are</TD></TR> 
  <TR><TD>NIL</TD></TR> 
  <TR><TD> </BR></TD></TR> 
  <TR><TD>Dependency labels are</TD></TR> 
  <TR><TD>SCRIPT_DEPENDENCY_LABELS</TD></TR> 
</TABLE> 
<BR/> 
<BR/> 
<!-- <TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> --> 
<!-- <BR/> --> 
<!-- <TR><TD class="bg"><B>Test Reports</B></TD></TR> --> 
<!-- <BR/> --> 
<!-- <TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> --> 
<!-- <TABLE> --> 
  <!--<TR><TD>Test Report available in <a href="\\bosch.com\\DfsRB\\DfsIN\\LOC\\Kor\\NE2\\ECM\\Projects\\2012\\CM_AI_PJ_JLR_NGI_Support\\Documents\\Ready\\IP1.12\\verification\\BVT_Report\\Ph2.0">Click here</a></TD></TR> --> 
  <!-- NA --> 
<!-- </TABLE> --> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>Build Articafts</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<TABLE> 
  <TR><TD>Download binaries available in <a href="file://10.47.38.147/ecm/CI1/CD/PSA_HMI/Versions/Nirmal/"></a></TD></TR> 
  <TR><TD>Lint warnings available in <a href="file://10.47.53.56/psa_rcc/Software/Versions/HMI/Lint-Compiler_Warnings//">Click here</a></TD></TR> 
  <TR><TD>Logiscope available in <a href="file://10.47.53.56/PSA_RCC/Software/Versions/HMI/Logiscope//">Click here</a></TD></TR>
</TABLE> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>QVT Reports</B></TD></TR> 
<BR/> 
<TR><TD class="bg"><B>----------------------------------------------------------------------------------------------------------</B></TD></TR> 
<TABLE> 
   <TR><TD>QVT Report <a href="file://10.47.53.56/PSA_RCC/Software/Versions/HMI/Logiscope/BINARY_VERSION_INFORMATION/">Click here</a></TD></TR>
</TABLE> 
<BR/> 
<BR/> 
<TR><TD class="bg"><B>Contact <a href="mailto:Seenuvasan.Karthik@in.bosch.com">JLR NGI Integration team</a> for further support and clarifications</B></TD></TR> 
 
<% } %> 
 
<CONSOLE OUTPUT> 
<% if(build.result==hudson.model.Result.FAILURE) { %> 
<TABLE width="100%" cellpadding="0" cellspacing="0"> 
<TR><TD class="bg1"><B>CONSOLE OUTPUT</B></TD></TR> 
    <TR> 
      <TD> 
		<TR><TD colspan="2">Complete build logfiles are available in <a href="${build.url}">Build Logs</a> 
		<BR/> 
		<BR/> 
		<BR/> 
		<BR/> 
		</TD></TR> 
      </TD> 
    </TR> 
	 
<%         build.getLog(100).each() { line -> %> 
        <TR><TD class="console">${org.apache.commons.lang.StringEscapeUtils.escapeHtml(line)}</TD></TR> 
<%         } %> 
</TABLE> 
<BR/> 
<BR/> 
<BR/> 
<BR/> 
<% } %> 
 
</BODY> 
