package sprintfinal;

import java.time.LocalDate;

public class Cliente extends Usuario{
	private String idCliente;

	public Cliente(String nombre, String apellido, LocalDate fechaNacimiento,int run,String idCliente) {
		super(nombre, apellido, fechaNacimiento, run);
		this.idCliente=idCliente;
		// TODO Auto-generated constructor stub
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("Id Cliente: "+idCliente+"\n");
	}
}