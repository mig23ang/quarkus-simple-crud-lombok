package org.products.utils;

import java.util.ArrayList;
import java.util.List;

import org.products.dao.entity.ClienteBaseEntity;
import org.products.gen.type.ClienteBaseType;

public class ClienteMapper {

    public ClienteBaseType toClienteBaseType(ClienteBaseEntity clienteBaseEntity) {
        ClienteBaseType cliente = new ClienteBaseType();
        cliente.setId(clienteBaseEntity.getId());
        cliente.setCorreoElectronico(clienteBaseEntity.getCorreoElectronico());
        cliente.setFechaExpedicionDocumento(clienteBaseEntity.getFechaExpedicionDocumento());
        cliente.setNumeroCelular(clienteBaseEntity.getNumeroCelular());
        cliente.setNumeroCliente(clienteBaseEntity.getNumeroCliente());
        cliente.setPrimerApellido(clienteBaseEntity.getPrimerApellido());
        cliente.setPrimerNombre(clienteBaseEntity.getPrimerNombre());
        cliente.setSegundoApellido(clienteBaseEntity.getSegundoApellido());
        cliente.setSegundoNombre(clienteBaseEntity.getSegundoNombre());
        cliente.setTipoDocumento(clienteBaseEntity.getTipoDocumento());
        cliente.setTipoPersona(clienteBaseEntity.getTipoPersona());

        return cliente;
    }

    public List<ClienteBaseType> toClienteBaseTypeList(List<ClienteBaseEntity> clientes) {
        List<ClienteBaseType> clienteBaseTypes = new ArrayList<>();
        for (ClienteBaseEntity clienteBaseEntity : clientes) {
            ClienteBaseType clienteBaseType = toClienteBaseType(clienteBaseEntity);
            clienteBaseTypes.add(clienteBaseType);
        }
        return clienteBaseTypes;
    }

}