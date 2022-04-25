<%-- 
    Document   : index
    Created on : 21/04/2022, 01:33:38 PM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
    </head>
    <body>
        <h2>Usuario a ingresar</h2>
        
        <br /><br />
        
            
            <form action="Admin/inicio.jsp">
                <button id="admin" name="admin" type="submit">Administrador</button>
            </form>
            
            <form action="Medicos/citas.jsp">
                 <button id="volver" name="medico" type="submit">Médico</button>
            </form>
           
             <form action="Pacientes/agendar.jsp">
                   <button id="volver" name="paciente" type="submit">Paciente</button>

         
            
    </body>
</html>
