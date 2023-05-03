package org.products.dao.contract;

import javax.enterprise.context.ApplicationScoped;

import org.products.dao.entity.ClienteBaseEntity;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IClienteDAO implements PanacheRepositoryBase<ClienteBaseEntity, Long> {

}
