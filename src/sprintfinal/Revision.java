package sprintfinal;

import java.util.Scanner;

/**
 * 
 * Clase Revision, genera objeto de tipo revision, 
 * constructor vacio y con parámetros con sus respectivas validaciones  y métodos setter y getter. 
 * 
 */
public class Revision {
	
	/**
	 * Atributo entero id de la revision
	 */
	private int idRevision;
	/**
	 * Atributo entero id de la visita a terreno
	 */
	private int idVisitaTerreno;
	/**
	 * Atributo String nombre de la revision
	 */
	private String nombreRevision;
	/**
	 * Atributo String detalle de la revision
	 */
	private String detalleRevision;
	/**
	 * Atributo entero estado de la revision
	 */
	private int estado;
	
	private Scanner sc = new Scanner(System.in);
	
	/**
	 * Constructor de Revision vacío
	 */
	public Revision() {
	}
	
	/**
	 * Constructor de Revision con todos los atributos de la clase como parámetros
	 * @param idRevision
	 * @param idVisitaTerreno
	 * @param nombreRevision
	 * @param detalleRevision
	 * @param estado
	 */
	public Revision(int idRevision, int idVisitaTerreno, String nombreRevision, String detalleRevision, int estado) {
		while(idRevision == 0) {
			System.out.println("El campo idRevision es obligatorio y es de tipo entero");
			idRevision= sc.nextInt();
		}		
		this.idRevision = idRevision;
		
		while(idVisitaTerreno == 0) {
			System.out.println("El campo idVisitaTerreno es obligatorio3");
			idVisitaTerreno= sc.nextInt();
		}
		this.idVisitaTerreno = idVisitaTerreno;
		
		while(nombreRevision.isEmpty() || nombreRevision.length() < 10 || nombreRevision.length() > 50) {
			System.out.println("El campo nombre de revisión es obligatorio");
			nombreRevision=sc.nextLine();
		}
		this.nombreRevision = nombreRevision;
		
		while(detalleRevision.isEmpty() || detalleRevision.length() > 100) {
			System.out.println("El campo detalle de revisión es obligatorio");
			detalleRevision=sc.nextLine();
		}
		this.detalleRevision = detalleRevision;
		
		while(estado == 0 || estado > 3 && estado < 1) {
			System.out.println("El campo detalle de revisión es obligatorio");
			estado=sc.nextInt();
		}
		this.estado = estado;
	}
	
	/**
	 * Método que retorna el id de Revision
	 * @return Retorna el id de la revisión
	 */
	public int getIdRevision() {
		return idRevision;
	}
	/**
	 * Método que recibe el valor de idRevision
	 * @param idRevision recibe el valor de idRevision
	 */

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}
	
	/**
	 * Método que retorna el valor de idVisitaTerreno
	 * @return Retorna la id de la visita en terreno
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
	 * Método que retorna nombreRevision
	 * @return retorna el nombre de la revisión
	 */

	public String getNombreRevision() {
		return nombreRevision;
	}
	
	/**
	 * Método que recibe el nombreRevision
	 * @param nombreRevision recibe el valor de nombreRevision
	 */

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}
	
	/**
	 * Método que retorna detalleRevision
	 * @return retorna el detalle de la revisión
	 */
	

	public String getDetalleRevision() {
		return detalleRevision;
	}
	/**
	 * Método que recibe detalleRevision
	 * @param detalleRevision recibe el valor de detalleRevision
	 */

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}
	
	/**
	 * Método que retorna estado
	 * @return Retorna el estado de la revisión
	 */

	public int getEstado() {
		return estado;
	}
    /**
     * Método que recibe estado 
     * @param estado recibe el valor de estado de la revisión
     */
	public void setEstado(int estado) {
		this.estado = estado;
	}

	/**
	 * Método para retornar un String con los  atributos del objeto
	 * @return retorna idRevision, idVisitaTerreno, 
	 * nombreRevision, detalleRevision, estado
	 */
	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisitaTerreno=" + idVisitaTerreno + ", NombreRevision="
				+ nombreRevision + ", detalleRevision=" + detalleRevision + ", estado=" + estado + "]";
	}
	
	
	
	

}
