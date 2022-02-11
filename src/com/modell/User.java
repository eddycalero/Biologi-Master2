/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.modell;

/**
 *
 * @author Eddy
 */
public class User {

    private String Password;
    private String Nombre;
    
    public User(){
        Nombre = "nn";
        Password = "nn";
    }

    public User(String Password, String Nombre) {
        this.Password = Password;
        this.Nombre = Nombre;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String ID) {
        this.Nombre = ID;
    }
    
    @Override
    public String toString(){
        return "\nNombre" + Nombre + "\nPassword" + Password;
    }
    public int getTamano(){
        return getNombre().length()*2+2+4+1;
    }

}
