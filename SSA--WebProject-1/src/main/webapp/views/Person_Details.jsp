<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
   <font color="green"><b><i> ${smsg }</i></b></font>
   <font color="red"><b><i> ${emsg }</i></b></font><br><br>
    <form:form action="/saveDetails" method="POST" modelAttribute="pmodel">
    
		<table>
			<tr>
				<td>Enter First Name ::</td>
				<td><form:input path="firstName" /></td>
			</tr>
			<tr>
				<td>Enter Last Name ::</td>
				<td><form:input path="lastName" /></td>
			</tr>
			<tr>
				<td>Enter Date Of Birth ::</td>
				<td><form:input type="date" path="dob" /></td>
			</tr>
			<tr>
				<td>Enter Gender ::</td>
				<td>Male <form:radiobutton path="gender" value="M" />
					&nbsp;&nbsp;&nbsp;Female <form:radiobutton path="gender"
						value="F" /></td>
			</tr>
			<tr>
				<td>Select Your State ::</td>
				<td><form:select path="stateName">
						<form:option value="--Select State--"></form:option>
						<form:options items="${allstates}" />
					</form:select></td>
			</tr>
			<tr>
				<td><input type="reset" value="RESET"></td>
				<td><input type="submit" value="SUBMIT"></td>
			</tr>

		</table>
    
    
    
    
    
    
    </form:form>
