package org.clientes.controller;

import java.util.List;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.clientes.gen.contract.ClienteTApi;
import org.clientes.gen.type.ClienteT;
import org.clientes.services.impl.ClienteService;

public class ClientesController implements ClienteTApi {

    @Inject
    ClienteService clienteService;

    @Override
    public List<ClienteT> clienteTGet() {
        return clienteService.getAllClientes();
    }

    @Override
    public void clienteTIdDelete(Long id) {
        clienteService.deleteCliente(id);
    }

    @Override
    public ClienteT clienteTIdGet(Long id) {
        return null;
    }

    @Override
    public ClienteT clienteTIdPut(Long id, @Valid @NotNull ClienteT clienteT) {
        return clienteService.updateCliente(id, clienteT);
    }

    @Override
    public ClienteT clienteTPost(@Valid @NotNull ClienteT clienteT) {
        return clienteService.createCliente(clienteT);
    }

}
