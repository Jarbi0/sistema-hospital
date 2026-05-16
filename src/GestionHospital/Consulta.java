package GestionHospital;

import GestionHospital.Excepciones.*;

public class Consulta {
	Medico medico;
	Paciente paciente;
	private String fecha;


	
	
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		if(fecha.length() == 10 && 
				Character.isDigit(fecha.charAt(0)) &&
				Character.isDigit(fecha.charAt(1)) &&
				fecha.charAt(2) == '/' && 
				Character.isDigit(fecha.charAt(3)) &&
				Character.isDigit(fecha.charAt(4)) &&
				fecha.charAt(5) == '/' &&
				Character.isDigit(fecha.charAt(6)) &&
				Character.isDigit(fecha.charAt(7)) &&
				Character.isDigit(fecha.charAt(8)) &&
				Character.isDigit(fecha.charAt(9))
				) {
			this.fecha = fecha;
		} else throw new FechaInvalidaException("Fecha incorrecta, formato: DD/MM/AAAA");
	}




	public void mostrarConsulta() {
		System.out.println("Consulta: " + medico.getNombre() + " con " + paciente.getNombre() +" | Fecha: " + getFecha());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
