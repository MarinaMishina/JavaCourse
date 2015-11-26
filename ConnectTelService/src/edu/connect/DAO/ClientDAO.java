
package edu.connect.DAO;

import edu.connect.entities.Client;
import edu.connect.exception.ConnectTelServiceDAOException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ClientDAO extends AbstractDAO<Client> {

    private static final String FILE_NAME = "clients.bin";
    //public List<Client> clients;
    
    public ClientDAO() {
        super(Client.class);
    }

    @Override
    protected void saveCollection(List<Client> clients) throws ConnectTelServiceDAOException {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_NAME);
            try {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(clients);
            } finally {
                fos.close();
            }
        } catch (IOException ex) {
            throw new ConnectTelServiceDAOException(ex);
        }
        
    }

    @Override
    protected void loadCollection() throws ConnectTelServiceDAOException {
//         clients = new ArrayList<>();
//        try {
//            FileInputStream fis = new FileInputStream(FILE_NAME);
//            try {
//                ObjectInputStream ois = new ObjectInputStream(fis);
//                clients = (List<Client>)ois.readObject();
//            } catch (ClassNotFoundException ex) {
//            } finally {
//                fis.close();
//            }
//        } catch (IOException ex) {
//            throw new ConnectTelServiceDAOException(ex);
//        }
//    }

    }
}
        
    
