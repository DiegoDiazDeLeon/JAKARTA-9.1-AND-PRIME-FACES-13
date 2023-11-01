package com.prueba2.prueba2;


import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class greeting {

    public String generateGreet(String name){
        return "Eres "+name;
    }
}
