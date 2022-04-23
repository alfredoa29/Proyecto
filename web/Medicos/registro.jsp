<%-- 
    Document   : perfil
    Created on : 20/04/2022, 09:25:50 AM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro de Médicos</title>
    </head>
    <body>
        <h2>Registrar Médico</h2>
        
        <br /><br />
        
        <p>
            Identificación:
            <input id="identificacion" name="identificacion" type="text">
        </p>

        <p>
            Clave:
            <input id="clave" name="clave" type="text">
        </p>

        <p>
            Nombre:
            <input id="nombre" name="nombre" type="text">
        </p>
        
        <p>
            Apellido:
            <input id="apellido" name="apellido" type="text">
        </p>
        
        <button id="guardar" name="guardar" type="submit">Guardar</button>
        <button id="volver" name="volver" type="submit">Volver</button>

    </body>
</html>
