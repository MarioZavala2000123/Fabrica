package Datos;

import Iconexion.iconexion;
import Implemts.ConexionPostgresql;
import Implemts.ConexionSQLServer;
import Implemts.ConexionMySQL;
import Implemts.ConexionOracle;

public class conexionfabrica {

	public iconexion getConexion(String motor) {
	if (motor == null ) {
		
	}
	if (motor.equalsIgnoreCase("Postgresql")) {
		return new ConexionPostgresql();
		
	}if (motor.equalsIgnoreCase("SQL SERVER")) {
		return new ConexionSQLServer();
		
	}if (motor.equalsIgnoreCase("MySQL")) {
		return new ConexionMySQL();
		
	}if (motor.equalsIgnoreCase("Oracle")) {
		return new ConexionOracle();
		
	}
	return new ConexionSQLServer();
	}
}
