package GestionHospital.Excepciones;

public class EdadInvalidaException extends RuntimeException{
	public EdadInvalidaException (String mensaje) {
		super(mensaje);
	}
}
