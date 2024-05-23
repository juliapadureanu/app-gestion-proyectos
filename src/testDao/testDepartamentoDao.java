package testDao;



import modelo.dao.DepartamentoDao;
import modelo.dao.DepartamentoDaoImplMy8Jpa;
import modelo.entidades.Departamento;



public class testDepartamentoDao {

private static DepartamentoDao ddao ;
	static {
		ddao = new DepartamentoDaoImplMy8Jpa();
	}
	public static void main(String[] args) {
	//alta();
	//todos();
	//uno();
	//eliminar();
	}
	public static void alta() {
		
		Departamento dep1 = new Departamento();
		dep1.setNombre("Recursos Humanos");
		dep1.setDireccion("Málaga");
		dep1.setIdDepar(70);
		
		Departamento dep2 = new Departamento();
		dep2.setNombre("Logistica");
		dep2.setDireccion("Málaga");
		dep2.setIdDepar(80);
		
		Departamento dep3 = new Departamento();
		dep2.setNombre("Incidencias");
		dep2.setDireccion("Málaga");
		dep2.setIdDepar(50 );
		
	System.out.println(ddao.alta(dep1));
	System.out.println(ddao.alta(dep2));
	System.out.println(ddao.alta(dep3));
	todos();
	}
	public static void eliminar() {
		System.out.println("eliminado : " + ddao.eliminar(80));
	}
	public static void uno() {
		System.out.println("Buscar Uno");
		System.out.println(ddao.buscarUno(70));
	}
	public static void todos() {
		System.out.println("Buscar todos");
		
		ddao.buscarTodos().forEach(System.out::println);
	}
	}
	
	
	
