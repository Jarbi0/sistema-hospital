package GestionHospital;

import java.util.ArrayList;
import java.util.List;

import GestionHospital.Excepciones.*;

public class Hospital {

	private String nombre;
	List<Medico> medicos = new ArrayList<>();
	List<Paciente> pacientes  = new ArrayList<>();
	List<Consulta> consultas  = new ArrayList<>();
	
	
	
	
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
		System.out.println("Medicos del hospital " + getNombre());
		medicos.stream()
			.forEach(m -> System.out.println("- " + m));
	}
	
	
	public void añadirPacientes() {
		
	}
	public void eliminarPacientes() {
		
	}
	public void mostrarPacientes() {
		
	}
	
	
	public void añadirConsultas() {
		
	}
	public void eliminarConsultas() {
		
	}
	public void mostrarConsultas() {
		
	}
	
	
	public void mayorEdad(int edad) {
		pacientes.stream()
			.filter(p -> p.getEdad() >= edad)
			.forEach(p -> System.out.println(p));
	}
	
	public void especialidadMedicos() {
		medicos.stream()
			.sorted((a , b) -> a.getEspecialidad().compareTo(b.getEspecialidad()))
			.forEach(m -> m.mostrarInfo());
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
}
