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
	private int idVisitaTerreno;
	private String rutCliente, lugar, comentarios;
	private LocalDate dia;
	private LocalTime hora;
	private Scanner sc = new Scanner(System.in); 
	
	
	/**
	 * 
	 * @param idVisitaTerreno De tipo entero, recibe el numero de identificacion de la visita a terreno
	 * @param rutCliente      
	 * @param lugar
	 * @param comentarios
	 * @param dia
	 * @param hora
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
	public VisitaTerreno() {
		
	}
	
	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}
	
	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}
	
	public String getRutCliente() {
		return rutCliente;
	}
	
	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	
	public String getLugar() {
		return lugar;
	}
	
	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	
	public String getComentarios() {
		return comentarios;
	}
	
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	public LocalDate getDia() {
		return dia;
	}
	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	public LocalTime getHora() {
		return hora;
	}
	
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
}