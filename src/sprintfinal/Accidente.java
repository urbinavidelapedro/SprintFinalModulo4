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
	
	private int idAccidente;
	private String rutCliente, lugar, origen, consecuencias;
	private LocalDate dia;
	private LocalTime hora;
	Scanner sc =  new Scanner(System.in);
	
	/**
	 * 
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
	 * Constructor de cliente vacio
	 */
	public Accidente() {
		super();
	}

	
	
	/**
	 * 
	 * @return Retorna el id del Accidente
	 */
	public int getIdAccidente() {
		return idAccidente;
	}
	/**
	 * 
	 * @param idAccidente toma el valor de idAccidente
	 */

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
	}
	
	/**
	 * 
	 * @return Retorna el rut del cliente
	 */

	public String getRutCliente() {
		return rutCliente;
	}
	
	/**
	 * 
	 * @param rutCliente recibe el valor de rutCliente 
	 */

	public void setRutCliente(String rutCliente) {
		this.rutCliente = rutCliente;
	}
	
    /**
     * 
     * @return Retorna el lugar del accidente
     */

	public String getLugar() {
		return lugar;
	}
	/**
	 * 
	 * @param lugar recibe el valor de lugar
	 */

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}
	/**
	 * 
	 * @return Retorna el origen del accidente
	 */

	public String getOrigen() {
		return origen;
	}
	/**
	 * 
	 * @param origen recibe el valor de origen
	 */

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * 
	 * @return Retorna las consecuencias del accidente
	 */
	public String getConsecuencias() {
		return consecuencias;
	}

	/**
	 * 
	 * @param consecuencias recibe el valor de consecuencias
	 */
	
	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
	}
	
	/**
	 * 
	 * @return Retorna el dia del accidente
	 */

	public LocalDate getDia() {
		return dia;
	}
	/**
	 * 
	 * @param dia recibe el valor de dia
	 */

	public void setDia(LocalDate dia) {
		this.dia = dia;
	}
	
	/**
	 * 
	 * @return  Retorna la hora del accidente
	 */

	public LocalTime getHora() {
		return hora;
	}
	/**
	 * 
	 * @param hora recibe el valor de hora
	 */

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	
	
	


	
	
}
