package com.servisportvalencia.tienda.datos;

import java.util.List;

public interface GenericDAO<T, ID> {

    public T read(ID id);

    public void insert(T t);

    public void update(T t);

    public void delete(ID id);

    public List<T> findAll();
}
