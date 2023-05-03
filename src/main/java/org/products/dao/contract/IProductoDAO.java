package org.products.dao.contract;

import jakarta.enterprise.context.ApplicationScoped;

import org.products.dao.entity.ProductsEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IProductoDAO implements PanacheRepositoryBase<ProductsEntity, Long> {

}
