package org.products.utils;

import org.products.dao.entity.ProductsEntity;
import org.products.gen.type.Producto;

public class ClienteMapper {

    public Producto toProducto(ProductsEntity productEntity) {
        Producto producto = new Producto();
        producto.setId(productEntity.id);
        producto.setNombre(productEntity.nombre);
        producto.setDescripcion(productEntity.descripcion);
        producto.setPrecio(productEntity.precio);
        return producto;
    }
}