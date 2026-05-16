package GestionHospital;

import GestionHospital.Excepciones.*;

public class Main {

    public static void main(String[] args) {
    	
    	
    	  
    	  
    	  
    	  
        try {
        	Persona a = new Persona("Juan", 23, "29363557N");       
            a.mostrarInfo();
            
                   
        } catch (NombreInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (DniInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        
    }
}