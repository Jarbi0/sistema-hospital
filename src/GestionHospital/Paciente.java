package GestionHospital;

public class Paciente extends Persona{
	
	private String enfermedad;

	public Paciente(String nombre, int edad, String dni, String enfermedad) {
		super(nombre, edad, dni);
		setEnfermedad(enfermedad);
	}
	

	public String getEnfermedad() {
		return enfermedad;
	}
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
