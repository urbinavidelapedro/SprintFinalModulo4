package sprintfinal;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
	private List<IAsesoria> usuarios=new ArrayList<>();
	private List<Capacitacion> capacitaciones=new ArrayList<>();
	
	public Contenedor() {
		
	}

	public Contenedor(List<IAsesoria> usuarios, List<Capacitacion> capacitaciones) {
		this.usuarios = usuarios;
		this.capacitaciones = capacitaciones;
	}
	
	public void almacenarCliente(Cliente cliente) {
		usuarios.add(cliente);
	}
	
	public void almacenarProfesional(Profesional profesional) {
		usuarios.add(profesional);
	}
	
	public void almacenarAdministrativo(Administrativo administrativo) {
		usuarios.add(administrativo);
	}
	
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}
	
	public void eliminarUsuario(int run) {
		for (Usuario usuario : usuarios) {
			if(usuario.getRun()==run) {
				usuarios.remove(usuario);
			}
		}
	}
	
	public void listarUsuarios() {
		for (Usuario usuario : usuarios) {
			System.out.println(usuario.toString());			
		}
	}
	
	public void listarUsuarioPorTipo(String tipoUsuario) {
		switch (tipoUsuario) {
		case "Administrativo":
			for (Administrativo administrativo : usuarios) {
				
			}
		}
	}
	
}
