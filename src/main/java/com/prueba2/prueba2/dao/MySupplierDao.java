package com.prueba2.prueba2.dao;

import com.prueba2.prueba2.dto.Supplier;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;


@Named
@ApplicationScoped
@Transactional
public class MySupplierDao {

    @PersistenceContext
    private EntityManager em;
    private List<Supplier> supplierList;
    @PostConstruct
    public void init() {
        supplierList=em.createQuery("SELECT s FROM Supplier s", Supplier.class).getResultList();
    }

    public List<Supplier> getSuppliers() {
        return new ArrayList<>(supplierList);
    }
}
