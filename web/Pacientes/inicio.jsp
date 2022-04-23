<%-- 
    Document   : inicio
    Created on : 20/04/2022, 10:10:43 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio de Sesión</title>
    </head>
    <body>
        <h2>Inicio de Sesión</h2>
        
        <br /><br />
        
        <p>
            Identificación:
            <input id="identificacion" name="identificacion" type="text">
        </p>
            
        <p>
            Clave:
            <input id="clave" name="clave" type="text">
        </p>
        
        <button id="buscar" name="buscar" type="submit">Buscar Médico</button>
        <button id="guardar" name="guardar" type="submit">Guardar</button>
        <button id="volver" name="volver" type="submit">Volver</button>

    </body>
</html>
