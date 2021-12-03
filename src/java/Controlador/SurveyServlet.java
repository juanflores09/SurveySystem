package Controlador;

import Beans.Survey;
import config.Fecha;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SurveyServlet", urlPatterns = {"/SurveyServlet"})
public class SurveyServlet extends HttpServlet {
    
    private static Survey survey;
    public static List<Survey> surveys = new ArrayList<>();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SurveyServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SurveyServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String destino = request.getParameter("destino");
        String idSurvey = request.getParameter("id");
        String idCourse = request.getParameter("idCourse");
        String idStudent = request.getParameter("idStudent");
        String nameCourse = request.getParameter("nameCourse");
        
        
        String acceso="";
        
        switch(destino){
            
            case "menuCourse":
            acceso = "Estudiante/MenuCourse.jsp";
            request.setAttribute("idCourse", idCourse);
            request.setAttribute("idStudent", idStudent);
            request.setAttribute("nameCourse", nameCourse);
            break;
            
            case "survey": 
            acceso = "Estudiante/SurveyEstudiante.jsp";
            String idEnrollmentDetails = request.getParameter("idEnrollmentDetails");
            request.setAttribute("idEnrollmentDetails", idEnrollmentDetails);
            request.setAttribute("id", idSurvey);
            break;
        }
        RequestDispatcher destinos = request.getRequestDispatcher(acceso);
        destinos.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String title = request.getParameter("SurveyTitle");
        String description = request.getParameter("SurveyDescription");
        String EndDate = request.getParameter("SurveyEndDate");
        String accion = request.getParameter("accion");
        
        switch(accion){
            case "registrar":
                survey = new Survey(title, description, 0, Fecha.getDateTime(), EndDate, 0);
                try {
                    DAO.SurveyDAO.AddSurvey(survey);
                    surveys = DAO.SurveyDAO.findAllSurvey();
                    request.setAttribute("list", surveys);
                } catch (Exception ex) {
                    Logger.getLogger(SurveyServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
            
            RequestDispatcher destino = request.getRequestDispatcher("Administrativo/MenuAdmin.jsp");
            destino.forward(request, response);

        }
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
