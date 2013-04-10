<%@ page pageEncoding="UTF-8" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>whatsinthemicrowave.com <spring:message code="label.login"/></title>
</head>
<body>
<center>
<span style="float: right">
    <a href="?lang=en">English</a>|<a href="?lang=fr">Français</a>|<a href="?lang=zh_CN">中文</a>
</span>
<br/><br/><br/>
<h1>${greetings}</h1>
<br/><br/>
<form>
<table>
<tr><td><label><spring:message code="label.username"/>:</label></td><td><input type="text" name="username"/></td></tr>
<tr><td><label><spring:message code="label.password"/>:</label></td><td><input type="password" name="password"/></td></tr>
<tr><td colspan=2 align='right'><input type='submit' value='<spring:message code="label.login"/>'/></td></tr>
</table>
</form>
</center>
</body>
</html>
