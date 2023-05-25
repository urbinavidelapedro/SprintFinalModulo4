package sprintfinal;

import java.util.Scanner;

public class Cliente extends Usuario{
	private String telefono,afp,direccion, comuna;
	private int sistemaSalud, edad;
	

	public Cliente(String nombre, String apellido, int run, String telefono,
			String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		
				
		//agregar run de usuario
		super(nombre, apellido);
		Scanner sc = new Scanner (System.in);
		while(telefono.isEmpty()) {
			System.out.println("Favor Ingrese un teléfono válido");
			telefono = sc.nextLine();
		}
		this.telefono = telefono;
		while (afp.length()<4 || afp.length()>30) {
			System.out.println("Afp debe tener minimo 4 caracteres y maximo 30");
			afp = sc.nextLine();
		}
		this.afp = afp;
		while(sistemaSalud != 1 || sistemaSalud != 2) {
			System.out.println("Debe ingresar opcion 1 para fonasa o 2 para isapre");
			sistemaSalud=sc.nextInt();
			sc.nextLine();
		}
		this.sistemaSalud= sistemaSalud;
		
		while(direccion.length()>70) {
			System.out.println("Direccion debe tener como maximo 70 caracteres");
			direccion = sc.nextLine();
		}
		this.direccion = direccion;
		
		while(comuna.length()>50) {
			System.out.println("Comuna debe tener como maximo 50 caracteres");
			comuna = sc.nextLine();
		}
		this.comuna = comuna;
		
		while (edad < 0 || edad > 150) {
			System.out.println("Edad debe ir de 0 a 150 años");
			edad = sc.nextInt();
			sc.nextLine();
		}
		this.edad = edad;
		
		
		
		
	}
	
	@Override
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Direccion: "+direccion+", Comuna:" +comuna+"\n");
	}
	
	
	
	public void obtenerNombre() {
		System.out.println("El nombre del cliente es:" + nombre + apellido);
	}	
	
	
	public void obetenerSistemaSalud() {
		if(sistemaSalud == 1 ) {
			System.out.println("Su sistema de salud es Fonasa");
		}else {
			System.out.println("Su sistema de salud es Isapre");
		}
		
	}
	
	
	
	
	
}