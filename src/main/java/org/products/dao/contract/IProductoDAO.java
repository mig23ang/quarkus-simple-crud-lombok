package org.products.dao.contract;

import javax.enterprise.context.ApplicationScoped;

import org.products.dao.entity.ProductsEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IProductoDAO implements PanacheRepositoryBase<ProductsEntity, Long> {

}
