package org.products.services.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;
import javax.ws.rs.NotFoundException;

import org.products.dao.contract.IClienteDAO;
import org.products.dao.entity.ClienteBaseEntity;
import org.products.gen.type.ClienteBaseType;
import org.products.services.contract.IClienteDigitalService;
import org.products.utils.ClienteMapper;

@ApplicationScoped
public class ClienteDigitalService implements IClienteDigitalService {

    @Inject
    IClienteDAO clienteDAO;

    @Inject
    ClienteMapper clienteMapper;

    @Override
    @Transactional
    public ClienteBaseType createClienteBaseEntity(ClienteBaseEntity clienteBaseEntity) {
        ClienteBaseEntity clienteEntity = new ClienteBaseEntity();
        clienteEntity.setNumeroCliente(clienteBaseEntity.getNumeroCliente());
        clienteEntity.setTipoPersona(clienteBaseEntity.getTipoPersona());
        clienteEntity.setTipoDocumento(clienteBaseEntity.getTipoDocumento());
        clienteEntity.setNumeroDocumento(clienteBaseEntity.getNumeroDocumento());
        clienteEntity.setFechaExpedicionDocumento(clienteBaseEntity.getFechaExpedicionDocumento());
        clienteEntity.setPrimerNombre(clienteBaseEntity.getPrimerNombre());
        clienteEntity.setNumeroCelular(clienteBaseEntity.getNumeroCelular());
        clienteEntity.setSegundoNombre(clienteBaseEntity.getSegundoNombre());
        clienteEntity.setPrimerApellido(clienteBaseEntity.getPrimerApellido());
        clienteEntity.setSegundoApellido(clienteBaseEntity.getSegundoApellido());
        clienteEntity.setCorreoElectronico(clienteBaseEntity.getCorreoElectronico());
        clienteDAO.persist(clienteEntity);

        return clienteMapper.toClienteBaseType(clienteEntity);
    }

    @Override
    public List<ClienteBaseType> getAllClienteBaseEntitys() {
        List<ClienteBaseEntity> clientes = clienteDAO.listAll();
        return clienteMapper.toClienteBaseTypeList(clientes);
    }

    @Override
    @Transactional
    public ClienteBaseType updateClienteBaseEntity(Long id, ClienteBaseEntity clienteBaseEntity) {
        ClienteBaseEntity clienteEntity = clienteDAO.findById(id);
        if (clienteEntity == null) {
            throw new NotFoundException("Cliente with id " + id + " not found");
        }
        clienteEntity.setNumeroCliente(clienteBaseEntity.getNumeroCliente());
        clienteEntity.setTipoPersona(clienteBaseEntity.getTipoPersona());
        clienteEntity.setTipoDocumento(clienteBaseEntity.getTipoDocumento());
        clienteEntity.setNumeroDocumento(clienteBaseEntity.getNumeroDocumento());
        clienteEntity.setFechaExpedicionDocumento(clienteBaseEntity.getFechaExpedicionDocumento());
        clienteEntity.setPrimerNombre(clienteBaseEntity.getPrimerNombre());
        clienteEntity.setNumeroCelular(clienteBaseEntity.getNumeroCelular());
        clienteEntity.setSegundoNombre(clienteBaseEntity.getSegundoNombre());
        clienteEntity.setPrimerApellido(clienteBaseEntity.getPrimerApellido());
        clienteEntity.setSegundoApellido(clienteBaseEntity.getSegundoApellido());
        clienteEntity.setCorreoElectronico(clienteBaseEntity.getCorreoElectronico());

        ClienteMapper mapper = new ClienteMapper();
        return mapper.toClienteBaseType(clienteEntity);
    }

    @Override
    @Transactional
    public void deleteClienteBaseEntity(Long id) {
        ClienteBaseEntity clienteEntity = clienteDAO.findById(id);
        if (clienteEntity == null) {
            throw new NotFoundException("Cliente with id " + id + " not found");
        }
        clienteDAO.delete(clienteEntity);
    }
}
