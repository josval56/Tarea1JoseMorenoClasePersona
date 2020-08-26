/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea1josemorenoclasepersona;

/**
 *
 * @author Valmore
 */
public class Persona {
    
    int dni;
    String name,lastname;
    
    //Constructor
    public Persona(){
        System.out.println("Creando Datos...");
    }
    
    public Persona(int dni){
     this.dni = dni;
     System.out.println("Creando dni: " + dni);
    }
     public Persona(int dni, String name){
     this.dni = dni;
     this.name = name;
     System.out.println("Creando dni y nombre: " + dni + name);
    }
     public Persona(int dni, String name,String lastname){
     this.dni = dni;
     this.name = name;
     this.lastname = lastname;
     System.out.println("Creando dni, nombre y Apellido: " + dni + name + lastname);
    }
     
     public void mostrardata(){
         System.out.println(dni+name+lastname);
     }
}
