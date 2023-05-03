package org.products.services.contract;

import java.util.List;

import org.products.gen.type.Producto;

public interface IClienteDigitalService {

    Producto createProducto(Producto producto);

    List<Producto> getAllProductos();

    Producto updateProducto(Long id, Producto producto);

    void deleteProducto(Long id);
}
