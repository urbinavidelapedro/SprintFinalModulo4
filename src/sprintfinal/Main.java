package sprintfinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Main {
	
	
	
	public static void main(String[] args) {

		
		Listado lista = new Listado();
		
		Profesional profesional1=new Profesional("Martin","23/09/1996","17345126","Ingeniero agrónomo","18/07/2000");
		Profesional profesional2=new Profesional("Rafael","25/06/1991","14513851","Ingeniero químico","30/12/2140");
		Administrativo administrativo1=new Administrativo("Carla","02/02/1992","164264354","TI","Alcaldesa");
		Administrativo administrativo2=new Administrativo("Carlos","04/06/1990","145615456","Contabilidad","Presidente");
		Cliente cliente1=new Cliente("Max","10/12/2016","4561234856");
		Accidente accidente1 = new Accidente(12354, "13513511", LocalDate.of(1997, 5, 12),LocalTime.of(5, 0),
				"En un lugar lejano de toda civilizacion",	"", "Murio" );
		
				
		
		lista.agregarUsuario(cliente1);
		lista.agregarUsuario(profesional1);
		lista.agregarUsuario(profesional2);
		lista.agregarUsuario(administrativo1);
		lista.agregarUsuario(administrativo2);
		
		
		lista.imprimirUsuarios();
		
		//Comprobacion
		System.out.println("Identificador: " +accidente1.getIdAccidente() +", Rut: "+accidente1.getRutCliente()+
				", Día: "+accidente1.getDia().getDayOfMonth() +"/"+accidente1.getDia().getMonthValue()+"/"
				+accidente1.getDia().getYear() + 
				", Hora: "+accidente1.getHora()+", Lugar: "+accidente1.getLugar()+", Origen: "
				+accidente1.getOrigen()+", Consecuencias: "+accidente1.getConsecuencias());		
		
	}

}
