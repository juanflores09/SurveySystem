package Controlador;

import Beans.User;
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
import javax.servlet.http.HttpSession;

@WebServlet(name = "UserServlet", urlPatterns = {"/UserServlet"})
public class UserServlet extends HttpServlet {

    private User user;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String destino = request.getParameter("destino");
            String acceso = "";
            switch(destino){
                case "salir": acceso = "salir.jsp";
                break;
                case "preguntas": acceso = "Administrativo/Survey.jsp";
                break;
            }
            
            RequestDispatcher destinos = request.getRequestDispatcher(acceso);
            destinos.forward(request, response);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        
        try {
            if(email.trim().length()==0&&password.trim().length()==0){
                RequestDispatcher destino = request.getRequestDispatcher("index.jsp");
                destino.forward(request, response);
            }
            user= DAO.UserDAO.SearchUserByPassword(email, password);
            if(user!=null){
                HttpSession session = request.getSession(true);
                session.setAttribute("usuario",user);
                
                switch(user.getTipoAceso()){
                    case 1: RequestDispatcher destino1 = request.getRequestDispatcher("Administrativo/MenuAdmin.jsp");
                    destino1.forward(request, response);
                    break;
                    
                    case 2:RequestDispatcher destino2 = request.getRequestDispatcher("Docente/MenuDocente.jsp");
                    destino2.forward(request, response);
                    break;
                    
                    case 3: RequestDispatcher destino3 = request.getRequestDispatcher("Estudiante/MenuEstudiante.jsp");
                    destino3.forward(request, response);
                    break;
                }
            }else{
                RequestDispatcher destino = request.getRequestDispatcher("index.jsp");
                destino.forward(request, response);
            }
            
        } catch (Exception ex) {
            Logger.getLogger(UserServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
