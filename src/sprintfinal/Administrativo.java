package sprintfinal;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 
 * Clase Administrativo, genera objeto de tipo administrativo extiende de la clase padre usuario, 
 * constructor vacio y con parámetros  y métodos setter con sus respectivas validaciones y getter.  
 * 
 */
public class Administrativo extends Usuario{
	/**
	 * Atributo String correspondiente al área del administrativo
	 */
	String area;
	/**
	 * Atributo String correspondiente a la experiencia previa del administrativo
	 */
	String experienciaPrevia;
	Scanner sc= new Scanner(System.in);
	/**
	 * Constructor vacío de administrativo
	 */
	public Administrativo() {
		
	}
	/**
	 * Constructor de administrativo con todos los atributos como parámetros (incluyendo los de usuario)
	 * @param nombre String correspondiente al nombre del administrativo
	 * @param apellido String correspondiente al apellido del administrativo
	 * @param fechaNacimiento LocalDate correspondiente a la fecha de nacimiento del administrativo
	 * @param run Entero correspondiente al run del administrativo
	 * @param area String correspondiente al área del administrativo	
	 * @param experienciaPrevia String correspondiente a la experiencia previa del administrativo
	 */
	public Administrativo(String nombre, String apellido,LocalDate fechaNacimiento,int run, String area, String experienciaPrevia) {
		super(nombre, apellido, fechaNacimiento,run);
		this.area=area;
		this.experienciaPrevia=experienciaPrevia;
	}
	/**
	 * Método que retorna el área del administrativo
	 * @return String que almacena el área del administrativo
	 */
	public String getArea() {
		return area;
	}
	/**
	 * Método que modifica el área del administrativo validando que tenga entre 5 y 20 caracteres
	 * @param area String que contiene la nueva área del administrativo
	 */
	public void setArea(String area) {
		while(area.length()<5 || area.length()>20) {
			System.out.println("Favor el área debe estar entre 5 y 20 caracteres");
			area=sc.nextLine();
		}
		this.area=area;
	}
	/**
	 * Método que retorna la experiencia previa del administrativo
	 * @return String que almacena la experiencia previa del administrativo
	 */
	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}
	/**
	 * Método que modifica la experiencia previa del administrativo validando que no tenga más de 100 caracteres
	 * @param experienciaPrevia String que almacena la nueva experiencia previa del administrativo
	 */
	public void setExperienciaPrevia(String experienciaPrevia) {
		while(experienciaPrevia.length()>100) {
			System.out.println("Item experiencia previa debe tener menos de 100 caracteres");
			experienciaPrevia=sc.nextLine();
		}
		this.experienciaPrevia=experienciaPrevia;
	}
	
	/**
	 * 
	 * Método que imprime datos del administrador.  
	 * 
	 */
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Area: "+ area + ", Experiencia previa: " + experienciaPrevia + "\n");
	}
	
	/**
	 * 
	 * Método que retorna a través de concatenación de cadenas los atributos correspondientes al administrativo
	 * @return String con los atributos listados del administrativo
	 * 
	 */
	public String listarAdministrativo() {
		return super.toString()+" Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + "]";
	}
}
