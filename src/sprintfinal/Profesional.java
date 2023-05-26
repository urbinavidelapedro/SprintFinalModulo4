package sprintfinal;

import java.time.LocalDate;

public class Profesional extends Usuario{
	
	String titulo, fechaIngreso;
	
	
	public Profesional() {
		
	}


	public Profesional(String nombre, String apellido, LocalDate fechaNacimiento, int run, String titulo, String fechaIngreso) {
		super(nombre, apellido, fechaNacimiento, run);
		this.titulo=titulo;
		this.fechaIngreso=fechaIngreso;
		// TODO Auto-generated constructor stub
	}

	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: "+ titulo + ", Fecha ingreso: " + fechaIngreso + "\n");
	}
	
}
