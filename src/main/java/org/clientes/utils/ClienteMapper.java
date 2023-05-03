package org.clientes.utils;

import org.clientes.dao.entity.ClienteEntity;
import org.clientes.gen.type.ClienteT;

public class ClienteMapper {

    public ClienteT toclienteT(ClienteEntity clienteEntity) {
        ClienteT clienteT = new ClienteT();
        clienteT.setId(clienteEntity.id);
        clienteT.setPrimerNombre(clienteEntity.primerNombre);
        clienteT.setPrimerApellido(clienteEntity.primerApellido);
        clienteT.setCorreoElectronico(clienteEntity.correoElectronico);
        return clienteT;
    }
}