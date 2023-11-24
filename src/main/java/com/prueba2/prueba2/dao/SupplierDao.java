package com.prueba2.prueba2.dao;


import com.prueba2.prueba2.dto.Supplier;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;

import java.util.List;

public class SupplierDao {

    private final EntityManager entityManager;

    public SupplierDao(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public List<Supplier> obtenerSuppliersPaginados(int first, int pageSize) {
        TypedQuery<Supplier> query = entityManager.createQuery("SELECT s FROM Supplier s", Supplier.class);
        query.setFirstResult(first);
        query.setMaxResults(pageSize);
        return query.getResultList();
    }

    public int obtenerCantidadTotalSuppliers() {
        return Math.toIntExact((Long) entityManager.createQuery("SELECT COUNT(s.supplierId) FROM Supplier s").getSingleResult());
    }


}
