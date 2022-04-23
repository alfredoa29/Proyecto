<%-- 
    Document   : horarioExt
    Created on : 22/04/2022, 04:04:09 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Horario Extendido</title>
    </head>
    <body>
        <h2>Horario Extendido</h2>
        
        <br /><br />
        
        <table border="1" width="80">
            <thead>
                <tr>
                    <th>Identificación</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    <th>Horario</th>
                    <th>Estado</th>
                </tr>
            </thead>
            
            <tbody>
                
            </tbody>
            
        <p>
            Desde:
            <input id="fecha1" name="fecha1" type="text">
        </p>
        
        <p>
            Hasta:
            <input id="fecha2" name="fecha2" type="text">
        </p>
            
            <button id="volver" name="volver" type="submit">Volver</button>
    </body>
</html>
