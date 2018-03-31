<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head></head>
<body>
<h1>Struts 2 Hello World Example</h1>

<h2>
    Hello
    <s:property value="userName" />
</h2>

<table border="1">
    <s:iterator value="users" >
    <tr>
        <td><s:property value="userName"/></td><td><s:property value="firstName"/></td>
    </tr>

    </s:iterator>
</table>

</body>
</html>