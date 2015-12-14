package com.safetyculture.exception;

/**
 * Created by Tannu on 11/3/2015.
 */
public class AuthenticationException extends SafetyCultureException{

    public AuthenticationException(String message, String requestId, Integer statusCode) {
        super(message, requestId, statusCode);
    }

    private static final long serialVersionUID = 1L;
}
