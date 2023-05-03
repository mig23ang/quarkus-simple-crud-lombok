package org.products.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.products.gen.contract.ProductosProductoss;
import org.products.gen.type.Producto;
import org.products.services.impl.ProductsService;

public class ProductsController implements ProductosProductoss {

    @Inject
    ProductsService productsService;

    @Override
    public List<Producto> productosGet() {
        return productsService.getAllProductos();
    }

    @Override
    public void productosIdDelete(Long id) {
        productsService.deleteProducto(id);
    }

    @Override
    public Producto productosIdGet(Long id) {
        return null;
    }

    @Override
    public Producto productosIdPut(Long id, @Valid @NotNull Producto producto) {
        return productsService.updateProducto(id, producto);
    }

    @Override
    public Producto productosPost(@Valid @NotNull Producto producto) {
        return productsService.createProducto(producto);
    }

}