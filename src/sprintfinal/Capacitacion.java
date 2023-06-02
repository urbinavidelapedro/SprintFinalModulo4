package sprintfinal;


import java.text.Normalizer;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * Clase Capacitación, genera objeto de tipo capacitación, constructor vacio y con parámetros  y métodos setter con sus respectivas validaciones y getter.
 *
 */
public class Capacitacion {
    /**
     * Cantidad de asistentes de la capacitación.
     */
    int cantidadAsistentes;

    /**
     * Identificador de la capacitación.
     */
    int identificador;

    /**
     * Rut asociado a la capacitación.
     */
    String rut;

    /**
     * Día de la semana en la cual será la capacitación.
     */
    String dia;

    /**
     * Lugar donde se llevara a cabo la capacitación.
     */
    String lugar;

    /**
     * Duración de la capacitación en minutos.
     */
    String duracion;

    /**
     * Hora en que se iniciará la capacitación en formato 00:00..
     */
    LocalTime hora;
	Scanner sc = new Scanner(System.in);

/**
 * Constructor vacío de la clase Capacitacion permite la creación de un objeto de dicha clase sin necesidad de utilizar argumentos.
 */
	public Capacitacion () {

	}

/**
 * Constructor de la clase Capacitacion que permite crear un objeto de la clase Capacitacion utilizando argumentos.
 * @param cantidadAsistentes Variable de tipo int que almacena la cantidad de asistentes a una capacitación.
 * @param rut variable de tipo String que almacena el rut de la empresa.
 * @param dia variable de tipo String que almacena los días de la semana.
 * @param lugar variable de tipo String que almacena el lugar de la capacitación.
 * @param duracion variable de tipo String que almacena la duracion de la capacitación.
 * @param identificador variable de tipo int que almacena el identificador numerico de la capacitación.
 * @param hora variable de tipo LocalTime que permite alojar un hora en formato 00:00.
 */
	public Capacitacion(int cantidadAsistentes, String rut, String dia, String lugar, String duracion,
			int identificador, LocalTime hora) {
		super();
		this.cantidadAsistentes = cantidadAsistentes;
		this.rut = rut;
		this.dia = dia;
		this.lugar = lugar;
		this.duracion = duracion;
		this.identificador = identificador;
		this.hora = hora;
	}

/**
 *Método que proporciona el identificador.
 *
 * @return El identificador de la capacitación.
 */
	public int getIdentificador() {
		return identificador;
	}

/**
 *Método para establecer un nuevo identificador.
 *
 * @param identificador El identificador a establecer
 */
	public void setIdentificador(int identificador) {
				if (identificador != 0) {
	            this.identificador = identificador;

	        } else {
	            System.out.println("El identificador debe ser un número entero. Ingréselo nuevamente: ");
	            identificador = sc.nextInt();
	        }
	    }

/**
 *Método que proporciona la cantidad de asistentes.
 *
 * @return La cantidad de asistentes a la capacitacion.
 */
	public int getCantidadAsistentes() {
		return cantidadAsistentes;
	}


/**
 *Método para establecer nueva cantidad de asistentes.
 *
 * @param cantidadAsistentes la cantidad de asistentes a establecer..
 */
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

/**
 *Método que proporciona el rut.
 *
 * @return El rut de la empresa cursante de la capacitación.
 */
	public String getRut() {
		return rut;
	}

/**
 *Método para establecer un nuevo rut.
 *
 * @param rut el rut de la empresa cursante de la capacitación a establecer.
 */
	public void setRut(String rut) {
		while(rut.isEmpty()) {
			System.out.println("El campo rut es obligatorio ingresalo denuevo por favor");
			rut=sc.nextLine();
		}
		this.rut=rut;
	}

/**
 *Método que proporciona el día de la semana en que será la capacitación.
 *
 * @return el día que se realizara la capacitación.
 */
	public String getDia() {
		return dia;
	}

/**
 *Método para establecer un nuevo día de la semana.
 *
 * @param dia día de la capacitación a establecer.
 */
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

/**
 * Método que proporciona el lugar de realización.
 *
 * @return lugar donde será la capacitación.
 */

	public String getLugar() {
		return lugar;
	}

/**
 * Método que establece un nuevo lugar de realización
 *
 * @param lugar lugar de realización de la capacitación.
 */
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

/**
 * Método que proporciona la duración.
 *
 * @return la duración de la capacitación.
 */
	public String getDuracion() {
		return duracion;
	}


/**
 * Método que establece una nueva duración.
 *
 * @param duracion duración de la capacitación.
 */
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

/**
 * Metodo que proporciona el horario de la capacitación.
 *
 * @return horario de la capacitación.
 */
	public LocalTime getHora() {
		return hora;
	}

/**
 * Método que establece un nuevo horario.
 *
 * @param horaCapacitacion el horario de la capacitación.
 */
	public void setHora(LocalTime horaCapacitacion) {
		this.hora = horaCapacitacion;
	}

	/**
	 *
	 * Método al ser usado imprimer detalles de objeto del tipo capacitación.
	 * @return tipo void
	 *
	 */
	public void mostrarDetalle() {
	System.out.println("La capacitación será en "+lugar+" a las "+hora+" del día "+dia+"y durará "+duracion+" minutos");
	}



	/**
	 * Método que devuelve una representación de tipo String de la instancia actual de la clase Capacitacion.
	 *
	 * @return representación de tipo String  que representa la instancia actual de la clase Capacitacion.
	 */
	@Override
	public String toString() {
		return "Capacitacion [identificador=" + identificador + ", cantidadAsistentes=" + cantidadAsistentes
				+ ", rut=" + rut + ", dia=" + dia + ", lugar=" + lugar + ", duracion=" + duracion + ", hora=" + hora
				+ "]";
	}

}