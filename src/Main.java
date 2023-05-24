package TrabajoGrupal16;

public class Main {

	public static void main(String[] args) {

		
		Listado lista = new Listado();
		
		Profesional profesional1=new Profesional("Martin","23/09/1996","17345126","Ingeniero agrónomo","18/07/2000");
		Profesional profesional2=new Profesional("Rafael","25/06/1991","14513851","Ingeniero químico","30/12/2140");
		Administrativo administrativo1=new Administrativo("Carla","02/02/1992","164264354","TI","Alcaldesa");
		Administrativo administrativo2=new Administrativo("Carlos","04/06/1990","145615456","Contabilidad","Presidente");
		Cliente cliente1=new Cliente("Max","10/12/2016","4561234856");
		
		
		lista.agregarUsuario(cliente1);
		lista.agregarUsuario(profesional1);
		lista.agregarUsuario(profesional2);
		lista.agregarUsuario(administrativo1);
		lista.agregarUsuario(administrativo2);
		
		lista.imprimirUsuarios();
	}

}
