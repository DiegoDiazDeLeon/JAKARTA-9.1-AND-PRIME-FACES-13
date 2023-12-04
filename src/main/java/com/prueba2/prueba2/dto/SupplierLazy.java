package com.prueba2.prueba2.dto;

import java.util.List;
import java.util.Map;

import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;

import com.prueba2.prueba2.dao.MySupplierDao;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class SupplierLazy extends LazyDataModel<Supplier> {


    private MySupplierDao supplierDao;

    @Inject
    public SupplierLazy(MySupplierDao supplierDao) {
        this.supplierDao = supplierDao;
        
    }

    @Override
    public int count(Map<String, FilterMeta> map) {
        return supplierDao.countAllSuppliers();
    }

    @Override
    public List<Supplier> load(int first, int pageSize, Map<String, SortMeta> sortBy, Map<String, FilterMeta> filterBy) {
        System.out.println("Loading suppliers: first=" + first + ", pageSize=" + pageSize);
        List<Supplier> suppliers = supplierDao.getSuppliers(first, pageSize);
        System.out.println("Retrieved " + suppliers.size() + " suppliers.");
        //this.setRowCount(supplierDao.countAllSuppliers());
        return suppliers;
    }

}
