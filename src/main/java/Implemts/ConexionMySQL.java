package Implemts;

import Iconexion.iconexion;

public class ConexionMySQL implements iconexion {
	private String host;
	private String puerto;
	private String usuario;
	private String contraseña;
	
	public void ConexionMysQL() {
		this.host = "localhost";
		this.puerto = "3306";
		this.usuario = "MysQl";
		this.contraseña = "2609001";
		
	}

	@Override
	public void conectar() {
		System.out.println("Se conecto en MysQl");
		
	}

	@Override
	public void desconectar() {
		System.out.println("Se desconecto en MysQl");
		
	}
	
}
