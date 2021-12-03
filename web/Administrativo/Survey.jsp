<%@page import="Beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNPRG | Inicio</title>
        <link href="estilos/stylesStudent.css" rel="stylesheet"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
    </head>
    <body>
        <div class="header">
            <div class="titulo"><h6>Universidad Nacional Pedro Ruiz Gallo</h6></div>
            <div class="cuenta" style="width: 400px">
                <%
                HttpSession sesion = request.getSession();
                User user = (User)sesion.getAttribute("usuario");
                %>
                Consejo directivo | <%out.print(user.getName());%>
                <a class="btn btn-danger" href="UserServlet?destino=salir">Cerrar sesión</a>
            </div>
        </div>
        <!-- MENU VERTICAL -->
        <div class="menu-vertical">
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_student_male_25px.png" alt=""/>
                     <label>Área Personal</label>
                 </a>
             </div>
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_home_25px.png" alt=""/>
                     <label>Inicio</label>
                 </a>
             </div>
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_course_assign_25px_1.png" alt=""/>
                     <label>Mis Cursos</label> 
                 </a>
             </div>
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_calendar_25px.png" alt=""/>
                    <label>Horario</label> 
                 </a>
             </div>
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_file_25px_1.png" alt=""/>
                     <label>Archivos privados</label> 
                 </a>
             </div>
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_settings_25px.png" alt=""/>
                     <label>Configuración</label> 
                 </a>
             </div>
         </div>
        <!-- =============================== -->
        <div class="contenedor">
            <h3 style="margin: 0 0 40px 50px">PROCESO DE EVALUACIÓN DEL DESEMPEÑO DEL DOCENTE</h3>
            <div class="card evet-prox">
                <div class="card-header">
                    <div class="cont-titulo"><h4>Detalles de la encuesta</h4></div>
                    <div>
                        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#exampleModal" data-bs-whatever="@mdo">Agregar pregunta</button>
                    </div>
                    
                </div>
                <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                  <div class="modal-dialog">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Agregar nueva pregunta</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                      </div>
                      <div class="modal-body">
                        <form>
                          <div class="mb-3">
                            <label for="recipient-name" class="col-form-label">Pregunta</label>
                            <textarea class="form-control" id="message-text"></textarea>
                          </div>
                            <div class="mb-3" style="display: flex">
                                <div class="dropdown">
                                    <button class="btn btn-secondary dropdown-toggle" type="button" id="dropdownMenuButton2" data-bs-toggle="dropdown" aria-expanded="false">
                                      Tipo de pregunta
                                    </button>
                                    <ul class="dropdown-menu dropdown-menu-dark" aria-labelledby="dropdownMenuButton2">
                                      <li><a class="dropdown-item active" href="#">Seleccion múltiple</a></li>
                                      <li><a class="dropdown-item" href="#">Another action</a></li>
                                      <li><a class="dropdown-item" href="#">Something else here</a></li>
                                      <li><hr class="dropdown-divider"></li>
                                      <li><a class="dropdown-item" href="#">Separated link</a></li>
                                    </ul>
                              </div>
                          </div>
                        </form>
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                        <button type="button" class="btn btn-primary">Agregar pregunta</button>
                      </div>
                    </div>
                  </div>
                </div>
                <div class="card-body">
                    <table class="table">
                        <thead class="thead-ligth">
                            <tr>
                                <th scope="col">ID Pregunta</th>
                                <th scope="col">Pregunta</th>
                                <th scope="col">Tipo</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td>1</td>
                                <td><a href="UserServlet?destino=preguntas">Pregunta1</a></td>
                                <td>Seleccion múltiple</td>
                                <td>
                                    <button class="btn btn-primary"><img src="imagenes/icons8_edit_25px.png" alt=""/></button>
                                    <button class="btn btn-danger"><img src="imagenes/icons8_trash_25px.png" alt=""/></button>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
                    <!-- RESULTADOS DE LA ENCUESTA -->
                    <hr>
            <div class="card vista-courses">
                <div class="card-header">
                    <div class="cont-titulo"><h4>RESULTADOS DE LA ENCUESTA</h4></div>
                    <div>
                        <a href="Administrativo/ReportSurvey.jsp" target="_blank" class="btn btn-success">Generar reporte</a>
                    </div>
                </div>
                <div class="card-body">
                    <table class="table">
                        <thead class="thead-ligth">
                            <tr>
                                <th scope="col">ID</th>
                                <th scope="col">Curso</th>
                                <th scope="col">Docente</th>
                                <th scope="col">Promedio</th>
                                <th scope="col">% Encuestados</th>
                                <th scope="col">Desempeño</th>
                            </tr>
                        </thead>
                        <tbody>
                            <tr>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
            
        </div>
        
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
