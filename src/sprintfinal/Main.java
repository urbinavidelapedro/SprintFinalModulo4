package sprintfinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {



	public static void main(String[] args) {


		Listado lista = new Listado();

		Profesional profesional1=new Profesional("Martin Carrasco","Cárdenas",LocalDate.of(1992, 12, 25),17345126,"Ingeniero agrónomo","18/07/2000");
		Profesional profesional2=new Profesional("Rafael Martinez","Carrasco",LocalDate.of(1991, 06, 25),14513852,"Ingeniero químico","30/12/2140");
		Administrativo administrativo1=new Administrativo("Carla Manriquez","Soto",LocalDate.of(2000,7,20),19456315,"TI","Alcaldesa");
		Administrativo administrativo2=new Administrativo("Carlos Francisco","Franco",LocalDate.of(1990,4,6),145615456,"Contabilidad","Presidente");
		Cliente cliente1=new Cliente("Maximilian Dood","Cuevas",LocalDate.of(2016,12,10),456123485,"25465463","Habitat",1,"Padre las casas 2121","Santiago", 23);

//		Instancias de prueba
//		Revision revision = new Revision(1,2,"Revision de facturas","facturas con errores",1);
//
//		Accidente accidente1 = new Accidente(12354, "13513511", LocalDate.of(1997, 5, 12),LocalTime.of(5, 0),
//				"En un lugar lejano de toda civilizacion","","Murio" );
//
//		Capacitacion capacitacion1=new Capacitacion(2353,"6545363-5","marté",LocalTime.of(9, 0),"lugar","40",1000);

		
		lista.agregarUsuario(cliente1);
		lista.agregarUsuario(profesional1);
		lista.agregarUsuario(profesional2);
		lista.agregarUsuario(administrativo1);
		lista.agregarUsuario(administrativo2);

		lista.imprimirUsuarios();
	}
}