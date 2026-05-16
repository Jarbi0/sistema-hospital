package GestionHospital;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	
	
	public Persona (String nombre , int edad , String dni) {
		setNombre(nombre);
		setEdad(edad);
		setDni(dni);
		
	}
	
	public void getNombre() {
		return nombre;
	}
	public String setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void getEdad() {
		return edad;
	}
	public String setEdad(int edad) {
		this.edad = edad;
	}
	
	public void getDni() {
		return dni;
	}
	public String setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
