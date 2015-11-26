
package edu.connect.logic;

import edu.connect.entities.Client;
import edu.connect.exception.ConnectTelServiceBusinessException;
import java.util.List;


public class ConnectTelServiceFacade {

    
    private final ClientManager clientManager;
    private final ContractManager contractManager;
    private final ServiceManager serviceManager;

    public ConnectTelServiceFacade() {
       clientManager = new ClientManager();
       contractManager = new ContractManager();
       serviceManager = new ServiceManager();
    }
    
    public void addClient(Client client) {
        try {
            
            clientManager.addClient(client);
        } catch (ConnectTelServiceBusinessException ex) {
            ex.printStackTrace();
        }

    }
    
    public void updateClient(Client client)  {
        try {
            clientManager.updateClient(client);
        } catch (ConnectTelServiceBusinessException ex) {
            ex.printStackTrace();
        }
    }
    
    public void deleteClient(Client client) {
        try {
            clientManager.deleteClient(client);
        } catch (ConnectTelServiceBusinessException ex) {
           ex.printStackTrace();
        }
    }
    
    public Client findClient(long clientId) throws ConnectTelServiceBusinessException {
        Client tmp = clientManager.findClient(clientId);
        return tmp;
    }
    
    public List<Client> findAllClients() {
        return clientManager.findAllClients();
    }

}
