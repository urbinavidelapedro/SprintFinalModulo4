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
	/**
	 * Atributo de tipo Lista que almacena objetos de la clase IAsesoria en donde se almacenarán los usuarios
	 */
	private List<IAsesoria> usuarios = new ArrayList<>();
	/**
	 * Atributo de tipo Lista que almacena objetos de la clase Capacitacion en donde se almacenan las capacitaciones
	 */
	private List<Capacitacion> capacitaciones=new ArrayList<>();
	/**
	 * Constructor sin parámetros
	 */
	public Contenedor() {
		
	}
	/**
	 * Constructor con todos los atributos de Contenedor como parámetros
	 * @param usuarios ArrayList que contiene objetos de tipo IAsesoria para almacenar usuarios
	 * @param capacitaciones ArrayList que contiene objetos de tipo capacitación 
	 */
	public Contenedor(List<IAsesoria> usuarios, List<Capacitacion> capacitaciones) {
		this.usuarios = usuarios;
		this.capacitaciones = capacitaciones;
	}
	/**
	 * Método que añade un objeto de tipo Cliente a la lista de usuarios
	 * @param cliente De tipo Cliente, es el cliente que se va a añadir a la lista de usuarios
	 */
	public void almacenarCliente(Cliente cliente) {
		usuarios.add(cliente);
	}
	/**
	 * Método que añade un objeto de tipo Profesional a la lista de usuarios
	 * @param profesional Objeto Profesional que se añadirá a la lista de usuarios
	 */
	public void almacenarProfesional(Profesional profesional) {
		usuarios.add(profesional);
	}
	/**
	 * Método que añade un objeto de tipo Administrativo a la lista de usuarios
	 * @param administrativo Objeto Administrativo que se añadirá a la lista de usuarios
	 */
	public void almacenarAdministrativo(Administrativo administrativo) {
		usuarios.add(administrativo);
	}
	/**
	 * Método que almacena una capacitación en la lista de capacitaciones
	 * @param capacitacion De tipo capacitación, se añadirá en la lista de capacitaciones
	 */
	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}
	/**
	 * Método que elimina un usuario de la lista de usuarios
	 * @param run De tipo int, es el número con el que se identificará el usuario a eliminar
	 */
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
	/**
	 * Método que lista los usuarios existentes en la lista de usuarios. Valida además con un mensaje por consola si es que no existen usuarios
	 */
	public void listarUsuarios() {
		if(usuarios.isEmpty()) {
			System.out.println("No se han ingresado usuarios");
		}
		for (Object obj : usuarios) {
			Usuario usuario1=(Usuario)obj;
			System.out.println(usuario1.toString());
		}
	}
	/**
	 * 
	 * Método que lista todos los tipos de usuarios coincidentes con el parámetro entregado
	 * @param tipoUsuario De tipo String, es la cadena que evaluará que tipo de usuario se tiene que imprimir
	 */
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
	/**
	 * Método que lista las capacitaciones en la lista de capacitaciones. En caso de no haber, imprime el mensaje en pantalla correspondiente
	 */
	public void listarCapacitaciones() {
		if(capacitaciones.size() <= 0) {
			System.out.println("No se han ingresado capacitaciones");
		}else for (Capacitacion capacitacion : capacitaciones) {
			System.out.println(capacitacion.toString());
		}
	}
}
