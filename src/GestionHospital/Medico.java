package GestionHospital;

public class Medico extends Persona{
	
	private String especialidad;
	

	public Medico(String nombre, int edad, String dni, String especialidad) {
		super(nombre, edad, dni);
		setEspecialidad(especialidad);
	}

	
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}

	
	
	
	
	
	
	
	
	
	
	
}
