package GestionHospital;

public class Paciente extends Persona implements Evaluable{
	
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

	public void mostrarInfo() {
		System.out.println(getNombre() + ", " + getEdad() 
		+ " años	| Enfermedad: " + getEnfermedad() 
		+ "	| Estado: " + evaluarEstado());
	}
	
	
	
	@Override
	public String evaluarEstado() {
	    if(getEnfermedad().equals("Parada")) return "Crítico";
	    if(getEnfermedad().equals("Diabetes")) return "Grave";
	    if(getEnfermedad().equals("Gripe")) return "Leve";
	    return "Nada";
	}
	
	@Override
	public int calcularPrioridad() {
	    if(getEnfermedad().equals("Crítico")) return 3;
	    if(getEnfermedad().equals("Grave")) return 2;
	    if(getEnfermedad().equals("Leve")) return 1;
	    return 0;
	}
	
	
	
	
	
	
	
}
