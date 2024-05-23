package testDao;


import java.math.BigDecimal;

import modelo.dao.ClienteDao;
import modelo.dao.ClienteDaoImplMy8Jpa;
import modelo.entidades.Cliente;

public class TestClienteDao {
	
	private static ClienteDao cdao;
	
static {
	
	
	cdao = new ClienteDaoImplMy8Jpa();
}
	
	
	
	public static void main(String[] args) {
		
		//alta();
		//eliminar();
		//uno();
		//todos();
		//nada();
	}
	public static void alta () {
		Cliente cli1 = new Cliente("87654321D","Pedro","Gomez","Alcala 13",BigDecimal.valueOf(1000) , 100);
		Cliente cli2 = new Cliente("J88888888","Pedro","Gomez","Alcala 13",BigDecimal.valueOf(1000) , 100);
		System.out.println(cdao.alta(cli2));
	}
	public static void eliminar () {
		
		
		System.out.println(cdao.eliminar("J88888888"));
	}
	
public static void uno () {
		
		System.out.println(cdao.buscarUno("87654321D"));
}

}
//https://github.com/juliapadureanu/app-gestion-proyectos/tree/JULIA-proyecto