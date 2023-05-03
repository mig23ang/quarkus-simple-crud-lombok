package org.products.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.products.gen.contract.ClientesApi;
import org.products.gen.type.ClienteBaseType;
import org.products.services.impl.ClienteDigitalService;

public class ClienteController implements ClientesApi {

    @Inject
    ClienteDigitalService clienteService;

    @Override
    public void clientesEditarIdPut(Long id, @Valid @NotNull ClienteBaseType clienteBaseType) {
        clienteService.updateClienteBaseEntity(id, null);
    }

    @Override
    public void clientesEliminarIdDelete(Long id) {
        clienteService.deleteClienteBaseEntity(id);
    }

    @Override
    public List<ClienteBaseType> clientesGet() {
        return clienteService.getAllClienteBaseEntitys();
    }

    @Override
    public void clientesIdGet(Long id) {

    }

    @Override
    public ClienteBaseType clientesPost(@Valid @NotNull ClienteBaseType clienteBaseType) {
        return clienteService.createClienteBaseEntity(null);
    }

}