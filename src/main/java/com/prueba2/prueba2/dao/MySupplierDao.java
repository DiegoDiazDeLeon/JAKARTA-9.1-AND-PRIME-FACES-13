package com.prueba2.prueba2.dao;

import com.prueba2.prueba2.dto.Supplier;

import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import java.util.List;

import java.util.ArrayList;


@Named
@ApplicationScoped
@Transactional
public class MySupplierDao {

    @PersistenceContext
    private EntityManager em;

    //ESTE ES PARA OBTENER UNA LISTA DE SUPLIERS
    private List<Supplier> supplierList;

    //public void init() {
        //obtener todos:
        //supplierList=em.createQuery("SELECT s FROM Supplier s", Supplier.class).getResultList();
    //}

    //Este es para obtener todos los suppliers
    //public List<Supplier> getSuppliers() {
       // return new ArrayList<>(supplierList);
    //}

    public List<Supplier> getSuppliers(int first, int pageSize) {
        TypedQuery<Supplier> query = em.createQuery("SELECT s FROM Supplier s", Supplier.class);
        query.setFirstResult(first);
        query.setMaxResults(pageSize);
        List<Supplier> list= query.getResultList();
        return list;
    }

    public int countAllSuppliers() {
        Long count = em.createQuery("SELECT COUNT(s) FROM Supplier s", Long.class).getSingleResult();
        return count.intValue();
    }


    //SEEDER CREA 6 SUPPLIERS
        public void createSixSuppliers() {
        for (int i = 1; i <= 6; i++) {
            Supplier supplier = new Supplier();
            supplier.setName("Supplier " + i);
            supplier.setInsurance("Insurance " + i);
            }
    }

}
