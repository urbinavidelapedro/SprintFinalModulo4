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

	public Accidente() {
		super();
	}

	public int getIdAccidente() {
		return idAccidente;
	}

	public void setIdAccidente(int idAccidente) {
		this.idAccidente = idAccidente;
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

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getConsecuencias() {
		return consecuencias;
	}

	public void setConsecuencias(String consecuencias) {
		this.consecuencias = consecuencias;
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
