package io.gregoryweiss.java.javaee.javaws.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class HelloWorld {

    @WebMethod
    public String sayHello(String name) {
        return "hello " + name;
    }
}
