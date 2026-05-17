package GestionHospital;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

import GestionHospital.Excepciones.*;

public class Hospital {

	private String nombre;
	List<Medico> medicos = new ArrayList<>();
	List<Paciente> pacientes  = new ArrayList<>();
	List<Consulta> consultas  = new ArrayList<>();
	
	Hospital(String nombre){
		setNombre(nombre);
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public void añadirMedicos(Medico medico) {
		if(medicos.stream()
				.anyMatch(m -> m.getDni().equals(medico.getDni()))) {
			throw new MedicoYaExisteException("El medico con DNI " + medico.getDni() + " ya esta registrado.");
		}
		medicos.add(medico);
		System.out.println("Medico " + medico.getNombre() + " añadido.");
	}
	public void eliminarMedicos(Medico medico) {
		if(!medicos.stream()
				.anyMatch(m -> m.getDni().equals(medico.getDni()))) {
			throw new MedicoNoExisteException("El medico no esta registrado.");
		}
		medicos.remove(medico);
		System.out.println("Medico " + medico.getNombre() + " eliminado.");
	}
	public void mostrarMedicos() {
		System.out.println("	-- MEDICOS -- ");
		medicos.stream()
			.forEach(m -> m.mostrarInfo());
		System.out.println("");
	}
	
	
	
	
	public void añadirPacientes(Paciente paciente) {
		if(pacientes.stream()
				.anyMatch(m -> m.getDni().equals(paciente.getDni()))) {
			throw new PacienteYaExisteException("El paciente con DNI " + paciente.getDni() + " ya esta registrado.");
		}
		pacientes.add(paciente);
		System.out.println("Paciente " + paciente.getNombre() + " añadido.");
	}
	public void eliminarPacientes(Paciente paciente) {
		if(!pacientes.stream()
				.anyMatch(m -> m.getDni().equals(paciente.getDni()))) {
			throw new PacienteNoExisteException("El paciente no esta registrado.");
		}
		pacientes.remove(paciente);
		System.out.println("Paciente " + paciente.getNombre() + " eliminado.");
	}
	public void mostrarPacientes() {
		System.out.println("	-- PACIENTES -- ");
		pacientes.stream()
			.forEach(m -> m.mostrarInfo());
		System.out.println("");
	}
	
	
	
	
	public void añadirConsultas(Consulta consulta) {
		consultas.add(consulta);
		consulta.medico.setEnConsulta(true);
		System.out.println("Consulta añadida.");
	}
	public void eliminarConsultas(Consulta consulta) {
		consultas.remove(consulta);
		System.out.println("Consulta eliminada.");
	}
	
	public void mostrarConsultas() {
		System.out.println("	-- CONSULTAS -- ");
		consultas.stream()
		.forEach(m -> m.mostrarConsulta());
	System.out.println("");
	}
	
	
	
	
	public void mayorEdad(int edad) {
		pacientes.stream()
			.filter(p -> p.getEdad() >= edad)
			.forEach(p -> p.mostrarInfo());
	}
	
	public void especialidadMedicos() {
		medicos.stream()
			.sorted((a , b) -> a.getEspecialidad().compareTo(b.getEspecialidad()))
			.forEach(m -> m.mostrarInfo());
	}

	
	
	public void guardarEnFichero(String ruta) {
		try {
			
			List<String> lineas = new ArrayList<>();
			
			 lineas.add("		=== HOSPITAL: " + getNombre() + " ===");
	    	 lineas.add("");
	    	 
	    	 
	    	 lineas.add("			-- MEDICOS -- ");
	    	 for( Medico m : medicos) {
	    		 lineas.add("Dr./a " + m.getNombre() + "	| Especialidad: " 
	    					+ m.getEspecialidad() + "	| Prioridad: " + m.calcularPrioridad());
	    	 }
	    	 lineas.add("");
	    	 
	    	 lineas.add("			-- PACIENTES -- ");
	    	 for( Paciente p : pacientes) {
	    		 lineas.add(p.getNombre() + ", " + p.getEdad() 
	    			+ " años	| Enfermedad: " + p.getEnfermedad() 
	    			+ "	| Estado: " + p.evaluarEstado());
	    	 }
	    	 lineas.add("");
	    	 
	    	 lineas.add("			-- CONSULTAS -- ");
	    	 for( Consulta c : consultas) {
	    		 lineas.add("Consulta: Dr./a " + c.medico.getNombre()
	    			+ " con " + c.paciente.getNombre() +"	| Fecha: " + c.getFecha());
	    	 }
	    	 lineas.add("");
	    	 
			
			
			Files.write(Path.of("E:\\Java\\CursodeJava\\SistemaGestionHospital\\GestionHospital.txt"),
					lineas);
			
		}catch (IOException e) {
			System.out.println("Error: "+ e.getMessage());
		}
	}
	
}
