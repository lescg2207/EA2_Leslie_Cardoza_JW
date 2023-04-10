<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<head>
  <title>Modificar Contraseña</title>
  <style>
    /* Estilos para el formulario de modificar contraseña */
    .container {
      display: flex;
      flex-direction: column;
      align-items: center;
      justify-content: center;
      height: 100vh; /* Altura del viewport */
    }

    h1 {
      font-size: 36px;
      text-align: center;
    }

    form {
      width: 300px;
      margin-top: 20px; /* Espaciado superior */
    }

    label {
      display: block;
      margin-bottom: 10px; /* Espaciado inferior */
    }

    input[type="email"],
    input[type="password"] {
      width: 100%;
      padding: 12px; /* Padding para los campos de entrada */
      margin-bottom: 10px; /* Espaciado inferior */
    }

    input[type="submit"] {
      padding: 12px 20px; /* Padding para el botón de envío */
      background-color: #0000ff; /* Fondo azul */
      color: #ffffff; /* Texto blanco */
      text-decoration: none;
      border: none;
      border-radius: 25px; /* Borde redondeado */
      cursor: pointer;
    }
  </style>
</head>

<body>
  <div class="container">
    <h1>Modificar Contraseña</h1>
    <form action="svlUpass" method="post">
      <div class="inputDiv">
      <label class="inputLabel" for="email">Enter E-mail</label>
      <input type="email" id="email" name="email" value=<%= session.getAttribute("email") %> required>
    </div>  
      
    <div class="inputDiv">
      <label class="inputLabel" for="pass">Enter Password</label>
      <input type="password" id="pass" name="pass" required>
    </div>
      
    <div class="inputDiv">
      <label class="inputLabel" for="newPass">New Password</label>
      <input type="password" id="newPass" name="newPass">
    </div>

      <input type="submit" value="Modificar Contraseña">
      
      <div>
      <br/>
      <%String resultado = (String) request.getAttribute("mensaje");
      String mensaje = "";
      if (resultado != null) { mensaje = resultado;}out.print(mensaje);
      %>
      </div>
    </form>
  </div>


</body>

</html>

    

