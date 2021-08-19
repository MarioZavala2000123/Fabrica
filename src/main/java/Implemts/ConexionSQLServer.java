package Implemts;

import Iconexion.iconexion;

public class ConexionSQLServer implements iconexion  {

	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public ConexionSQLServer() {
		this.host = "";
		this.puerto = "";
		this.usuario = "";
		this.contraseña = "";
		
	}
	
	
	@Override
	public void conectar() {
		System.out.println("Se a conectado a la base de SQL Server");
		
	}

	@Override
	public void desconectar() {
	System.out.println("Se a desconectado en SQL Server");
		
	}

}
