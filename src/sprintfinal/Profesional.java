package sprintfinal;

public class Profesional extends Usuario{
	
	String titulo, fechaIngreso;
	
	
	public Profesional(String nombre, String apellido, String run, String titulo, String fechaIngreso) {
		super(nombre, apellido);
		this.titulo=titulo;
		this.fechaIngreso=fechaIngreso;
		// TODO Auto-generated constructor stub
	}

	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: "+ titulo + ", Fecha ingreso: " + fechaIngreso + "\n");
	}
	
}
