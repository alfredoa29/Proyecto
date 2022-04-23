<%-- 
    Document   : busqueda
    Created on : 21/04/2022, 01:53:25 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Búsqueda</title>
    </head>
    <body>
        <h2>Búsqueda de Médicos</h2>
        
        <br /><br />
        
        <form action="" method="POST" autocomplete="off">
            
            <p>
                Ubicación:
                <input id="ubicacion" name="ubicacion" type="text" />
            </p>
            
            <p>
                Especialidad:
                <input id="especialidad" name="especialidad" type="text" />
            </p>
            
        <br /><br />
        
        <table border="1" width="80">
            <thead>
                <tr>
                    <th>Identificación</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Horario</th>
                    <th>Frecuencia</th>
                    <th>Cobro</th>
                    <th>Presentacion</th>
                    <th>Foto</th>
                    <th>Id Cita</th>
                    <th>Fecha</th>
                    <th>Hora</th>
                    
                </tr>
            </thead>
            
            <tbody>
                
            </tbody>
            
            <button id="listar" name="listar" type="submit">Listar</button>
            <button id="horario" name="horario" type="submit">Horario Extendido</button>
            <button id="agendar" name="agendar" type="submit">Agendar Cita</button>
            <button id="volver" name="volver" type="submit">Volver</button>
        
        
    </body>
</html>
