package modelo.dao;

import java.util.List;

import modelo.entidades.Cliente;

public class ClienteDaoImplMy8Jpa extends AbstractDaoImplMy8Jpa implements ClienteDao{

	public ClienteDaoImplMy8Jpa() {
		super();
	}
	
	@Override
	public boolean alta(Cliente obj) {
		try {
			tx.begin();
			em.persist(obj);//todas las instrucciones para hacer lo que sea con los datos
			tx.commit();
			return true;
		} catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public Cliente eliminar(String key) {
		//es una variable porque devuelve cliente
		Cliente cli = buscarUno(key);
		
		try {
			
			if (cli != null) {
				tx.begin();
				em.remove(cli);
				tx.commit();
				return cli;
			} else {
				return null;
			}
			
			
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
		
		
		}
		

	@Override
	public Cliente buscarUno(String key) {
		
		return em.find(Cliente.class,key);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cliente> buscarTodos() {
		jpql = "select c from Cliente c";
		query = em.createQuery(jpql);
		return query.getResultList();
		
	}

}
