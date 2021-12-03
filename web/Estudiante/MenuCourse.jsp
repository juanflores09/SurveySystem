<%@page import="Beans.Survey_Enrollment_Details"%>
<%@page import="Beans.Enrollment_Details"%>
<%@page import="Beans.Enrollment"%>
<%@page import="Beans.Course"%>
<%@page import="java.util.List"%>
<%@page import="Beans.Survey"%>
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
            <div class="cuenta" style="width: 350px;margin-right: 20px">
                <%
                HttpSession sesion = request.getSession();
                User user = (User)sesion.getAttribute("usuario");
                String idCourse = request.getParameter("idCourse");
                int idCourse1 = Integer.parseInt(idCourse);
                Course course = DAO.CourseDAO.findById(idCourse1);
                %>
                Alumno | <%out.print(user.getName());%>
                <a class="btn btn-danger" href="UserServlet?destino=salir">Cerrar sesión</a>
            </div>
        </div>
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
                     <img src="imagenes/icons8_staff_25px.png" alt=""/>
                     <label>Participantes</label> 
                 </a>
             </div>
             <div>
                 <a href="#">
                     <img src="imagenes/icons8_calendar_25px.png" alt=""/>
                    <label>Calificaciones</label> 
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
        <div class="contenedor">
            <h2 style="margin: 0 0 40px 50px"><%=course.getNameCourse().toUpperCase()%></h2>
            <div class="card">
                <div class="card-header">
                    <div class="cont-titulo"><h4>Encuestas</h4></div>
                </div>
                <div class="card-body">
                    <table class="table">
                        <thead class="thead-dark">
                            <tr>
                                <th scope="col">ID Encuesta</th>
                                <th scope="col">Título</th>
                                <th scope="col">Descripción</th>
                                <th scope="col">Estado</th>
                                <th scope="col">Fecha Inicio</th>
                                <th scope="col">Fecha Final</th>
                                <th scope="col">Acciones</th>
                            </tr>
                        </thead>
                        <tbody>
                            <%
                                List<Survey> survey = DAO.SurveyDAO.findAllSurvey();
                                
                                String idStudent = request.getParameter("idStudent");
                                int idStudent1 = Integer.parseInt(idStudent);
                                Enrollment_Details ed = DAO.EnrollmentDetailsDAO.findEnrollmentInCourse(idCourse1,idStudent1);
                                
                            for (int i = 0; i < survey.size(); i++) {
                            %>
                            <tr>
                                <td><%=survey.get(i).getIdSurvey()%></td>
                                <td><%=survey.get(i).getTitle()%></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td></td>
                                <td>
                                    <%
                                        Survey_Enrollment_Details se = DAO.SurveyEnrollmentDetailsDAO.findByIdEnrollment(ed.getIdEnrollment_Details());
                                        if(se.getIdSurveyEnrollmentDetails()==0){%>
                                            <a href="SurveyServlet?destino=survey&nameCourse=<%=course.getNameCourse().toUpperCase()%>&id=<%=String.valueOf(survey.get(i).getIdSurvey())%>&idEnrollmentDetails=<%=ed.getIdEnrollment_Details()%>" class="btn btn-success">Ir a la encuesta</a>
                                   <%
                                        } else{%>
                                            <!-- Button trigger modal -->
                                                <button type="button" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#exampleModal">
                                                    Ir a la encuesta
                                                </button>

                                                <!-- Modal -->
                                                    <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                                                      <div class="modal-dialog">
                                                        <div class="modal-content">
                                                          <div class="modal-header">
                                                            <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
                                                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                          </div>
                                                          <div class="modal-body">
                                                            Usted ya ha respondido la encuesta
                                                          </div>
                                                          <div class="modal-footer">
                                                            <button type="button" class="btn btn-primary" data-bs-dismiss="modal">Close</button>
                                                          </div>
                                                        </div>
                                                      </div>
                                                    </div>
                                    <%
                                        }
                                    %>
                                   
                                </td>
                            </tr>
                            <%
                                }
                                survey.clear();
                            %>
                        </tbody>
                    </table>
                </div>
            </div>
           
        </div>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    </body>
</html>
