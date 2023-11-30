package com.prueba2.prueba2.dto;

import com.prueba2.prueba2.dao.MySupplierDao;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

import java.util.Collections;
import java.util.List;
import java.util.Map;

@Named
public class SupplierLazy extends LazyDataModel<Supplier> {


    private MySupplierDao supplierDao;

    public SupplierLazy(MySupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public int count(Map<String, FilterMeta> map) {
        return 0;
    }

    @Override
    public List<Supplier> load(int first, int pageSize, Map<String, SortMeta> multiSortMeta, Map<String, FilterMeta> multiFilterMeta) {
            return supplierDao.getSuppliers(first, pageSize);
    }

}
