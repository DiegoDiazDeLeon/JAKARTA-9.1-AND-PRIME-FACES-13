package com.prueba2.prueba2.controller;

import java.io.Serializable;

import org.primefaces.model.LazyDataModel;

import com.prueba2.prueba2.dao.MySupplierDao;
import com.prueba2.prueba2.dto.Supplier;
import com.prueba2.prueba2.dto.SupplierLazy;

import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named("mySupplierController")
@ViewScoped
public class MySupplierController implements Serializable {

    @Inject
    MySupplierDao supplierDao;
    
    private LazyDataModel<Supplier> lazyModel;

    @PostConstruct
    public void init() {
        System.out.println("*******MySupplierController bean initialized.**********");
        lazyModel = new SupplierLazy(supplierDao);
        lazyModel.setRowCount(supplierDao.countAllSuppliers());
    }

    public LazyDataModel<Supplier> getLazyModel() {
        return lazyModel;
    }


    public void setService(MySupplierDao supplierDao) {
      this.supplierDao = supplierDao;
    }




}
