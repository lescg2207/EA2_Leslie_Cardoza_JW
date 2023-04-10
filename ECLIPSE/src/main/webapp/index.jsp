<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es" dir="ltr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="css/main.css">   
    <link href="css/css2.css" rel="stylesheet">
    <title>Document</title>
</head>
<body>

    <div class="main">
        <div class="container a-container" id="a-container">
            <form id="a-form" class="form"  action="svlRegistrar" method="post">
                <h2 class="form_title title">Create Account</h2>
                <div class="form_icons">
                    <img src="img/google.png" alt="" class="form_icons">
                    <img src="img/facebook.png" alt="" class="form_icons">
                    <img src="img/github.png" alt="" class="form_icons">               
                </div>
                <span class="form_span">or use email for registration</span>
                <input type="text" placeholder="Name" name="name" class="form_input" id="name">
                <input type="text" placeholder="Email" name="email" class="form_input" id="email"> 
                <input type="password" placeholder="Password" name="pass" class="form_input" id="pass">
                <button class="form-submit button" type="submit" name="signup" data-toggle="modal" data-target="#registroExitoso" value="Register">SIGN UP</button>
                <div>
                <br>
                <%String resultado = (String) request.getAttribute("mensaje");
                String mensaje = "";
                if (resultado != null) { mensaje = resultado;}out.print(mensaje);
                %>
                
                </div>
            </form>
        </div>
        <div class="container b-container" id="b-container">
            

       
        </div>
        <div class="switch" id="switch-cnt">
            <div class="switch__circle"></div>
            <div class="switch__circle switch__circle--t"></div>
            <div class="switch__container" id="switch-c1">
                <h2 class="switch__title title">Welcome Back !</h2>
                <p class="switch__description description">To keep connected with us please login with your personal info</p>
                <button class="switch__button button switch-btn" type="submit" onclick="location.href='login.jsp'">SIGN IN</button>
            </div>
           
        </div>


    </div>
    
</body>
<script src="vendor/jquery/jquery.min.js"></script>
</html>