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
<%String resultado = (String) request.getAttribute("mensaje");
 String mensaje = "";
if (resultado != null) {
	mensaje = resultado;
	}
out.print(mensaje);
%>
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
                <input type="text" placeholder="Name"  class="form_input" id="name">
                <input type="text" placeholder="Email"  class="form_input" id="email"> 
                <input type="password" placeholder="Password"  class="form_input" id="pass">
                <button class="form-submit button" type="submit" name="signup" data-toggle="modal" data-target="#registroExitoso" value="Register">SIGN UP</button>
            </form>
        </div>
        <div class="container b-container" id="b-container">
            <form id="b-form" class="form" action="svlLogin" method="post" >

                <h2 class="form_title title">Sign in to Website</h2>
                <div class="form_icons">
                    <img src="img/google.png" alt="" class="form_icons">
                    <img src="img/facebook.png" alt="" class="form_icons">
                    <img src="img/github.png" alt="" class="form_icons">  
                </div>
                <span class="form_span">or use your email account</span>
                <input type="text" placeholder="Email"  class="form_input" id="email">
                <input type="password" placeholder="Password"  class="form_input" id="pass">
                <a href="" class="form__link">Forgot your password?</a>
                <button type="submit" name="signin" id="signin" class="form-submit button" value="Log in">SIGN IN</button>

            </form>
        </div>
        <div class="switch" id="switch-cnt">
            <div class="switch__circle"></div>
            <div class="switch__circle switch__circle--t"></div>
            <div class="switch__container" id="switch-c1">
                <h2 class="switch__title title">Welcome Back !</h2>
                <p class="switch__description description">To keep connected with us please login with your personal info</p>
                <button class="switch__button button switch-btn">SIGN IN</button>
            </div>
            <div class="switch__container is-hidden" id="switch-c2">
                <h2 class="switch__title title">Hello Friend !</h2>
                <p class="switch__description description">Enter your personal details and start journey with us</p>
                <button class="switch__button button switch-btn">SIGN UP</button>

            </div>
        </div>


    </div>
    
</body>
<script src="js/main.js"></script>
 <script src="vendor/jquery/jquery.min.js"></script>
</html>