package sprintfinal;

import java.time.LocalTime;
import java.text.Normalizer;
import java.util.Scanner;

public class Capacitacion {
	int identificador,cantidadAsistentes;
	String rut,dia,lugar,duracion;
	LocalTime hora;
	Scanner sc = new Scanner(System.in);


	public Capacitacion(int identificador, String rut, String dia, LocalTime hora, String lugar, String duracion, int cantidadAsistentes) {


		while(identificador<=0) {
			System.out.println("El campo identificador es obligatorio ingresalo denuevo por favor");
			identificador=sc.nextInt();
		}
		this.identificador=identificador;


		while(rut.isEmpty()) {
			System.out.println("El campo rut es obligatorio ingresalo denuevo por favor");
			rut=sc.nextLine();
		}
		this.rut=rut;

		dia = Normalizer.normalize(dia, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
		dia = dia.toUpperCase();


		while(!dia.equals("LUNES") && !dia.equals("MARTES") && !dia.equals("MIERCOLES") && !dia.equals("JUEVES") && !dia.equals("VIERNES") && !dia.equals("SABADO") && !dia.equals("DOMINGO")) {
			System.out.println("Por favor ingresa un día de la semana valido");
			dia=sc.nextLine();
			dia = Normalizer.normalize(dia, Normalizer.Form.NFD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
			dia = dia.toUpperCase();
		}

		dia = dia.toUpperCase().charAt(0) + dia.substring(1).toLowerCase();

		this.dia=dia;

		this.hora=hora;



		while(lugar.isEmpty()) {
			System.out.println("El campo lugar es obligatorio ingresalo denuevo por favor");
			lugar=sc.nextLine();
		}

		while(lugar.length()<10 || lugar.length()>50) {
			System.out.println("El campo lugar debe tener entre 10 y 50 caracteres, ingresalo otra vez por favor");
			lugar=sc.nextLine();
		}
		this.lugar=lugar;



		while(duracion.isEmpty()) {
			System.out.println("El campo duracion es obligatorio ingresalo denuevo por favor");
			duracion=sc.nextLine();
		}

		while(duracion.length()>70) {
			System.out.println("El campo lugar debe tener máximo 70 caracteres, ingresalo otra vez por favor");
			duracion=sc.nextLine();
		}
		this.duracion=duracion;


		while(cantidadAsistentes<=0) {
			System.out.println("El campo cantidad de asistentes es obligatorio ingresalo otra vez por favor");
			cantidadAsistentes=sc.nextInt();
		}

		while(cantidadAsistentes>=1000) {
			System.out.println("El número máximo de participantes es de 999, ingresalo otra vez por favor");
			cantidadAsistentes=sc.nextInt();
		}

		this.cantidadAsistentes=cantidadAsistentes;

	}








	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}

	public void setCantidadAsistentes(int cantidadAsistentes) {
		this.cantidadAsistentes = cantidadAsistentes;
	}

	public String getRut() {
		return rut;
	}

	public void setRut(String rut) {
		this.rut = rut;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

}
