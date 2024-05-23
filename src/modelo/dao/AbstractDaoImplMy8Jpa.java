package modelo.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class AbstractDaoImplMy8Jpa {

		protected EntityManagerFactory emf; // permite administrar las operaciones con la base de datos.
		protected EntityManager em;//permite realizar operaciones como crear, leer, actualizar y eliminar datos.(crud)
		protected EntityTransaction tx;//gestiona las transacciones y que se hagan en la base de datos de forma persistente.
		protected Query query; //permite hacer consultas personalizadas
		protected String jpql;
		
		public  AbstractDaoImplMy8Jpa() {
			emf = Persistence.createEntityManagerFactory("my_app");
			em = emf.createEntityManager();
			tx = em.getTransaction();
		}
		
		

	}



