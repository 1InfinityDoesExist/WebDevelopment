<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="wheat">
    <center>
        <form action="reg" method="post">
            <div class="container">
                <h1 style="color:cyan">Register</h1>
                <p>Please fill in this form to create an account.</p>
                <hr>

                <label for="email"><b>Username</b></label> 
                    <input type="text" placeholder="Enter Username" name="username" required> 
                <label for="psw"><b>Password</b></label> 
                    <input type="password" placeholder="Enter Password" name="pass" required> 
                <label for="psw-repeat"><b>Repeat Password</b></label> 
                    <input type="password" placeholder="Repeat Password" name="psw-repeat" required>
                <hr>

                <p>
                    By creating an account you agree to our <a href="#">Terms &
                        Privacy</a>.
                </p>
                <button type="submit" class="registerbtn">Register</button>
            </div>

            <div class="container signin">
                <p>
                    Already have an account? <a href="SignIn.jsp">Sign in</a>.
                </p>
            </div>
        </form>
    </center>



</body>
</html>