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





</BODY>