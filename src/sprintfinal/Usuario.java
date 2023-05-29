package sprintfinal;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Usuario implements IAsesoria{
	String nombre, apellido;
	int run;
	LocalDate fechaNacimiento;
	Scanner sc = new Scanner(System.in);
	
	public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, int run) {
		int dia,mes,año;
		while(nombre.length()<10 || nombre.length()>50) {
			System.out.println("Ingrese un nombre de usuario entre 10 y 50 caracteres");
			nombre=sc.nextLine();
		}
		this.nombre=nombre;
		this.apellido=apellido;
		while(fechaNacimiento==null) {
			System.out.println("Ingrese una fecha de nacimiento válida");
			System.out.println("Ingrese un día");
			dia=sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese un mes");
			mes=sc.nextInt();
			sc.nextLine();
			System.out.println("Ingrese un año");
			año=sc.nextInt();
			sc.nextLine();
			fechaNacimiento=LocalDate.of(año, mes, dia);
		}
		this.fechaNacimiento=fechaNacimiento;
		while(run>99999999) {
			System.out.println("Ingrese un rut válido");
			run=sc.nextInt();
			sc.nextLine();
		}
		this.run=run;
	}
	
	public Usuario() {
		
	}
	
	public void analizarUsuario() {
		System.out.println("Nombre usuario: "+nombre+", RUN: "+run);
	}
	
	public void mostrarEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		System.out.println("El usuario tiene " + periodo.getYears()+" años");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", run=" + run + ", fechaNacimiento="
				+ fechaNacimiento +"]";
	}
	
	
}