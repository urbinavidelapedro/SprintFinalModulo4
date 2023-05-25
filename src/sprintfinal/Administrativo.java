package sprintfinal;

import java.time.LocalDate;

public class Administrativo extends Usuario{
	
	String area, experienciaPrevia;
	
	public Administrativo(String nombre, String apellido,LocalDate fechaNacimiento,int run, String area, String experienciaPrevia) {
		super(nombre, apellido, fechaNacimiento, run);
		this.area=area;
		this.experienciaPrevia=experienciaPrevia;
	}
	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: "+ area + ", Experiencia previa: " + experienciaPrevia + "\n");
	}
}
