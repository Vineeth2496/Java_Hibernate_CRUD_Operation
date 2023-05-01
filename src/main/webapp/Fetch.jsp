<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fetch Profile</title>
<style>
body{
    background-image: linear-gradient(to right, #d16ba5, #c777b9, #ba83ca, #aa8fd8, #9a9ae1, #8aa7ec, #79b3f4, #69bff8, #52cffe, #41dfff, #46eefa, #5ffbf1);
}
.lbtxt{
    color: white;
    font-size: 30px;
    font-weight: 700;
    font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
}
.fetch{
    padding: 50px;
}
.fetbut{

    margin: 20px;
    padding: 10px;
    width: 100px;
    border-color: tomato;
    border-radius: 20px;
    font-size: 15px;
    font-weight: 800;
    background-color:whitesmoke;
    color:tomato;
}
.fetbut:hover{
    background-color: tomato;
    color: whitesmoke;
    border-color: whitesmoke;
    border: solid;
}

</style>
</head>
<body>
<center>
  <form action="FetchAction">
            <div class="fetch">
                <label class="lbtxt">Fetch Data Stored in DB</label>
                <br><br>
                <button type="submit" class="fetbut">Fetch</button>
            </div>
        </form>
        
</center>
</body>
</html>