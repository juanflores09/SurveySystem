package Controlador;

import Beans.Survey;
import Beans.Survey_Enrollment;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "SurveyEstServlet", urlPatterns = {"/SurveyEstServlet"})
public class SurveyEstServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SurveyEstServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SurveyEstServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            
            String accion = request.getParameter("accion");
            
            switch(accion){
                case "calcular": {
                    String npreguntas = request.getParameter("npreguntas");
                    String id = request.getParameter("id");
                    String idEnrollmentDetails = request.getParameter("idEnrollmentDetails");
                    int idEnrollmentDetails1= Integer.parseInt(idEnrollmentDetails);
                    float npreguntas1 = Float.parseFloat(npreguntas);
                    float suma =0;
                    float score;
                    for (int i = 0; i < Integer.parseInt(npreguntas); i++) {
                    String puntaje = request.getParameter("btn-rd"+i);
                        switch(puntaje){
                            case "1": suma+=1;break;
                            case "2": suma+=2;break;
                            case "3": suma+=3;break;
                            case "4": suma+=4;break;
                            case "5": suma+=5;break;
                        }
                    }
                score = suma/npreguntas1;
                    try {
                        DAO.SurveyEnrollmentDAO.AnswerSurvey(1, idEnrollmentDetails1, score);
                        RequestDispatcher destino = request.getRequestDispatcher("Estudiante/MenuEstudiante.jsp");
                        destino.forward(request, response);
                    } catch (Exception ex) {
                        Logger.getLogger(SurveyEstServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
