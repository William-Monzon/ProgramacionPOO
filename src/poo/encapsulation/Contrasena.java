package poo.encapsulation;

public class Contrasena {
	private String usuario;
	private String contraseña;
	 
	public Contrasena(String usuario, String contraseña) {
		super();
		this.usuario = usuario;
		this.contraseña = contraseña;
	}
	public boolean compararContrasena(String ingreso) {
		if(ingreso == null) {
			return false;
		}
		return contraseña.equals(ingreso);
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
}
