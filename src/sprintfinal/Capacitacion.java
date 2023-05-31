package sprintfinal;


import java.text.Normalizer;
import java.util.Scanner;

public class Capacitacion {
	int cantidadAsistentes;
	String rut,dia,lugar,duracion,identificador,hora;
	Scanner sc = new Scanner(System.in);


	public Capacitacion () {

	}


	public Capacitacion(int cantidadAsistentes, String rut, String dia, String lugar, String duracion,
			String identificador, String hora) {
		super();
		this.cantidadAsistentes = cantidadAsistentes;
		this.rut = rut;
		this.dia = dia;
		this.lugar = lugar;
		this.duracion = duracion;
		this.identificador = identificador;
		this.hora = hora;
	}





	public String getIdentificador() {
		return identificador;
	}



	public void setIdentificador(String identificador) {
	    while (true) {
	        if (identificador.matches("\\d+")) {
	            this.identificador = identificador;
	            break;
	        } else {
	            System.out.println("El identificador debe ser un número entero. Ingréselo nuevamente: ");
	            identificador = sc.nextLine();
	        }
	    }
	}




	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}






	public void setCantidadAsistentes(int cantidadAsistentes) {
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






	public String getRut() {
		return rut;
	}






	public void setRut(String rut) {
		while(rut.isEmpty()) {
			System.out.println("El campo rut es obligatorio ingresalo denuevo por favor");
			rut=sc.nextLine();
		}
		this.rut=rut;
	}






	public String getDia() {
		return dia;
	}






	public void setDia(String dia) {
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
	}






	public String getLugar() {
		return lugar;
	}






	public void setLugar(String lugar) {
		while(lugar.isEmpty()) {
			System.out.println("El campo lugar es obligatorio ingresalo denuevo por favor");
			lugar=sc.nextLine();
		}

		while(lugar.length()<10 || lugar.length()>50) {
			System.out.println("El campo lugar debe tener entre 10 y 50 caracteres, ingresalo otra vez por favor");
			lugar=sc.nextLine();
		}
		this.lugar=lugar;
	}






	public String getDuracion() {
		return duracion;
	}






	public void setDuracion(String duracion) {
		while(duracion.isEmpty()) {
			System.out.println("El campo duracion es obligatorio ingresalo denuevo por favor");
			duracion=sc.nextLine();
		}

		while(duracion.length()>70) {
			System.out.println("El campo lugar debe tener máximo 70 caracteres, ingresalo otra vez por favor");
			duracion=sc.nextLine();
		}
		this.duracion=duracion;
	}






	public String getHora() {
		return hora;
	}






	public void setHora(String hora) {
	    while (true) {
	        if (hora.matches("^([01]?\\d|2[0-3]):[0-5]\\d$")) {
	            this.hora = hora;
	            break;
	        } else {
	            System.out.println("El formato de hora debe ser HH:MM. Ingréselo nuevamente: ");
	            hora = sc.nextLine();
	        }
	    }
	}







	public void mostrarDetalle() {
	System.out.println("La capacitación será en "+lugar+" a las "+hora+" del día "+dia+"y durará "+duracion+" minutos");
	}


		@Override
		public String toString() {
			return "Capacitacion [identificador=" + identificador + ", cantidadAsistentes=" + cantidadAsistentes
					+ ", rut=" + rut + ", dia=" + dia + ", lugar=" + lugar + ", duracion=" + duracion + ", hora=" + hora
					+ "]";
		}

	}














