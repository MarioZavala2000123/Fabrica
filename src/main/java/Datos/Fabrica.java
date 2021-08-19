package Datos;

import Iconexion.iconexion;

public class Fabrica {

	public static void main(String[] args) {
		conexionfabrica Fabrica = new conexionfabrica();
		
		iconexion Postgresql = Fabrica.getConexion("Postgresql");
		System.out.println();
		System.out.println("1.  Conexion base de datos a Postgresql");
		System.out.println();
		System.out.println("----------------------");
		Postgresql.conectar();
		System.out.println("----------------------");
		Postgresql.desconectar();
		System.out.println("----------------------");
	
		
		iconexion SQL = Fabrica.getConexion("SQL");
		System.out.println();
		System.out.println("2.  Conexion a la base de datos de SQL Server");
		System.out.println();
		System.out.println("----------------------");
		SQL.conectar();
		System.out.println("----------------------");
		SQL.desconectar();
		System.out.println("----------------------");

		iconexion MysQL = Fabrica.getConexion("MysQL");
		System.out.println();
		System.out.println("3.  Conexion a la base de datos de MysQL Server");
		System.out.println();
		System.out.println("----------------------");
		MysQL.conectar();
		System.out.println("----------------------");
		MysQL.desconectar();
		System.out.println("----------------------");
		
		
		iconexion Oracle = Fabrica.getConexion("Oracle");
		System.out.println();
		System.out.println("4.  Conexion a la base de datos de Oracle");
		System.out.println();
		System.out.println("----------------------");
		Oracle.conectar();
		System.out.println("----------------------");
		Oracle.desconectar();
		System.out.println("----------------------");
	}

}
