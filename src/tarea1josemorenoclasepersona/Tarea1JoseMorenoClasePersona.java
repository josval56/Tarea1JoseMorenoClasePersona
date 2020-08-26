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
        
        Persona data,s_data,s_data_name,s_data_name_lastname;
        
        data = new Persona(34454435,"Jesus","Diaz");
        s_data = new Persona(38493223);
        s_data_name = new Persona(38493223,"Ramon");
        s_data_name_lastname= new Persona(34454435,"Jesus","Diaz");
        
        
       data.mostrardata();
       s_data.mostrardata();
       s_data_name.mostrardata();
       s_data_name_lastname.mostrardata();
       
        
        // TODO code application logic here
    }
    
}
