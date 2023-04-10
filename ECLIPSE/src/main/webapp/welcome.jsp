<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<head>
  <title>Página de Inicio</title>
  <!-- Agrega los enlaces a los estilos CSS y scripts JS que necesites -->
  <!-- Aquí puedes agregar los enlaces a tus archivos de estilos CSS y scripts JS -->
  <style>
    /* Estilos para el navbar */
    nav {
      background-color: #ffffff; /* Fondo blanco */
      padding: 20px; /* Espaciado interno */
    }

    ul {
      list-style-type: none;
      margin: 0;
      padding: 0;
      overflow: hidden;
    }

    li {
      float: right;
    }

    li a {
      display: block;
      color: #0000ff; /* Texto azul */
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
    }

    /* Estilos para el contenido de la página de inicio */
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

    p {
      font-size: 18px;
      text-align: center;
    }

    .buttons {
      margin-top: 20px; /* Espaciado superior */
    }

    .buttons a {
      display: inline-block;
      margin-right: 10px; /* Espaciado derecho */
      padding: 12px 20px; /* Padding para el botón */
      background-color: #0000ff; /* Fondo azul */
      color: #ffffff; /* Texto blanco */
      text-decoration: none;
      border-radius: 25px; /* Borde redondeado */
    }
  </style>
</head>

<body>
  <!-- Navbar -->
  <nav>
    <ul>
      
      <li><a href="#" style="color: #ffffff; background-color: #0000ff;">Cerrar Sesión</a></li>
    </ul>
  </nav>

  <!-- Contenido de la página de inicio -->
  <div class="container">
    <h1>Bienvenido a mi pagina de inicio</h1> <span style="font-weight: bold"><%= session.getAttribute("email") %></span>
    <p>Modifica tus datos</p>
    <div class="buttons">
      <a href="#">Cerrar Sesión</a>
      <a href="actualizarpass.jsp">Modifcar contraseña</a>
    </div>
  </div>

  <!-- Puedes agregar más secciones o elementos según tus necesidades -->

  <!-- Agrega los scripts JS que necesites -->
  <!-- Aquí puedes agregar los enlaces a tus archivos de scripts JS -->
</body>

</html>