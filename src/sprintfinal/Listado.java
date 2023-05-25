package sprintfinal;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Listado {
	private LocalDate fechaNacimiento;
	private String idCliente, nombre, apellido;
	private int run;
	List<Usuario> usuarios=new ArrayList<>();
	
	
	Usuario cliente=new Cliente(nombre,apellido,fechaNacimiento,run, idCliente);
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void imprimirUsuarios() {
		for (Usuario usuario : usuarios) {
			usuario.analizarUsuario();
		}
	}


	
}	
