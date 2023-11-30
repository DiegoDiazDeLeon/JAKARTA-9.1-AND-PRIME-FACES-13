package com.prueba2.prueba2.controller;

import com.prueba2.prueba2.dao.MySupplierDao;
import com.prueba2.prueba2.dto.Supplier;
import com.prueba2.prueba2.dto.SupplierLazy;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.model.LazyDataModel;

import java.io.Serializable;
import java.util.List;

@Named("mySupplierController")
@ViewScoped
public class MySupplierController implements Serializable {

    @Inject
    MySupplierDao supplierDao;
    private LazyDataModel<Supplier> lazyModel;

    //private List<Supplier> supplierList;

    private Supplier selectedSupplier;

    @PostConstruct
    public void init() {
        lazyModel = new SupplierLazy(supplierDao);
    }

    public LazyDataModel<Supplier> getLazyModel() {
        return lazyModel;
    }

    //regresa supplier list de aqui
    //public List<Supplier> getSupplierList() {
      //  return supplierList;
    //}

    //regresa el suplier seleccionado
    public Supplier getSelectedSupplier() {
        return selectedSupplier;
    }

    //pone en el suplier seleccionado
    public void setSelectedSupplier(Supplier selectedSupplier) {
        this.selectedSupplier = selectedSupplier;
    }

    //pone el service de Dao en el dao
    public void setService(MySupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }



}
