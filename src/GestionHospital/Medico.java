package GestionHospital;

public class Medico extends Persona implements Evaluable{
	
	private String especialidad;
	private boolean enConsulta = false;
	

	public Medico(String nombre, int edad, String dni, String especialidad) {
		super(nombre, edad, dni);
		setEspecialidad(especialidad);
	}

	
	public boolean isEnConsulta() {
		return enConsulta;
	}
	public void setEnConsulta(boolean enConsulta) {
		this.enConsulta = enConsulta;
	}


	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public void mostrarInfo() {
		System.out.println("Dr./a " + getNombre() + "	| Especialidad: " 
	+ getEspecialidad() + "	| Prioridad: " + calcularPrioridad());
	}
	
	
	@Override
	public String evaluarEstado() {
	    if(enConsulta) {
	        return "Ocupado";
	    } else return "Disponible";
	}
	
	@Override
	public int calcularPrioridad() {
	    if(getEspecialidad().equals("Urgencias")) return 3;
	    if(getEspecialidad().equals("Cardiología")) return 2;
	    if(getEspecialidad().equals("Pediatría")) return 1;
	    return 0;
	}

	
	
	
}
