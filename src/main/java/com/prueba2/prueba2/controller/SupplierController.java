package com.prueba2.prueba2.controller;


import com.prueba2.prueba2.dao.SupplierDao;
import com.prueba2.prueba2.dto.SupplierLazy;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

import java.io.Serializable;

@Named
@ViewScoped
public class SupplierController implements Serializable {

    @PersistenceContext
    private EntityManager entityManager;

    private SupplierLazy lazySupplierDataModel;

    @PostConstruct
    public void init() {
        lazySupplierDataModel = new SupplierLazy(new SupplierDao(entityManager));
    }

    public SupplierLazy getLazySupplierDataModel() {
        return lazySupplierDataModel;
    }



}