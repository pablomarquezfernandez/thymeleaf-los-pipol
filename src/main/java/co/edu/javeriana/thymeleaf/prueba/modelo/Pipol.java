package co.edu.javeriana.thymeleaf.prueba.modelo;

public class Pipol {

	private String nombre;
	private String apellido;
	private String documento;
	
	
	
	public Pipol(String nombre, String apellido, String documento) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getDocumento() {
		return documento;
	}
	
	
	
}
