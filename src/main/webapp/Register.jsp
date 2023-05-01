<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register</title>
<style>
body{
  background: linear-gradient(to right, #ff6600 49%, lime);
}
.outerform{
	height: 500px;
	width: 500px;
	background-color: white;
	margin-top: 60px;
	border-radius: 100px;
	border-style: outset;
	border-color: black;
}

.outerform:hover{
	border-color: #fab392;
}
.regtxt{
	font-family: cursive;
	font-weight: 700;
	color: #ff6600;
}
.ipfield{
	padding: 20px;
}
.ifield{
	height: 30px;
	width: 250px;
	border-radius: 20px;
	border-color: #f58941a8;
	font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
}
.ifield:hover{
    border-color: #fab392;
    background-color: #f7ddd1;
    font-family: 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
}
.butfield{
    height: 35px;
    width: 125px;
    border-radius: 20px;
    background-color: white;
    border-color: #ff6600;

}
.butfield:hover{
    background-color: #ff9966;
}
.ridirect{
    margin: 25px;
    font-weight: 900;
    font-size: 20px;
    color: blue;
}

a:link{
    color: blue;
    background-color: transparent;
    text-decoration: none;
}
a:hover {
    color: whitesmoke;
    background-color: transparent;
    text-decoration: none;
  }

</style>
</head>
<body>
<center>
	<form action="RegisterAction" method="post">
	
	<div class="outerform">
		<label class="regtxt">Registration Form</label>
		<div class="ipfield">
			<input type="text" class="ifield" placeholder="Enter User ID" name="id">
		</div>
		
		<div class="ipfield">
			<input type="text" class="ifield" placeholder="Enter Full Name" name="fn">
		</div>
		
		<div class="ipfield">
			<input type="text" class="ifield" placeholder="Enter Email" name="em">
		</div>
		
		<div class="ipfield">
			<input type="text" class="ifield" placeholder="Enter Password" name="pa">
		</div>
		
		<div class="ipfield">
			<button type="submit" class="butfield">Submit</button>
			<button type="reset" class="butfield">Clear</button>
		</div>
		<div class="ridirect">
		<a href="Login.jsp">Click here if already registered?</a>
		</div>
		
	</div>
	</form>
	
</center>

</body>
</html>