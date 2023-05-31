package sprintfinal;

import java.time.LocalDate;

public class Profesional extends Usuario{
	
	String titulo;
	LocalDate fechaIngreso;
	
	public Profesional() {
		
	}


	public Profesional(String nombre, String apellido, LocalDate fechaNacimiento, int run, String titulo, LocalDate fechaIngreso) {
		super(nombre, apellido, fechaNacimiento, run);
		this.titulo=titulo;
		this.fechaIngreso=fechaIngreso;
	}
	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: "+ titulo + ", Fecha ingreso: " + fechaIngreso + "\n");
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		while(titulo.length()<10 || titulo.length()>50) {
			System.out.println("El título debe tener entre 10 y 50 caracteres");
			titulo=sc.nextLine();
		}
		this.titulo = titulo;
	}


	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(int dia, int mes, int anio) {
		this.fechaIngreso=LocalDate.of(dia, mes, anio);
	}

	public String listarProfesional() {
		return super.toString()+" Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}