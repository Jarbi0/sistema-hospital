package GestionHospital;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import GestionHospital.Excepciones.*;

public class Main {

    public static void main(String[] args) {
    	
    	Hospital sanmames = new Hospital("SanMames");
    	
    	  System.out.println("	=== HOSPITAL: " + sanmames.getNombre() + " ===");
    	  System.out.println("");
    	  
    	  
        try {
        	
      
        	Medico andrescardiologo = new Medico("Andres", 42, "91452875L", "Cardiología"); 
        	Medico MariaPediatría  = new Medico("Maria", 36, "67049508T", "Pediatría");
        	Paciente anaDiabetes = new Paciente("Ana", 68, "43980425P", "Diabetes"); 
        	Paciente PedroGripe = new Paciente("Pedro", 5, "49075806O", "Gripe"); 
        	Consulta c1 = new Consulta(andrescardiologo, anaDiabetes, "12/05/2026");
        	Consulta c2 = new Consulta(MariaPediatría, PedroGripe, "13/05/2026");
        	
        	
        	
        	sanmames.añadirMedicos(andrescardiologo);
        	sanmames.añadirMedicos(MariaPediatría);
        	
        	sanmames.añadirPacientes(anaDiabetes);
        	sanmames.añadirPacientes(PedroGripe);
        	
        	sanmames.añadirConsultas(c1);
        	sanmames.añadirConsultas(c2);
        	
        	sanmames.mostrarMedicos();
        	sanmames.mostrarPacientes();
        	sanmames.mostrarConsultas();
        	
        	
                   
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
		//Files.delete(Path.of("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt"));

		if(!Files.exists(Path.of("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt"))) {
			Files.createFile(Path.of("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt"));
		}
		sanmames.guardarEnFichero("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt");
		
		
	}catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
	}
	
	
	
	

    }
}