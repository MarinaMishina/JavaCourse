
package edu.connect.entities;

import java.io.Serializable;

public class Client implements Serializable {
    
    private long clientId;
    private String name;
    private String login;
    private String password;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (int) (this.clientId ^ (this.clientId >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Client other = (Client) obj;
        return true;
    }

    @Override
    public Object clone() {
        Client client = new Client();
        client.setClientId(clientId);
        client.setName(name);
        client.setLogin(login);
        client.setPassword(password);
        return client;
    }

    
}
