package GestionHospital;
import GestionHospital.Excepciones.*;

public class Persona {
	
	private String nombre;
	private int edad;
	private String dni;
	
	
	public Persona (String nombre , int edad , String dni) {
		setNombre(nombre);
		setEdad(edad);
		setDni(dni);
		
	}
	

	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(!nombre.isEmpty()) {
			this.nombre = nombre;
		}else throw new NombreInvalidoException("Nombre incorrecto");
	}
	
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		if (edad < 120 && edad > 0) {	
			this.edad = edad;
		}else throw new EdadInvalidaException("La edad no entra en los parametros");
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		if(!dni.isEmpty() && dni.length() == 9 &&
				Character.isDigit(dni.charAt(0)) &&
			    Character.isDigit(dni.charAt(1)) &&
			    Character.isDigit(dni.charAt(2)) &&
			    Character.isDigit(dni.charAt(3)) &&
			    Character.isDigit(dni.charAt(4)) &&
			    Character.isDigit(dni.charAt(5)) &&
			    Character.isDigit(dni.charAt(6)) &&
			    Character.isDigit(dni.charAt(7)) &&
			    Character.isLetter(dni.charAt(8))
				) {
			this.dni = dni;
		}else throw new DniInvalidoException("DNI incorrecto");
	}
	
	
	public void mostrarInfo() {
		System.out.println(getNombre() + ", " + getEdad() + " años. DNI: " + getDni());
	}
	
	
	



}
