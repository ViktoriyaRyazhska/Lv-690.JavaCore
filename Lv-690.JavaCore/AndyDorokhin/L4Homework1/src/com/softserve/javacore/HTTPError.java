package com.softserve.javacore;

public enum HTTPError {
    CODE400("Bad Request"),
    CODE401("Unauthorized"),
    CODE402("Payment Required"),
    CODE403("Forbidden"),
    CODE404("Not Found"),
    CODE405("Method Not Allowed"),
    CODE406("Not Acceptable"),
    CODE407("Proxy Authentication Required"),
    CODE408("Request Timeout"),
    CODE409("Conflict"),
    CODE410("Gone");

    private final String name;

    HTTPError(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
