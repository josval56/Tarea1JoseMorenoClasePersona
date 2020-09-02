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
    
    int dni,edad;
    String name,lastname;
    
    //Constructor por defecto
    public Persona(){
     this.dni = dni;
     this.name = "";
     this.lastname = "";
     this.edad = edad;
     
    }
    
    // Contructor DNI
    public Persona(int dni){
     this();
     this.dni = dni;
    }
    
    // Contructor DNI, Nombre
     public Persona(int dni,String name){
     this(dni);
     this.name = name;
     }
     
     // Contructor DNI, Nombre, Apellido
     public Persona(int dni,String name,String lastname){
     this(dni,name);
     this.lastname = lastname;
     
    }
     public Persona(int dni,String name,String lastname,int edad){
     this(dni,name,lastname);
     this.edad= edad;
     }
     
     
     
     // Metodo que muestra los datos.
     public void mostrardata(){
         if(dni !=0 && edad != 0){
         System.out.println(dni+ " " + name + " " + lastname + "  " + edad);
         }else{
             System.out.println(" " + name + " " + lastname );
         }
     }
     
    }
