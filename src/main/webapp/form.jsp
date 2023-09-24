<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp page</title>
</head>
<body>
	<h1>My Form</h1>
	<form action="Call">
		<table>
			<tr>
				<td>Enter your name:</td>
				<td><input type="text" name="user_name"
					placeholder="Enter here" /></td>
			</tr>
			<tr>
				<td></td>
				<td><button type="submit">submit</button>
				<td><button type="reset">Reset</button>
			</tr>
</table>
</form>
</body>
</html>