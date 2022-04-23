<%-- 
    Document   : citas
    Created on : 20/04/2022, 09:26:17 AM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestión de Citas</title>
    </head>
    <body>
        <h2>Citas</h2>
        
        <br /><br />
        
            <p>
                Estado:
                <input id="estado" name="estado" type="text" />
            </p>

            <p>
                Paciente:
                <input id="paciente" name="paciente" type="text" />
            </p>
            
            <p>
                Especialidad:
                <input id="especialidad" name="especialidad" type="text" />
            </p>

            <p>
                Orden de la Fecha:
                <input id="orden" name="orden" type="text" />
            </p>
        
        <form action="" method="POST" autocomplete="off">
            
            <button id="listar" name="listar" type="submit">Listar Citas</button>
            
            <button id="aceptar" name="aceptar" type="submit">Aceptar Citas</button>
            
            <button id="volver" name="volver" type="submit">Volver</button>
            
        <table border="1" width="80">
            <thead>
                <tr>
                    <th>Identificación</th>
                    <th>Hora</th>
                    <th>Fecha</th>
                    <th>Médico</th>

                </tr>
            </thead>
            
            <tbody>
                
            </tbody>
            
    </body>
</html>
