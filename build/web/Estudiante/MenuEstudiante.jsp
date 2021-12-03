<%-- 
    Document   : MenuEstudiante
    Created on : 25/10/2021, 02:44:49 AM
    Author     : Usuario
--%>

<%@page import="Beans.Course"%>
<%@page import="java.util.List"%>
<%@page import="Beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNPRG | Inicio</title>
        <link href="estilos/stylesCliente.css" rel="stylesheet" type="text/css"/>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    </head>
    <body>
        <!-- HEADER -->
        <div class="header">
            <div class="titulo"><h6>Universidad Nacional Pedro Ruiz Gallo</h6></div>
            <div class="cuenta" style="width: 350px;margin-right: 20px">
                <%
                HttpSession sesion = request.getSession();
                User user = (User)sesion.getAttribute("usuario");
                %>
                Alumno | <%out.print(user.getName());%>
                <a class="btn btn-danger" href="UserServlet?destino=salir">Cerrar sesión</a>
            </div>
        </div>
     <!-- ======================================= -->
     <div class="cont-general" style="display: flex">
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
          <!-- CONTENEDOR -->
     <div class="contenedor">
         <!-- CONTENEDOR/EVENTOS PROXIMOS-->
         <div class="card evet-prox">
             <div class="card-header">
                 <div class="cont-titulo"><h4>Eventos proximos</h4></div>
             </div>
             <div class="card-body">
                 <table class="table">
                     <thead>
                        <tr>
                            <th scope="col"></th>
                            <th scope="col">Título</th>
                            <th scope="col">Estado de la entrega</th>
                            <th scope="col">Estado de calificación</th>
                            <th scope="col">Fecha de entrega</th>
                            <th scope="col">Acciones</th>
                        </tr>
                     </thead>
                     <tbody>
                        <tr>
                            <td>1</td>
                            <td>Entrega final de Acreditable</td>
                            <td>No entregado</td>
                            <td>Sin calificar</td>
                            <td>Thursday, 28 October, 00:00</td>
                            <td>
                                <a href="#" class="btn btn-success">Ir a la actividad</a>
                            </td>
                        </tr>
                     </tbody>
                 </table>
             </div>
         </div>
         <!-- CONTENEDOR/EVENTOS PROXIMOS:END-->
         
         <hr><!-- VISTA GENERAL DE CURSOS -->
         <div class="card vista-courses">
            <div class="card-header" style="background:rgb(50,50,50);color: #fff">
                <h4>Vista general de Cursos </h4>
            </div>
             <div class="card-body courses">
                    <%
                        int id= user.getIdUser();
                        List<Course> courses = DAO.CourseDAO.FindCoursesByUser(id, 16);
                        for (Course course : courses) {%>
                            <a href="SurveyServlet?destino=menuCourse&idCourse=<%=course.getIdCourse()%>&idStudent=<%=id%>" class="NameCourse">
                                <div class="card " style="width: 18rem;">
                                    <img style="height: 180px" src="imagenes/<%=course.getPicture()%>" class="card-img-top" alt=""/>
                                    <div class="card-body " style="height:80px">
                                        <h6 class="card-text"><%=course.getNameCourse().toUpperCase()%></h6>
                                    </div>
                                </div>
                            </a>
                    <%}courses.clear();
                    %>
                </div>
         </div>
     </div>
     </div>
    </body>
</html>
