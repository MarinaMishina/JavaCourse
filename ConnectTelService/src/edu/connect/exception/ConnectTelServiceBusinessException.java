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
public class ConnectTelServiceBusinessException extends ConnectTelServiceException {

    public ConnectTelServiceBusinessException() {
    }

    public ConnectTelServiceBusinessException(String message) {
        super(message);
    }

    public ConnectTelServiceBusinessException(String message, Throwable cause) {
        super(message, cause);
    }

    public ConnectTelServiceBusinessException(Throwable cause) {
        super(cause);
    }

    public ConnectTelServiceBusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
