<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sign up</title>
</head>
<style>
.content {
  justify-content: center;
  display: flex;
  margin: 100px 400px;
  border: 3px solid blue;
  padding: 30px;
  background-color: rgb(208, 205, 248);
}
</style>
<body bgcolor="pink" align="center">
	<h1>Create New Account</h1>
    <div class="content">
    <form action="signup" method="post" align="center">
    <h3>Register Number : <input type="text" name="rno"></h3>
    <h3>UserName        : <input type="text" name="uname"></h3>
    <h3>PassWord        : <input type="password" name="pass"></h3>
    <h3>Conform Password:<input type="password" name="cpass"></h3>
    <button type="submit" align="center">SignUp</button>
    </form>
    </div>
</body>
</html>