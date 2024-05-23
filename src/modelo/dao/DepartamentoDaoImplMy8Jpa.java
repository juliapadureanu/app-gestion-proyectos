package modelo.dao;

import java.util.List;

import modelo.entidades.Departamento;

public  class DepartamentoDaoImplMy8Jpa extends AbstractDaoImplMy8Jpa implements DepartamentoDao
{
	public DepartamentoDaoImplMy8Jpa() {
		super();
	}

	@Override
	public boolean alta(Departamento obj) {
		try {
			tx.begin();
			em.persist(obj);
			tx.commit();
			return true;
			
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public Departamento eliminar(Integer key) {
		try {
			Departamento dep = buscarUno(key);//hacer una variable que es dep y le indicamos de que tipo es
			if (dep !=null) {
				
				tx.begin();
					em.remove(dep);
				tx.commit();
				return dep;
			}else {
				return null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	}

	@Override
	public Departamento buscarUno(Integer key) {
		
		return em.find(Departamento.class, key);//
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Departamento> buscarTodos() {
		jpql = "select d from Departamento d";
		query = em.createQuery(jpql);
		return query.getResultList();

	}
	
}
	


