<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page import="config.Conexion"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte de encuesta</title>
    </head>
    <body>
        
        <%
            Connection con = Conexion.getConexion();

            File reportFile=new File(application.getRealPath("/Reportes/ReportSurvey.jasper"));
            Map parametros=new HashMap();
            
            byte[] bytes=JasperRunManager.runReportToPdf(reportFile.getPath(), parametros,con);
            response.setContentType("application/pdf");
            response.setContentLength(bytes.length);
            
            ServletOutputStream output=response.getOutputStream();
            response.getOutputStream();
            output.write(bytes,0,bytes.length);
            output.flush();
            output.close();
         %>
    </body>
</html>
