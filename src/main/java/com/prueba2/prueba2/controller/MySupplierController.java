package com.prueba2.prueba2.controller;

import java.io.Serializable;
import java.util.List;

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
        printLazyModelContent();
    }

    public LazyDataModel<Supplier> getLazyModel() {
        return lazyModel;
    }


    public void setService(MySupplierDao supplierDao) {
      this.supplierDao = supplierDao;
    }

    private void printLazyModelContent() {
        List<Supplier> suppliers = lazyModel.load(0, 10, null, null);
        System.out.println("LazyModel Content:");

        for (Supplier supplier : suppliers) {
            System.out.println("Supplier: " + supplier.getName() + ", ID: " + supplier.getSupplierId());
        }
    }




}
