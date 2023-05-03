package org.products.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

import org.products.dao.contract.IClienteDAO;
import org.products.dao.entity.ProductsEntity;
import org.products.gen.type.Producto;
import org.products.services.contract.IClienteService;
import org.products.utils.ClienteMapper;

@ApplicationScoped
public class ClienteDigitalService implements IClienteService {

    @Inject
    IClienteDAO productDAO;

    @Transactional
    @Override
    public Producto createProducto(Producto producto) {
        ProductsEntity productEntity = new ProductsEntity();
        productEntity.nombre = producto.getNombre();
        productEntity.descripcion = producto.getDescripcion();
        productEntity.precio = producto.getPrecio();
        productDAO.persist(productEntity);

        ClienteMapper mapper = new ClienteMapper();
        return mapper.toProducto(productEntity);
    }

    @Override
    public List<Producto> getAllProductos() {
        List<ProductsEntity> productList = productDAO.listAll();
        List<Producto> productModelList = new ArrayList<>();

        for (ProductsEntity productEntity : productList) {
            ClienteMapper mapper = new ClienteMapper();
            Producto producto = mapper.toProducto(productEntity);
            productModelList.add(producto);
        }

        return productModelList;
    }

    @Override
    public void deleteProducto(Long id) {
        ProductsEntity productEntity = productDAO.findById(id);
        if (productEntity == null) {
            throw new NotFoundException("Product not found");
        }

        productDAO.deleteById(id);
    }

    @Override
    public Producto updateProducto(Long id, Producto producto) {
        ProductsEntity productEntity = productDAO.findById(id);
        if (productEntity == null) {
            throw new NotFoundException("Product not found");
        }

        productEntity.nombre = producto.getNombre();
        productEntity.descripcion = producto.getDescripcion();
        productEntity.precio = producto.getPrecio();
        productDAO.persist(productEntity);

        ClienteMapper mapper = new ClienteMapper();
        return mapper.toProducto(productEntity);
    }
}
