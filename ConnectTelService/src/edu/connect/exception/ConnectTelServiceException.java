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
public class ConnectTelServiceException extends Exception {

    public ConnectTelServiceException() {
    }

    public ConnectTelServiceException(String message) {
        super(message);
    }

    public ConnectTelServiceException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectTelServiceException(Throwable cause) {
        super(cause);
    }

    public ConnectTelServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}
