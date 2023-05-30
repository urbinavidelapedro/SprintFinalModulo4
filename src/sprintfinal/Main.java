package sprintfinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Cliente cliente;
		Contenedor contenedor = new Contenedor();
		String nombre,apellido,tipoUsuario,telefono,direccion,comuna,afp;
		LocalDate fechaNacimiento;
		LocalTime hora;
		int opcion,run,dia,mes,año,sistemaSalud,edad;
		opcion=desplegarMenu();
		do {
			switch(opcion) {
			case 1:
				cliente=new Cliente();
				System.out.println("Almacenando cliente");
				System.out.println("Ingrese un nombre");
				nombre=sc.nextLine();
				cliente.setNombre(nombre);
				System.out.println("Ingrese un apellido");
				apellido=sc.nextLine();
				cliente.setApellido(apellido);
				System.out.println("Ingrese un rut");
				
				System.out.println("Fecha de nacimiento");
				System.out.println("Ingrese un día");
				dia=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un mes");
				mes=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese un año");
				año=sc.nextInt();
				sc.nextLine();
				cliente.setFechaNacimiento(dia,mes,año);
				System.out.println("Ingrese un teléfono");
				telefono=sc.nextLine();
				System.out.println("Ingrese AFP");
				afp=sc.nextLine();
				System.out.println("Ingrese sistema de salud");
				sistemaSalud=sc.nextInt();
				sc.nextLine();
				System.out.println("Ingrese dirección");
				direccion=sc.nextLine();
				System.out.println("Ingrese una comuna");
				comuna=sc.nextLine();
				System.out.println("Ingrese una edad");
				edad=sc.nextInt();
				sc.nextLine();
				contenedor.almacenarCliente(cliente);
				opcion=desplegarMenu();
				break;
			case 2:
				System.out.println("Almacenando profesional");
				contenedor.almacenarProfesional(null);
				opcion=desplegarMenu();
				break;
			case 3:
				System.out.println("Almacenando administrativo");
				contenedor.almacenarAdministrativo(null);
				opcion=desplegarMenu();
				break;
			case 4:
				System.out.println("Almacenando capacitacion");
				contenedor.almacenarCapacitacion(null);
				opcion=desplegarMenu();
				break;
			case 5:
				System.out.println("Ingrese un rut para eliminar");	
				run=sc.nextInt();
				sc.nextLine();
				contenedor.eliminarUsuario(run);
				opcion=desplegarMenu();
				break;
			case 6:
				System.out.println("Listando usuarios");
				contenedor.listarUsuarios();
				opcion=desplegarMenu();
				break;
			case 7:
				System.out.println("Ingrese un tipo de usuario (Cliente, Profesional o Administrativo)");
				tipoUsuario=sc.nextLine();
				contenedor.listarUsuarioPorTipo(tipoUsuario);
				opcion=desplegarMenu();
				break;
			case 8:
				System.out.println("Listando capacitaciones");
				contenedor.listarCapacitaciones();
				opcion=desplegarMenu();
				break;
			case 9: 
				System.out.println("Finalizando programa");
				System.exit(0);
		}
		} while (opcion!=9);
	}
	
	private static int desplegarMenu() {
		Scanner sc=new Scanner(System.in);
		int opcion;
		
		System.out.println("----------MENU PRINCIPAL----------\n");
		System.out.println("1- Almacenar cliente");
		System.out.println("2- Almacenar profesional");
		System.out.println("3- Almacenar administrativo");
		System.out.println("4- Almacenar capacitación");
		System.out.println("5- Eliminar usuario");
		System.out.println("6- Listar usuarios");
		System.out.println("7- Listar usuarios por tipo");
		System.out.println("8- Listar capacitaciones");
		System.out.println("9- Salir");
		System.out.println("Ingrese una opción:");
		opcion=sc.nextInt();
		sc.nextLine();
		return opcion;
	}
	
}