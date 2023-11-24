package com.prueba2.prueba2.dto;



import com.prueba2.prueba2.dao.SupplierDao;
import org.primefaces.model.FilterMeta;
import org.primefaces.model.LazyDataModel;
import org.primefaces.model.SortMeta;
import org.primefaces.model.SortOrder;

import java.util.List;
import java.util.Map;

public class SupplierLazy extends LazyDataModel<Supplier> {

    private final SupplierDao supplierDao;

    public SupplierLazy(SupplierDao supplierDao) {
        this.supplierDao = supplierDao;
    }

    @Override
    public int count(Map<String, FilterMeta> map) {
        return 0;
    }

    @Override
    public List<Supplier> load(int first, int pageSize, Map<String, SortMeta> multiSortMeta, Map<String, FilterMeta> multiFilterMeta) {
        // Tu lógica para cargar los datos paginados
        List<Supplier> suppliers = supplierDao.obtenerSuppliersPaginados(first, pageSize);
        int cantidadTotalSuppliers = supplierDao.obtenerCantidadTotalSuppliers();
        setRowCount(cantidadTotalSuppliers);
        return suppliers;
    }
}
