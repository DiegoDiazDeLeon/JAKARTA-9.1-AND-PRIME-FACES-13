package com.prueba2.prueba2.dao;

import java.util.ArrayList;
import java.util.List;

import com.prueba2.prueba2.dto.Supplier;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;


@Named
@ApplicationScoped
@Transactional
public class MySupplierDao {

    @PersistenceContext
    private EntityManager em;

    public List<Supplier> getSuppliers(int first, int pageSize) {
        System.out.println("Calling getSuppliers method. first: " + first + ", pageSize: " + pageSize);
        List<Supplier> result = new ArrayList<>();
        try{
            TypedQuery<Supplier> query = em.createQuery("SELECT s FROM Supplier s", Supplier.class);
            query.setFirstResult(first);
            query.setMaxResults(pageSize);
            result = query.getResultList();
            System.out.println("Found " + result.size() + " suppliers.");
        }
        catch (Exception e) {
			e.printStackTrace();
        }
        return result;
    }

    public int countAllSuppliers() {
        Long count = em.createQuery("SELECT COUNT(s) FROM Supplier s", Long.class).getSingleResult();
        return count.intValue();
    }
  

}
