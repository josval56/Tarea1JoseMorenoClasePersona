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
public class Tarea1JoseMorenoClasePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Creamos los Objeto de clase Persona. 
        Persona data,s_data,s_data_name,s_data_name_lastname,s_data_name_lastname_edad;
        
        //Instanciamos los Objetos segun las consignas.
        data = new Persona();
        s_data = new Persona(38493223);
        s_data_name = new Persona(38493223,"Ramon");
        s_data_name_lastname = new Persona(34454435,"Jesus","Diaz");
        s_data_name_lastname_edad = new Persona(36478293,"Ruben","Azuaje",56);
        
        //Aplicamos el metodo en cada uno de los objetos.
       data.mostrardata();
       s_data.mostrardata();
       s_data_name.mostrardata();
       s_data_name_lastname.mostrardata();
       s_data_name_lastname_edad.mostrardata();
       
        
        // TODO code application logic here
    }
    
}
