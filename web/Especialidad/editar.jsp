<%-- 
    Document   : editar
    Created on : 22/04/2022, 03:58:48 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar</title>
    </head>
    <body>
        <h1>Editar Especialiad</h1>
        
        <br /><br />
        
        <p>
            Identificación:
            <input id="identificacion" name="identificacion" type="text">
        </p>

        <p>
            Especialidad:
            <input id="nombre" name="nombre" type="text">
        </p>
        
        <button id="guardar" name="guardar" type="submit">Guardar</button>
        <button id="volver" name="volver" type="submit">Volver</button>
    </body>
</html>
