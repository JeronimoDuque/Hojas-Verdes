package com.urbanizacion;

import Personas.ControladorEmpleado;

public class Main {
    public static void main(String[] args) {
        /*
        Home newframe = new Home();

        newframe.setVisible(true);
        */
        if(ControladorEmpleado.autenticar("1040871917", "1040871917")){
            System.out.println("correcto");
        }
    }
}