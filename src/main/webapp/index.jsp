<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>

<html>
<body>
<h2>Hello World 5!</h2>

<s:form action="/User/Welcome">
    <s:textfield name="userName" label="Username"/>
    <s:password name="password" label="Password"/>
    <s:submit/>
</s:form>

</body>
</html>
