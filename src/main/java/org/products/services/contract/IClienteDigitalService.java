package org.products.services.contract;

import java.util.List;

import org.products.dao.entity.ClienteBaseEntity;
import org.products.gen.type.ClienteBaseType;

public interface IClienteDigitalService {

    ClienteBaseType createClienteBaseEntity(ClienteBaseEntity clienteBaseEntity);

    List<ClienteBaseType> getAllClienteBaseEntitys();

    ClienteBaseType updateClienteBaseEntity(Long id, ClienteBaseEntity clienteBaseEntity);

    void deleteClienteBaseEntity(Long id);
}
