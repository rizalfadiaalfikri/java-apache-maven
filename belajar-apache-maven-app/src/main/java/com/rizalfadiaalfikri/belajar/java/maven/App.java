package com.rizalfadiaalfikri.belajar.java.maven;

import com.google.gson.Gson;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Gson gson = new Gson();

        Person person = new Person("Rizal Fadia Al Fikri");
        String json = gson.toJson(person);

        System.out.println(json);
    }
}
