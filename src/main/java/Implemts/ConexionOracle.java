package Implemts;

import Iconexion.iconexion;

public class ConexionOracle implements iconexion  {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionOracle() {
		this.host = "";
		this.puerto = "";
		this.usuario = "";
		this.contraseña = "";
		
	}
	
	
	@Override
	public void conectar() {
		System.out.println("Se a conectado a la base de Oracle");
		
	}

	@Override
	public void desconectar() {
	System.out.println("Se a desconectado en Oracle");
		
	}

}
