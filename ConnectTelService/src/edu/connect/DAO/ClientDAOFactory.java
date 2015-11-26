
package edu.connect.DAO;

/**
 *
 * @author marina
 */
public class ClientDAOFactory {
    
    public static ClientDAO getClientDAO() {
        return new ClientDAO();
    }
    
}
