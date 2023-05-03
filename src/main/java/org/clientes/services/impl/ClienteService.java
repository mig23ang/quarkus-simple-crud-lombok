package org.clientes.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.transaction.Transactional;

import org.clientes.dao.contract.IClienteDAO;
import org.clientes.dao.entity.ClienteEntity;
import org.clientes.gen.type.ClienteT;
import org.clientes.services.contract.IClienteService;
import org.clientes.utils.ClienteMapper;

@ApplicationScoped
public class ClienteService implements IClienteService {

    @Inject
    IClienteDAO clienteDAO;

    @Inject
    ClienteMapper clienteMapper;

    @Transactional
    @Override
    public ClienteT createCliente(ClienteT cliente) {
        ClienteEntity clienteEntity = new ClienteEntity();
        clienteEntity.primerNombre = cliente.getPrimerNombre();
        clienteEntity.primerApellido = cliente.getPrimerApellido();
        clienteEntity.correoElectronico = cliente.getCorreoElectronico();

        clienteDAO.persist(clienteEntity);

        return clienteMapper.toclienteT(clienteEntity);
    }

    @Override
    public void deleteCliente(Long id) {
        clienteDAO.deleteById(id);
    }

    @Override
    public List<ClienteT> getAllClientes() {
        List<ClienteEntity> clientesList = clienteDAO.listAll();
        List<ClienteT> clienteListType = new ArrayList<>();

        for (ClienteEntity clientesEntity : clientesList) {
            ClienteT clienteT = clienteMapper.toclienteT(clientesEntity);
            clienteListType.add(clienteT);
        }
        return clienteListType;
    }

    @Override
    public ClienteT updateCliente(Long id, ClienteT cliente) {
        // TODO Auto-generated method stub
        return null;
    }

}
