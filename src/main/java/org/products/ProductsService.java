package org.products;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

@ApplicationScoped
public class ProductsService {

    // listar todo los productos
    public List<ProductsModel> getAll() {
        List<ProductsEntity> productList = ProductsEntity.listAll();
        List<ProductsModel> productModelList = new ArrayList<>();

        for (ProductsEntity productEntity : productList) {
            ProductsModel productModel = new ProductsModel(
                    productEntity.id,
                    productEntity.nombre,
                    productEntity.descripcion,
                    productEntity.precio);
            productModelList.add(productModel);
        }

        return productModelList;
    }

    public ProductsModel getById(Long id) {
        ProductsEntity productEntity = ProductsEntity.findById(id);
        if (productEntity == null) {
            throw new NotFoundException("Product not found");
        }

        ProductsModel productModel = new ProductsModel(
                productEntity.id,
                productEntity.nombre,
                productEntity.descripcion,
                productEntity.precio);

        return productModel;
    }

    @Transactional
    public ProductsEntity create(ProductsModel product) {
        ProductsEntity productEntity = new ProductsEntity();
        productEntity.nombre = product.getNombre();
        productEntity.descripcion = product.getDescripcion();
        productEntity.precio = product.getPrecio();
        productEntity.persist();
        return productEntity;
    }

    @Transactional
    public ProductsModel update(ProductsModel productModel) {
        ProductsEntity entity = ProductsEntity.findById(productModel.getId());
        entity.nombre = productModel.getNombre();
        entity.descripcion = productModel.getDescripcion();
        entity.precio = productModel.getPrecio();
        ProductsEntity.persist(entity);
        return new ProductsModel(entity.id, entity.nombre, entity.descripcion, entity.precio);
    }

    @Transactional
    public void delete(Long id) {
        ProductsEntity.deleteById(id);
    }

}
