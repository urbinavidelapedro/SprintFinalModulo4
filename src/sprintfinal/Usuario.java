package sprintfinal;

import java.math.BigInteger;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

/**
 * 
 * Clase usuario, genera objeto de tipo usuario, el cual implementa interfaz, 
 * constructor vacio y con parámetros  y métodos setter con sus respectivas validaciones y getter. 
 * 
 */
public class Usuario implements IAsesoria{
	String nombre, apellido;
	int run, dia, mes, anio;
	LocalDate fechaNacimiento;
	Scanner sc = new Scanner(System.in);
	
	public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, int run) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		this.run=run;
	}
	
	public Usuario() {
		
	}
	
	/**
	 * 
	 * Metodo sobreescrito que es obligatorio implementar por la interfaz.
	 * @return tipo void 
	 * 
	 */
	public void analizarUsuario() {
		System.out.println("Nombre usuario: "+nombre+", RUN: "+run);
	}
	
	public void mostrarEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		System.out.println("El usuario tiene " + periodo.getYears()+" anios");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		while(nombre.length()<10 || nombre.length()>50) {
			System.out.println("Ingrese un nombre de usuario entre 10 y 50 caracteres");
			nombre=sc.nextLine();
		}
		this.nombre=nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		while(apellido.length()<5 || apellido.length()>30) {
			System.out.println("Ingrese un apellido entre 10 y 50 caracteres");
			apellido=sc.nextLine();
		}
		this.apellido=apellido;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		while(run>99999999) {
			System.out.println("Ingrese un rut válido");
			run=sc.nextInt();
			sc.nextLine();
		}
		this.run=run;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int dia, int mes, int anio) {
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
		while (anio<0 && anio>2023) {
			System.out.println("Ingrese un anio válido");
			anio=sc.nextInt();
			sc.nextLine();
		}
		this.fechaNacimiento=LocalDate.of(anio, mes, dia);
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", run=" + run + ", fechaNacimiento="
				+ fechaNacimiento.getDayOfMonth()+"/"+fechaNacimiento.getMonthValue()+"/"+fechaNacimiento.getYear()+"]";
	}
	
	
}