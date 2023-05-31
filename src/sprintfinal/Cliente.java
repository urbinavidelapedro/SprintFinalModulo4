package sprintfinal;

import java.time.LocalDate;
import java.util.Scanner;

public class Cliente extends Usuario{
	private String telefono, afp, direccion, comuna;
	private int sistemaSalud, edad;
	private int rut;
	

	public Cliente () {
		
	}
	public Cliente(String nombre, String apellido, LocalDate fechaNacimiento,int run,int rut, String telefono,
			String afp, int sistemaSalud, String direccion, String comuna, int edad) {
		super(nombre, apellido, fechaNacimiento,run);
		this.telefono=telefono;
		this.afp=afp;
		this.direccion=direccion;
		this.comuna=comuna;
		this.edad=edad;
		this.rut=rut;
	}
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		while(telefono.isEmpty()) {
			System.out.println("Favor Ingrese un teléfono válido");
			telefono = sc.nextLine();
		}
	}
	public String getAfp() {
		return afp;
	}
	public void setAfp(String afp) {
		while (afp.length()<4 || afp.length()>30) {
			System.out.println("Afp debe tener minimo 4 caracteres y maximo 30");
			afp = sc.nextLine();
		}
		this.afp=afp;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		while(direccion.length()>70) {
			System.out.println("Direccion debe tener como maximo 70 caracteres");
			direccion = sc.nextLine();
		}
		this.direccion = direccion;
	}
	public String getComuna() {
		return comuna;
	}
	public void setComuna(String comuna) {
		while(comuna.length()>50) {
			System.out.println("Comuna debe tener como maximo 50 caracteres");
			comuna = sc.nextLine();
		}
		this.comuna = comuna;
	}
	public int getSistemaSalud() {
		return sistemaSalud;
	}
	public void setSistemaSalud(int sistemaSalud) {
		while(sistemaSalud != 1 && sistemaSalud != 2) {
			System.out.println("Debe ingresar opcion 1 para fonasa o 2 para isapre");
			sistemaSalud=sc.nextInt();
		}
		this.sistemaSalud= sistemaSalud;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		while (edad < 0 || edad > 150) {
			System.out.println("Edad debe ir de 0 a 150 años");
			edad = sc.nextInt();
		}
		this.edad = edad;
		
			
	}
	public int getRut() {
		return rut;
	}
	public void setRut(int rut) {
		while(run>99999999) {
			System.out.println("Ingrese un rut válido");
			run=sc.nextInt();
			sc.nextLine();
		}
		this.rut = rut;
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
	
	public String listarCliente() {
		return super.toString()+"Cliente [telefono=" + telefono + ", afp=" + afp + ", direccion=" + direccion + ", comuna=" + comuna
				+ ", sistemaSalud=" + sistemaSalud + ", edad=" + edad + "]";
	}
	
	
}