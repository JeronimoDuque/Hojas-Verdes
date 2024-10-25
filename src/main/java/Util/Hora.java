package Util;

import java.time.LocalDate;

public class Hora {
    public static String HoraActual(){
        LocalDate fechaActual = LocalDate.now();
        return fechaActual.toString();
    }
}
