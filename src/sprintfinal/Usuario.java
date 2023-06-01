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

/**
 * Constructor de la clase Usuario que permite crear un objeto de la clase Usuario utilizando argumentos.
 * @param nombre variable de tipo String que almacena el nombre del usuario.
 * @param apellido variable del tipo String que almacena el apellido del usuario.
 * @param fechaNacimiento variable del tipo LocalDate que almacena la fecha de nacimiento del usuario.
 * @param run variable del tipo int que almacena el run de un usuario.
 */
	public Usuario(String nombre, String apellido, LocalDate fechaNacimiento, int run) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.fechaNacimiento=fechaNacimiento;
		this.run=run;
	}

/**
 * Constructor vacío de la clase Usuario, permite la creación de un objeto de dicha clase sin necesidad de utilizar argumentos.
 *
 */
	public Usuario() {

	}

	/**
	 * Método que imprime en consola el nombre del usuario y su RUN.
	 *
	 * @return el nombre de usuario y su run.
	 */
	public void analizarUsuario() {
		System.out.println("Nombre usuario: "+nombre+", RUN: "+run);
	}

/**
 * Método que imprime en consola los años del usuario.
 *
 * @return los años del usuario.
 */
	public void mostrarEdad() {
		Period periodo = Period.between(fechaNacimiento, LocalDate.now());
		System.out.println("El usuario tiene " + periodo.getYears()+" anios");
	}

/**
 * Método que proporciona el nombre.
 *
 * @return el nombre del usuario.
 */
	public String getNombre() {
		return nombre;
	}

/**
 * Método para establecer un nuevo nombre.
 *
 * @param nombre el nombre del usuario a establecer.
 */
	public void setNombre(String nombre) {
		while(nombre.length()<10 || nombre.length()>50) {
			System.out.println("Ingrese un nombre de usuario entre 10 y 50 caracteres");
			nombre=sc.nextLine();
		}
		this.nombre=nombre;
	}

/**
 * Método que proporciona el apellido.
 *
 * @return el apellido del usuario.
 */
	public String getApellido() {
		return apellido;
	}

/**
 * Método para establecer un nuevo apellido.
 *
 * @param apellido el apellido del usuario a establecer.
 */
	public void setApellido(String apellido) {
		while(apellido.length()<5 || apellido.length()>30) {
			System.out.println("Ingrese un apellido entre 10 y 50 caracteres");
			apellido=sc.nextLine();
		}
		this.apellido=apellido;
	}

/**
 * Método que proporciona el run del usuario.
 *
 * @return el run del usuario.
 */
	public int getRun() {
		return run;
	}

/**
 * Método para establecer un nuevo run.
 *
 * @param run el run del usuario a establecer.
 */
	public void setRun(int run) {
		while(run>99999999) {
			System.out.println("Ingrese un rut válido");
			run=sc.nextInt();
			sc.nextLine();
		}
		this.run=run;
	}


/**
 * Método que proporciona la fecha de nacimiento.
 *
 * @return la fecha de nacimiento del usuario.
 */
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

/**
 * Método para establecer una fecha de nacimiento.
 *
 * @param dia el día de nacimiento a establecer.
 * @param mes el mes de nacimiento a establecer.
 * @param anio el año de nacimiento a establecer.
 */
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

	/**
	 * Método que devuelve una representación de tipo String de la instancia actual de la clase Usuario.
	 *
	 * @return representación de tipo String  que representa la instancia actual de la clase Usuario.
	 */
	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", run=" + run + ", fechaNacimiento="
				+ fechaNacimiento.getDayOfMonth()+"/"+fechaNacimiento.getMonthValue()+"/"+fechaNacimiento.getYear()+"]";
	}


}