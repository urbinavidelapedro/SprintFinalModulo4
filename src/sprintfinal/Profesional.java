package sprintfinal;

import java.time.LocalDate;

/**
 * 
 * Clase Profesional, genera objeto de tipo profesional, 
 * constructor vacio y con parámetros  y métodos setter con sus respectivas validaciones y getter y listar profesional. 
 * 
 */
public class Profesional extends Usuario{
	/**
	 * Atributo String correspondiente al título del profesional
	 */
	String titulo;
	/**
	 * Atributo LocalDate correspondiente a la fecha de ingreso del profesional
	 */
	LocalDate fechaIngreso;
	
	/**
	 * Constructor de profesional vacío
	 */
	public Profesional() {
		
	}
	/**
	 * Constructor de Profesional con todos los atributos de la clase como parámetros
	 * @param nombre De tipo String, contiene el nombre del Profesional
	 * @param apellido De tipo String, contiene el apellido del profesional
	 * @param fechaNacimiento De tipo LocalDate, contiene la fecha de nacimiento del profesional
	 * @param run De tipo int, contiene el run del profesional
	 * @param titulo De tipo String, contiene el título del profesional
	 * @param fechaIngreso De tipo LocalDate, contiene la fecha de ingreso del profesional
	 */
	public Profesional(String nombre, String apellido, LocalDate fechaNacimiento, int run, String titulo, LocalDate fechaIngreso) {
		super(nombre, apellido, fechaNacimiento, run);
		this.titulo=titulo;
		this.fechaIngreso=fechaIngreso;
	}
	/**
	 * Método heredado de Usuario que implementa la interfaz IAsesoria, despliega en consola el título más la fecha de ingreso del profesional
	 */
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Título: "+ titulo + ", Fecha ingreso: " + fechaIngreso + "\n");
	}
	/**
	 * Método que retorna un String que almacena el título del profesional
	 * @return Retorna el título del profesional
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * Método que modifica el título del profesional validando que tenga entre 10 y 50 caracteres
	 * @param titulo String que contiene el nuevo título del profesional
	 */
	public void setTitulo(String titulo) {
		while(titulo.length()<10 || titulo.length()>50) {
			System.out.println("El título debe tener entre 10 y 50 caracteres");
			titulo=sc.nextLine();
		}
		this.titulo = titulo;
	}
	/**
	 * Método que retorna la fecha de ingreso del profesional
	 * @return Retorna un LocalDate que almacena la fecha de ingreso del profesional
	 */
	public LocalDate getFechaIngreso() {
		return fechaIngreso;
	}
	/**
	 * Método que modifica la fecha de ingreso del profesional almacenando primero enteros para luego transformarlos a LocalDate con LocalDate.of()
	 * @param dia De tipo entero, contiene el día de la fecha
	 * @param mes De tipo entero, contiene el mes de la fecha
	 * @param anio De tipo entero, contiene el año de la fecha
	 */
	public void setFechaIngreso(int dia, int mes, int anio) {
		this.fechaIngreso=LocalDate.of(dia, mes, anio);
	}
	
	/**
	 * 
	 * Método que retorna un String con la concatenación de los atributos del profesional incluyendo los de la clase padre (Usuario)
	 * @return Retorna un String con la concatenación de atributos del profesional
	 * 
	 */
	public String listarProfesional() {
		return super.toString()+" Profesional [titulo=" + titulo + ", fechaIngreso=" + fechaIngreso + "]";
	}
}