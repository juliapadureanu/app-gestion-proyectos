package modelo.dao;

import java.util.List;
//k clave
//t el tipo de clase

public interface InterfaceGenericoCrud<K,T> {
	 

	    boolean alta(T obj);
	    T eliminar(K key);
	    T buscarUno(K key);
	    List<T> buscarTodos();
	}

