package com.oauth2.springsocial.exception;

public class OAuth2AuthenticationProcessingException extends RuntimeException{

    public OAuth2AuthenticationProcessingException(String msg, Throwable t) {
        super(msg, t);
    }
}
