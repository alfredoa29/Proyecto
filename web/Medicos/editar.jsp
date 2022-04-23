<%-- 
    Document   : nuevo
    Created on : 20/04/2022, 09:25:29 AM
    Author     : 
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Editar Perfil</title>
    </head>
    <body>
        <h2>Editar Datos</h2>
        
        <br /><br />
        
        <form action="" method="POST" autocomplete="off">

            <p>
                Especialidad:
                <input id="especialidad" name="especialidad" type="text" />
            </p>

            <p>
                Localidad:
                <input id="localidad" name="localidad" type="text" />
            </p>

            <p>
                Horario:
                <input id="horario" name="horario" type="text" />
            </p>
            
            <p>
                Frecuencia de citas:
                <input id="frecuencia" name="frecuencia" type="text" />
            </p>

            <p>
                Cobro:
                <input id="cobro" name="cobro" type="text" />
            </p>

            <p>
                Presentación:
                <input id="presentacion" name="presentacion" type="text" />
            </p>
            
            <p>
                Foto:
                <input id="foto" name="foto" type="text" />
            </p>
            
            <button id="guardar" name="guardar" type="submit">Guardar</button>
            <button id="volver" name="volver" type="submit">Volver</button>
            
        </form>
    </body>
</html>
