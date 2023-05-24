package sprintfinal;

import java.util.Scanner;

public class Revision {
	
	private int idRevision;
	private int idVisitaTerreno;
	private String nombreRevision;
	private String detalleRevision;
	private int estado;
	
	private Scanner sc = new Scanner(System.in);
		
	public Revision() {
	}
	
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

	public int getIdRevision() {
		return idRevision;
	}

	public void setIdRevision(int idRevision) {
		this.idRevision = idRevision;
	}

	public int getIdVisitaTerreno() {
		return idVisitaTerreno;
	}

	public void setIdVisitaTerreno(int idVisitaTerreno) {
		this.idVisitaTerreno = idVisitaTerreno;
	}

	public String getNombreRevision() {
		return nombreRevision;
	}

	public void setNombreRevision(String nombreRevision) {
		this.nombreRevision = nombreRevision;
	}

	public String getDetalleRevision() {
		return detalleRevision;
	}

	public void setDetalleRevision(String detalleRevision) {
		this.detalleRevision = detalleRevision;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return "Revision [idRevision=" + idRevision + ", idVisitaTerreno=" + idVisitaTerreno + ", NombreRevision="
				+ nombreRevision + ", detalleRevision=" + detalleRevision + ", estado=" + estado + "]";
	}
	
	
	
	

}
