package sprintfinal;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Clase Contenedor, genera objeto de tipo contenedor, contiene las lista de usuario y capacitaciones
 * ademas de los métodos requeridos en la clase principal main. 
 * 
 */
public class Contenedor {
	private List<IAsesoria> usuarios = new ArrayList<>();
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
		boolean usuarioEliminado=false;
		for (Object usuario : usuarios) {
			Usuario usuario1 = (Usuario)usuario;
			if(usuario1.getRun()==(run)) {
				usuarios.remove(usuario);
				System.out.println("Se ha eliminado el usuario con el rut "+run);
				usuarioEliminado=true;
				break;
			}
		}
		if(!usuarioEliminado) {
			System.out.println("No existe un usuario con el run "+run+"");
		}
		
	}
	
	public void listarUsuarios() {
		if(usuarios.isEmpty()) {
			System.out.println("No se han ingresado usuarios");
		}
		for (Object obj : usuarios) {
			Usuario usuario1=(Usuario)obj;
			System.out.println(usuario1.toString());
		}
	}
	
	public void listarUsuarioPorTipo(String tipoUsuario) {
		switch(tipoUsuario) {
			case "Administrativo":
				boolean hayAdministrativo=false;
				for(Object obj:usuarios) {
					if(obj instanceof Administrativo) {
						Administrativo administrativo = (Administrativo) obj;
						System.out.println(administrativo.listarAdministrativo());
						hayAdministrativo=true;
					}
				}
				if(!hayAdministrativo) {
					System.out.println("No existen administrativos para listar");
				}
				break;
			case "Profesional":
				boolean hayProfesional=false;
				for(Object obj:usuarios) {
					if(obj instanceof Profesional) {
						Profesional profesional = (Profesional) obj;
						System.out.println(profesional.listarProfesional());
						hayProfesional=true;
					}
				}
				if(!hayProfesional) {
					System.out.println("No existen profesionales para listar");
				}
				break;
			case "Cliente":
				boolean hayCliente=false;
				for(Object obj:usuarios) {
					if(obj instanceof Cliente) {
						Cliente cliente = (Cliente) obj;
						System.out.println(cliente.listarCliente());
						hayCliente=true;
					}
				}
				if(!hayCliente) {
					System.out.println("No existen clientes para listar");
				}
				break;
		}
	}
	
	public void listarCapacitaciones() {
		if(capacitaciones.size() <= 0) {
			System.out.println("No se han ingresado capacitaciones");
		}else for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion.toString());
		}
	}
}
