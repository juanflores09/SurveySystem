<%-- 
    Document   : SurveyEstudiante
    Created on : 22/10/2021, 12:57:48 AM
    Author     : Usuario
--%>

<%@page import="Beans.Question"%>
<%@page import="java.util.List"%>
<%@page import="Beans.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>UNPRG | Inicio</title>
        <link href="estilos/stylesStudent.css" rel="stylesheet"/>
        <link href="estilos/stylesSurvey.css" rel="stylesheet"/>
        <%--<link rel="stylesheet" href="estilos/stylesMiCuenta.css" type="text/css">--%>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    
    </head>
    <body>
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
        <!--MENU VERTICAL -->
        
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
        <!-- ===================== -->
        <div class="contenedor">
            <%
                String nameCourse=request.getParameter("nameCourse");
            %>
            <h2 style="margin: 0 0 40px 50px"><%=nameCourse%></h2>
            <h3 style="margin-bottom: 20px;margin-top: 55px;text-align: center">PROCESO DE EVALUACIÓN DE DESEMPEÑO DEL DOCENTE<hr></h3>
            
            <form action="SurveyEstServlet" method="post" name="fradio" class="card" style="padding: 30px 30px">
                <table class="table">
                    <thead class="thead-dark">
                        <tr style="text-align: center;">
                            <th> </th>
                            <th> </th>
                            <th><label style="border-right: 1px solid #fff;padding-right: 8px">Strongly disagree</label></th>
                            <th><label style="border-right: 1px solid #fff;padding-right: 8px">Disagree</label></th>
                            <th><label style="border-right: 1px solid #fff;padding-right: 8px">Neutral</label></th>
                            <th><label style="border-right: 1px solid #fff;padding-right: 8px">Agree</label></th>
                            <th><label padding-right: 5px">Strongly agree</label></th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String id = request.getParameter("id");
                            String idEnrollmentDetails = request.getParameter("idEnrollmentDetails");
                            
                            List<Question> preguntas = DAO.QuestionDAO.FindBySurvey(Integer.parseInt(id));
                            for (int i = 0; i < preguntas.size(); i++) {
                        %>
                            <tr style="height: 40px;">
                                <td style="text-align: left;"><b><%=preguntas.get(i).getIdQuestion()%></b></td>
                                <td style="text-align: left; width: 320px"><%=preguntas.get(i).getQuestion()%></td>
                                <td style="text-align: center"><input style="margin-top: 10px" type="radio" name="btn-rd<%=i%>" value="1"></td>
                                <td style="text-align: center"><input style="margin-top: 10px" type="radio" name="btn-rd<%=i%>" value="2"></td>
                                <td style="text-align: center"><input style="margin-top: 10px" type="radio" name="btn-rd<%=i%>" value="3"></td>
                                <td style="text-align: center"><input style="margin-top: 10px" type="radio" name="btn-rd<%=i%>" value="4"></td>
                                <td style="text-align: center"><input style="margin-top: 10px" type="radio" name="btn-rd<%=i%>" value="5"></td>
                            </tr>
                        <%
                            }
                            String npreguntas =  String.valueOf(preguntas.size());
                            preguntas.clear();
                        %>
                    </tbody>
                </table>
                    <div><button type="submit" style="margin-left: 700px" class="btn btn-primary">Enviar Resultados</button></div>
                    <input type="hidden" name="accion" value="calcular">
                    <input type="hidden" name="npreguntas" value="<%=npreguntas%>">
                    <input type="hidden" name="id" value="<%=id%>">
                    <input type="hidden" name="idEnrollmentDetails" value="<%=idEnrollmentDetails%>">
             </form>
        </div>
    </body>
</html>
