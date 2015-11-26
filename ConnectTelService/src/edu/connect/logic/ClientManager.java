/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connect.logic;

import edu.connect.DAO.ClientDAO;
import edu.connect.DAO.ClientDAOFactory;
import edu.connect.entities.Client;
import edu.connect.exception.ConnectTelServiceBusinessException;
import edu.connect.exception.ConnectTelServiceDAOException;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author marina
 */
public class ClientManager {
    
    private ClientDAO dao = ClientDAOFactory.getClientDAO();
    
    public void addClient(Client client) throws ConnectTelServiceBusinessException {
        try {
            long clientId = dao.generateId();
            client.setClientId(clientId);
            Client clientClone = (Client)client.clone();
            dao.add(clientClone);
        } catch (ConnectTelServiceDAOException ex) {
            throw new ConnectTelServiceBusinessException(ex);
        }

    }
    
    public void updateClient(Client client) throws ConnectTelServiceBusinessException {
        try {
            dao.update(client);
        } catch (ConnectTelServiceDAOException ex) {
            throw new ConnectTelServiceBusinessException(ex);
        }

    }
    
    public void deleteClient(Client client) throws ConnectTelServiceBusinessException {
        try {
            dao.delete(client);
        } catch (ConnectTelServiceDAOException ex) {
            throw new ConnectTelServiceBusinessException(ex);
        }

    }
    
    public Client findClient(long clientId) {
        try {
            return dao.find(clientId);
        } catch (ConnectTelServiceDAOException ex) {

        }
        return null;
    }
    
    public List<Client> findAllClients() {
        try {
            return dao.findAll();
        } catch (ConnectTelServiceDAOException ex) {

        }
        return Collections.emptyList();
    }
}
