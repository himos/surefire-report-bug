# surefire-report-bug

This repository is created to reproduce a surefire plugin bug which leads to malformed Junit xml report.

To reporduce run:
``mvn test``  

Then check junit xml report:  
`cat target/surefire-reports/TEST-com.mycompany.app.AppTest.xml`
```$xslt
    ...
    <property name="sun.io.unicode.encoding" value="UnicodeBig"/>
    <property name="java.class.version" value="52.0"/>
  </properties>
  <testcase name="testBug" classname="com.mycompany.app.AppTest" time="0.015">
    <error type="java.lang.NullPointerException"><![CDATA[java.lang.NullPointerException
        at com.mycompany.app.AppTest.testBug(AppTest.java:12)
]]></error>
    <system-out><![CDATA[  <-- EOF
```
