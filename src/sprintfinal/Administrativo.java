package sprintfinal;

public class Administrativo extends Usuario{
	
	String area, experienciaPrevia;
	
	public Administrativo(String nombre, String apellido, String run, String area, String experienciaPrevia) {
		super(nombre, apellido);
		this.area=area;
		this.experienciaPrevia=experienciaPrevia;
	}
	
	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Área: "+ area + ", Experiencia previa: " + experienciaPrevia + "\n");
	}
}
// comentario prueba de git