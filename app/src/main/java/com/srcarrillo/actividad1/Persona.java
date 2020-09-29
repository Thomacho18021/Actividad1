package com.srcarrillo.actividad1;

public class Persona {
    String Nombre;
    String Correo;
    String Exp;
    //String Años;
    //String Intereses;

    public Persona(String Nombre, String Correo, String Exp) {
        this.Nombre = Nombre;
        this.Correo = Correo;
        this.Exp = Exp;
        //this.Años = Años;
        //this.Intereses = Intereses;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = Nombre;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        this.Correo = Correo;
    }

    public String getExp() {
        return Exp;
    }

    public void setExp(String exp) {
        this.Exp = Exp;
    }

    /*public String getAños() {
        return Años;
    }

    public void setAños(String años) {
        this.Años = Años;
    }

    public String getIntereses() {
        return Intereses;
    }

    public void setIntereses(String intereses) {
        this.Intereses = Intereses;
    }*/
}
