<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Contact Page</title>
    </head>
    <body>
        <h2>Contact Page</h2>
        
        <s:form action="addContact" method="post">
            <s:textfield name="firstName" label="First Name"/>
            <s:textfield name="lastName" label="Last Name"/>
            <s:textfield name="emailId" label="Email"/>
            <s:textfield name="cellNo" label="Cell No."/>
            <s:textfield name="website" label="Homepage"/>
            <s:textfield name="birthDate" label="Birthdate"/>
            <s:submit value="Add Contact" align="center"/>
        </s:form>
        <hr>
        <table>
            <tr>
                <th>First Name</th>
                <th>Last Name</th>
                <th>Email</th>
                <th>Cell Number</th>
                <th>Birth Date</th>
                <th>Homepage</th>
                <th></th>
                <th></th>
                <th></th>
            </tr>
            <s:iterator value="contacts">
                <tr>
                    <td><s:property value="lastName" /></td>
                    <td><s:property value="firstName" /></td>
                    <td><s:property value="emailId" /></td>
                    <td><s:property value="cellNo" /></td>
                    <td><s:property value="birthDate" /></td>
                    <td><a href="<s:property value="website" />">link</a></td>
                    <td><a href="deleteContact?id=<s:property value="id" />">delete</a></td>
                    <td><a href="editContact?id=<s:property value="id" />">edit</a></td>
                </tr>
            </s:iterator>
        </table>
    </body>
</html>
