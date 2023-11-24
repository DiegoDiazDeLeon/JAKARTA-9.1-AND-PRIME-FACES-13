package com.prueba2.prueba2.controller;

import com.prueba2.prueba2.dao.MySupplierDao;
import com.prueba2.prueba2.dto.Supplier;
import com.prueba2.prueba2.dto.SupplierLazy;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.List;

@Named("mySupplierController")
@ViewScoped
public class MySupplierController implements Serializable {
    private List<Supplier> supplierList;

    private Supplier selectedSupplier;

    @Inject
    private MySupplierDao serviceDao;

    @PostConstruct
    public void init() {
        supplierList=serviceDao.getSuppliers();
    }

    //regresa supplier list de aqui
    public List<Supplier> getSupplierList() {
        return supplierList;
    }

    //regresa el suplier seleccionado
    public Supplier getSelectedSupplier() {
        return selectedSupplier;
    }

    //pone en el suplier seleccionado
    public void setSelectedSupplier(Supplier selectedSupplier) {
        this.selectedSupplier = selectedSupplier;
    }

    //pone el service de Dao en el dao
    public void setService(MySupplierDao serviceDao) {
        this.serviceDao = serviceDao;
    }


}
