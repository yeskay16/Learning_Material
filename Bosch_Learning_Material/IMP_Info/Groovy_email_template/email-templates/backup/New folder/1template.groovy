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
[ SCRIPT_PROJECT_NAME ]:  JENKINS Automated mail<BR/> <BR/>
Hello All,<BR/><BR/>

<!-- ARTIFACTS - For Success-->
 A New SCRIPT_PROJECT_NAME label SCRIPT_LABEL is ready <BR/>
<U>Binary Path: </U><BR/>
&nbsp;&nbsp;&nbsp; \\\\10.47.49.66\\Jenkins64WS\\PSA_RCC_HMI_MIDW_BUILD\\workspace\\view\\ai_projects\\PSARCC_RELEASE <BR/><BR/>
<B>Integrated Labels : </B> <BR/><BR/>
SCRIPT_INTEGRATED_LABELS
<BR/>
<BR/>

	<TABLE>
	 <TR><TD>BUILD </TD><TD>${build.result}</TD></TR>
	  <TR><TD>Build Number:</TD><TD>${build.number}</TD></TR>
	  <TR><TD>Build URL</TD><TD>${build.url}</TD></TR>
	  <TR><TD>Project:</TD><TD>SCRIPT_PROJECT_NAME</TD></TR>
	  <TR><TD>Date of build:</TD><TD>${it.timestampString}</TD></TR>
	  <TR><TD>Build duration:</TD><TD>${build.durationString}</TD></TR> 
	</TABLE><BR/><BR/>
Regards,<BR/> PSA Integration Team <BR/>
</BODY>