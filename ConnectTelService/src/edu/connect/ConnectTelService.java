
package edu.connect;

import edu.connect.entities.Client;
import edu.connect.logic.ConnectTelServiceFacade;
import java.util.List;
import java.util.ListIterator;



public class ConnectTelService {

    public static void main(String[] args) {
        
        ConnectTelServiceFacade facade = new ConnectTelServiceFacade();
        
        Client client = new Client();
        client.setName("Client1");
        client.setLogin("C1_login");
        client.setPassword("C1_password");
        
        facade.addClient(client);
        List<Client> lc = facade.findAllClients();
        if (lc.isEmpty()) {
            System.out.println("List is empty");
        }
        else {
            for (ListIterator<Client> li = lc.listIterator(); li.hasNext();) {
                String name = li.next().getName();
                System.out.println(name);
            }
            System.out.println("List is NOT empty");
        }
    }
    
}
