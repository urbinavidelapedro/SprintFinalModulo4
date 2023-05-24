package sprintfinal;

import java.util.List;
import java.util.ArrayList;

public class Listado {
	private String idCliente, nombre, apellido;
	List<Usuario> usuarios=new ArrayList<>();
	
	
	Usuario cliente=new Cliente(idCliente,nombre,apellido);
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void imprimirUsuarios() {
		for (Usuario usuario : usuarios) {
			usuario.analizarUsuario();
		}
	}
	
}	
