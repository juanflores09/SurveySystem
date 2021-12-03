<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNPRG | Inicio</title>
        <link rel="stylesheet" href="estilos/styles.css">
        <link href = "https: //fonts.googleapis.com/css2? family = Montserrat: wght @ 100 & display = swap "rel =" stylesheet "></head>
        
    <body>
        <div class="bg-img">
            <div class = "contenedor">
                <header class="titulo" style="display: flex; height: 120px;" >
                    <img src="imagenes/Logo3_adobespark.png" alt="" style="width: 110px;height: 120px;"/>
                    
                    <div style="width: 70%;height: 100%;">
                        <b><h1 style="font-size: 52px;border-bottom: 2px solid #fff;height: 55%;padding-top: 10px;">UNPRG</h1></b>
                        <h2 style="height: 40%;font-size:17px ;padding-top: 6px;">Universidad Nacional Pedro Ruiz Gallo</h2>
                    </div>
                </header>
                <div class="formulario">
                    <form action="UserServlet" method="Post">
                        <div class="field usuario">
                            <img src="imagenes/icons8_user_25px_1.png">
                            <input type="text" name="email" id="usuario" placeholder="Correo">
                        </div>
                        <div class="field contraseña">
                            <img src="imagenes/icons8_password_25px_1.png">
                            <input type="password" name="password" id="contraseña" placeholder="contraseña">
                        </div>
                        <div class="pass">
                            <a href="#" style="font-size: 15px">¿Olvidaste tu contraseña?</a>
                        </div>
                        <div class="field ingresar">
                            <input type="submit" name="enviar" id="enviar" value="Ingresar" placeholder="Ingrese su contraseña">
                            <input type = "hidden" name = "Operacion" value = "Ingresar">
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </body>
</html>
