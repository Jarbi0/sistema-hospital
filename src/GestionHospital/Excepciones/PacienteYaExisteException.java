package GestionHospital.Excepciones;


public class PacienteYaExisteException extends RuntimeException{
		public PacienteYaExisteException (String mensaje) {
			super(mensaje);
		}
	}