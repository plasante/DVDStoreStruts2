<%@ taglib prefix="s" uri="/struts-tags" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hello World Struts 2</title>
    </head>
    <body>
        <s:a href="system">system</s:a>
        <hr>
        <h1>Hello World From Struts 2</h1>
        <form action="hello">
            <label for="name">Please enter your name</label><br/>
            <input type="text" name="name"/>
            <input type="submit" value="Say Hello"/>
        </form>
        <hr>
        <h2>Hello World OGNL Example</h2>
        <form action="helloOGNL">
            <label for="name">Please enter your name</label><br/>
            <input type="text" name="name"/>
            <input type="submit" value="Say Hello OGNL"/>
        </form>
        <hr>
        <h2>File Upload</h2>
        <s:form action="upload" method="post" enctype="multipart/form-data">
            <s:file name="upload" label="File" />
            <s:submit/>
        </s:form>
        <hr>
        <h2>Login Form</h2>
        <s:form action="loginaction" method="post">
            <s:textfield name="user" label="User"/>
            <s:password name="password" label="Password"/>
            <s:submit/>
        </s:form>
        <hr>
        <h2>Employee Form</h2>
        <s:form action="empinfo" method="post">
            <s:textfield name="name" label="Name" size="20" />
            <s:textfield name="age" label="Age" size="20" />
            <s:submit name="submit" label="Submit" align="center" />
        </s:form>
    </body>
</html>
