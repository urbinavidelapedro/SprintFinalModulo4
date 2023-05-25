package sprintfinal;


public class Usuario implements IAsesoria{
	String nombre, apellido;

	public Usuario(String nombre, String apellido) {
		this.nombre=nombre;
		this.apellido=apellido;
	}
	
	public void analizarUsuario() {
		System.out.println("Nombre usuario: "+nombre);
	}
	
	public void mostrarEdad() {
		
	}
}
