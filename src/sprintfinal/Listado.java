package sprintfinal;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;

public class Listado {
	List<Usuario> usuarios=new ArrayList<>();
	
	
	public void agregarUsuario(Usuario usuario) {
		usuarios.add(usuario);
	}
	
	public void imprimirUsuarios() {
		for (Usuario usuario : usuarios) {
			usuario.analizarUsuario();
		}
	}


	
}	
