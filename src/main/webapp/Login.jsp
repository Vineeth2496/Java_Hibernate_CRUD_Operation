<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
body{
    background: linear-gradient(to right, #ff6600 49%, #ff9966 100%);
    
}
.iform{

    border: solid tan;
    background-color: whitesmoke;
    margin-top: 100px;
    width: 300px;
    padding: 50px;
   	border-radius: 100px;
}
.iform:active{
    border-color: black;
    background-color: rgb(222, 208, 208);
}
.txt{
    font-weight: 900;
    font-family: cursive;
    color: tomato;
    font-size: 25px;
}
.ifield{
    padding: 20px;
}
.field{
    width: 200px;
    border-radius: 15px;
    padding: 5px;
}
.ibut{
    background-color: #ff6600;
    color: aliceblue;
    padding: 5px;
    border-radius: 10px;
    width: 80px;
    font-weight: 800;
}
.ibut:hover{
    background-color: antiquewhite;
    color: #ff9966;
   border-color: tomato;
}
.redirect{
    margin: 25px;
    font-weight: 900;
    font-size: 20px;
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
        <form action="LoginAction" class="iform" method="get">
            <label class="txt">Login</label>
            <div class="ifield">
                <input type="email" class="field" name="email" placeholder="Enter Email" required="required">
            </div>
            <div class="ifield">
                <input type="password" name="pass" class="field" placeholder="Enter Password" required="required">
            </div>
            <div>
                <button class="ibut" type="submit">Submit</button>
                <button class="ibut" type="reset">Clear</button>
            </div>
            
            <div class="redirect">
        		<a href="Register.jsp">Click here to Create Account</a>
    		</div>
        </form>
</center>

</body>
</html>