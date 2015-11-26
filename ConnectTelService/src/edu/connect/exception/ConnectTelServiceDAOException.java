/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.connect.exception;

/**
 *
 * @author marina
 */
public class ConnectTelServiceDAOException extends ConnectTelServiceException {

    public ConnectTelServiceDAOException() {
    }

    public ConnectTelServiceDAOException(String message) {
        super(message);
    }

    public ConnectTelServiceDAOException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectTelServiceDAOException(Throwable cause) {
        super(cause);
    }

    public ConnectTelServiceDAOException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
