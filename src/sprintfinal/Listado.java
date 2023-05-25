package sprintfinal;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Listado {
	private LocalDate fechaNacimiento;
	private String nombre, apellido, telefono, afp, direccion,comuna;
	private int run,edad,sistemaSalud;
	List<Usuario> usuarios=new ArrayList<>();
	
	
	Usuario cliente=new Cliente(nombre,apellido,fechaNacimiento,run,telefono, afp, sistemaSalud,
			direccion,comuna,edad);
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void imprimirUsuarios() {
		for (Usuario usuario : usuarios) {
			usuario.analizarUsuario();
		}
	}


	
}	
