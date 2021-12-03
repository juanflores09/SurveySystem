package config;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Calendar;

public class Fecha {
    
    public static Calendar calendar=Calendar.getInstance();
    private static String fecha;

    public Fecha() {
    }
    
    public static String Fecha(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }
    
    public static String FechaDB(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        fecha = sdf.format(calendar.getTime());
        return fecha;
    }
    
    public static String getDateTime(){
        
        LocalDate fechaActual = LocalDate.now();
        LocalTime horaActual = LocalTime.now();
        return (fechaActual.toString() +" "+ horaActual.toString());
    }
    public static void main(String[] args) {
        System.out.println(getDateTime());
    }
}
