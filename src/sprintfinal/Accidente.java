package sprintfinal;


import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.Date;

/**
 * 
 * Clase Accidente, genera objeto de tipo accidente. 
 * 
 */
public class Accidente {
	/**
	 * Atributo entero id del accidente
	 */
	private int idAccidente;
	/**
	 * Atributo String rut de cliente
	 */
	private String rutCliente; 
	/**
	 * Atributo String lugar del accidente
	 */
	private String lugar;
	/**
	 * Atributo String origen del accidente
	 */
	private String origen;
	/**
	 * Atributo String consecuencias del accidente
	 */
	private String consecuencias;
	/**
	 * Atributo LocalDate dia del accidente
	 */
	private LocalDate dia;
	/**
	 * Atributo LocalTime hora del accidente
	 */
	private LocalTime hora;
	Scanner sc =  new Scanner(System.in);
	
	/**
	 * Constructor de Accidente con todos los atributos de la clase como parámetros
	 * @param idAccidente De tipo entero, recibe el numero de identificador del accidente
	 * @param rutCliente  De tipo String, recibe el rut del cliente
	 * @param dia		  De tipo LocalDate, recibe el dia del accidente muestra en formato 	
	 * @param hora		  De tipo LocalTime, recibe la hora y la muestra en formato 00:00	
	 * @param lugar       De tipo String, recibe el lugar del accidente
	 * @param origen      De tipo String, recibe el origen del accidente
	 * @param consecuencias De tipo String, recibe consecuencias que dejo el accidente
	 */
	
	
	public Accidente(int idAccidente, String rutCliente, LocalDate dia, LocalTime hora, 
		String lugar, String origen, String consecuencias) {
		
		this.idAccidente = idAccidente;
		this.rutCliente = rutCliente;
	
		this.dia = dia;
		this.hora = hora;
				
		while(lugar.isEmpty()) {
			System.out.println("Ingrese un lugar válido");
			lugar = sc.nextLine();
		}
		while(lugar.length()<10 || lugar.length()>50) {
			System.out.println("Ingrese un lugar de minimo 10 caracteres y maximo 50");
			lugar = sc.nextLine();
			
		}
		this.lugar = lugar;
		
		while (origen.length()>100 || origen.isEmpty()) {
			System.out.println("Ingrese el Origen en menos de 100 caracteres");
			origen = sc.nextLine();
		}
		this.origen = origen;
		
		while (consecuencias.length()>100 || consecuencias.isEmpty()) {
			System.out.println("Ingrese las consecuencias en menos de 100 caracteres");
			consecuencias = sc.nextLine();
		}
		this.consecuencias = consecuencias;
		
		
	}

	/**
	 * Constructor de accidente vacío
	 */
	public Accidente() {
		super();
	}

	
	
	/**
	 * Método que retorna el id del Accidente
	 * @return Retorna el id del Accidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}
	/**
	 *Método que recibe el valor de idAccidente
	 * @param idAccidente recibe el valor de idAccidente
	 */

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}
	
	/**
	 * Método que retorna el rut del cliente
	 * @return Retorna el rut del cliente
	 */

	public String getRutCliente() {
		return rutCliente;
	}
	
	/**
	 * Método que recibe el valor de rutCliente
	 * @param rutCliente recibe el valor de rutCliente 
	 */

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	
    /**
     * Método que retorna el lugar del accidente
     * @return Retorna el lugar del accidente
     */

	public String getLugar() {
		return lugar;
	}
	/**
	 * Método que recibe el valor de lugar
	 * @param lugar recibe el valor de lugar
	 */

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * Método que retorna el origen del accidente
	 * @return Retorna el origen del accidente
	 */

	public String getOrigen() {
		return origen;
	}
	/**
	 * Método que recibe el valor de origen del accidente
	 * @param origen recibe el valor de origen
	 */

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * Método que retorna las consecuencias del accidente
	 * @return Retorna las consecuencias del accidente
	 */
	public String getConsecuencias() {
		return consecuencias;
	}

	/**
	 * Método que recibe el valor de consecuencias
	 * @param consecuencias recibe el valor de consecuencias
	 */
	
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	
	/**
	 * Método que retorna el dia del accidente
	 * @return Retorna el dia del accidente
	 */

	public LocalDate getDia() {
		return dia;
	}
	/**
	 * Método que recibe el valor de dia
	 * @param dia recibe el valor de dia
	 */

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	/**
	 * Método que retorna la hora del accidente
	 * @return  Retorna la hora del accidente
	 */

	public LocalTime getHora() {
		return hora;
	}
	/**
	 * Método que recibe el valor de hora
	 * @param hora recibe el valor de hora
	 */

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}