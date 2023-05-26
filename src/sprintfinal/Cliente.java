package sprintfinal;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Usuario{
	private String telefono, afp, direccion, comuna;
	private int sistemaSalud, edad;
	

	public Cliente () {
		
	}
	public Cliente(String nombre, String apellido, LocalDate fechaNacimiento,int run, String telefono,
			String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		
				
		//agregar run de usuario
		super(nombre, apellido, fechaNacimiento,run);
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
		while(sistemaSalud != 1 && sistemaSalud != 2) {
			System.out.println("Debe ingresar opcion 1 para fonasa o 2 para isapre");
			sistemaSalud=sc.nextInt();
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
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		this.afp = afp;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		this.comuna = comuna;
	}
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemaSalud(int sistemaSalud) {
		this.sistemaSalud = sistemaSalud;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
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
	public void setFechaNacimiento(int dia, int mes, int año) {
		while (dia>31 && dia<1) {
			System.out.println("Ingrese un día válido");
			dia=sc.nextInt();
			sc.nextLine();
		}
		while (mes>12 && mes<1) {
			System.out.println("Ingrese un mes válido");
			dia=sc.nextInt();
			sc.nextLine();
		}
		while (año<0 && año>2023) {
			System.out.println("Ingrese un año válido");
			año=sc.nextInt();
			sc.nextLine();
		}
		this.fechaNacimiento=LocalDate.of(año, mes, dia);
	}
	
	
	
	
	
}