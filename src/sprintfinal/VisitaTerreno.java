package sprintfinal;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * 
 * Clase VisitaTerreno, genera objeto de tipo visitaTerreno, 
 * constructor vacio y  con parámetros y metodos setter y getter. 
 * 
 */

public class VisitaTerreno {
<<<<<<< HEAD
	/**
	 * Atributo entero de la id de la visita a terreno
	 */
=======

>>>>>>> aaa1792be776712690eccb0e690ccc274acef617
	private int idVisitaTerreno;
	/**
	 * Atributo String rut del cliente
	 */
	private String rutCliente;
	/**
	 * Atributo String lugar de la visita
	 */
	private String lugar;
	/**
	 * Atributo String comentarios de la visita
	 */
	private String comentarios;
	/**
	 * Atributo LocalDate dia de la visita
	 */
	private LocalDate dia;
	/**
	 * Atributo LocalTime hora de la visita
	 */
	private LocalTime hora;
	private Scanner sc = new Scanner(System.in); 
	
	
	/**
	 * Constructor de Visita a terreno con todos los atributos de la clase como parámetros
	 * @param idVisitaTerreno De tipo entero, recibe el numero de identificacion de la visita a terreno
	 * @param rutCliente De  tipo String, recibe el rut del cliente     
	 * @param lugar De tipo String, recibe el lugar de la visita
	 * @param comentarios De tipo String, recibe los comentarios de la visita
	 * @param dia De tipo LocalDate, recibe  el dia 
	 * @param hora de tipo LocalTime, recibe la hora
	 */
	VisitaTerreno(int idVisitaTerreno, String rutCliente, String lugar, String comentarios, LocalDate dia, LocalTime hora) {
		this.idVisitaTerreno=idVisitaTerreno;
		while(rutCliente==null) {
			System.out.println("Ingrese un rut de cliente válido");
			rutCliente=sc.nextLine();
		}
		this.rutCliente=rutCliente;

		while(lugar.length()<10 || lugar.length()>50) {
			System.out.println("El lugar debe tener entre 10 y 50 caracteres");
			lugar=sc.nextLine();
		}
		this.lugar=lugar;

		while(comentarios.length()>100 || comentarios.isEmpty()) {
			System.out.println("El comentario ingresado no es válido");
			comentarios=sc.nextLine();
		}
		this.comentarios=comentarios;		
		this.dia = dia;
		this.hora = hora;
	}
	/**
	 * Constructor de visita a terreno vacio
	 */
	public VisitaTerreno() {
		
	}
	
	/**
	 * Método que retorna la id de la visita a terreno
	 * @return retorna la visita a terreno
	 */
	
	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}
	/**
	 * Método que recibe el valor de idVisitaTerreno
	 * @param idVisitaTerreno recibe el valor de idVisitaTerreno
	 */
	
	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}
	/**
	 * Método que retorna rutCliente
	 * @return retorna rutCliente
	 */
	public String getRutCliente() {
		return rutCliente;
	}
	/**
	 * Método que recibe rutCliente
	 * @param rutCliente recibe el valor de rutCliente
	 */
	
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	/**
     * Método que retorna el lugar 
     * @return Retorna el lugar 
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
     * Método que retorna el comentarios
     * @return Retorna comentarios
     * 
     */
	public String getComentarios() {
		return comentarios;
	}
	
	/**
	 * Método que recibe comentarios
	 * @param comentarios recibe el valor de comentarios
	 */
	
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	/**
	 * Método que retorna Dia
	 * @return Retorna dia
	 */
	public LocalDate getDia() {
		return dia;
	}
	/**
	 * Método que recibe el dia
	 * @param dia recibe el valor de dia
	 */
	
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	/**
	 * Método que retorna la hora
	 * @return Retorna la hora
	 */
	
	public LocalTime getHora() {
		return hora;
	}
	
	/**
	 * Método que recibe la hora
	 * @param hora recibe el valor de hora
	 */
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
}