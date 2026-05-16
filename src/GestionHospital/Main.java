package GestionHospital;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import GestionHospital.Excepciones.*;

public class Main {

    public static void main(String[] args) {
    	
    	
    	  
    	  
    	  
    	  
        try {
        	Persona a = new Persona("Juan", 23, "12346478N");       
            a.mostrarInfo();
            Hospital.mostrarMedicos();
                   
        } catch (NombreInvalidoException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }catch (DniInvalidoException e) {
            System.out.println("Error: " + e.getMessage());


        } catch (MedicoYaExisteException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (MedicoNoExisteException e) {
            System.out.println("Error: " + e.getMessage());
        }
    

    
    
    
    
    
	try {
		if(!Files.exists(Path.of("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt"))) {
			Files.createFile(Path.of("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt"));
		}
		
	}catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
	}
	
	
	
	

    }
}