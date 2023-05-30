package sprintfinal;

import java.util.ArrayList;
import java.util.List;

public class Contenedor {
	private List<Object> usuarios = new ArrayList<>();
	private List<Capacitacion> capacitaciones=new ArrayList<>();
	
	public Contenedor() {
		
	}

	public Contenedor(List<Object> usuarios, List<Capacitacion> capacitaciones) {
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
		for (Object usuario : usuarios) {
			Usuario usuario1 = (Usuario)usuario;
			if(usuario1.getRun()==(run)) {
				usuarios.remove(usuario);
				break;
			}
		}
	}
	
	public void listarUsuarios() {
		for (Object obj : usuarios) {
			Usuario usuario1=(Usuario)obj;
			System.out.println(usuario1.toString());
		}
	}
	
	public void listarUsuarioPorTipo(String tipoUsuario) {
		switch(tipoUsuario) {
			case "Administrativo":
				for(Object obj:usuarios) {
					if(obj instanceof Administrativo) {
						Administrativo administrativo = (Administrativo) obj;
						System.out.println(administrativo.toString());
					}
				}
				break;
			case "Profesional":
				for(Object obj:usuarios) {
					if(obj instanceof Profesional) {
						Profesional profesional = (Profesional) obj;
						System.out.println(profesional.toString());
					}
				}
				break;
			case "Cliente":
				for(Object obj:usuarios) {
					if(obj instanceof Cliente) {
						Cliente cliente = (Cliente) obj;
						System.out.println(cliente.toString());
					}
				}
				break;
		}
	}
	
	public void listarCapacitaciones() {
		for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion.toString());
		}
	}
}
