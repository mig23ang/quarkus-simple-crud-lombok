package org.clientes.dao.contract;

import javax.enterprise.context.ApplicationScoped;

import org.clientes.dao.entity.ClienteEntity;

import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;

@ApplicationScoped
public class IClienteDAO implements PanacheRepositoryBase<ClienteEntity, Long> {

}
