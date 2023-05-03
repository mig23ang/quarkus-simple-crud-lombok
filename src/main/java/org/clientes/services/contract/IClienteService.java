package org.clientes.services.contract;

import java.util.List;

import org.clientes.gen.type.ClienteT;

public interface IClienteService {

    ClienteT createCliente(ClienteT cliente);

    List<ClienteT> getAllClientes();

    ClienteT updateCliente(Long id, ClienteT cliente);

    void deleteCliente(Long id);
}
