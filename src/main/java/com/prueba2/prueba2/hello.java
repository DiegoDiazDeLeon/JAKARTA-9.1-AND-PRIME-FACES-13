package com.prueba2.prueba2;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;


@RequestScoped
@Named
public class hello {

    @Inject
    private greeting greet;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGreet(){
        return greet.generateGreet(name);
    }




}
