//package com.java.service;
//
//
//import com.java.model.Person;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//
//
//@Service
//public class PersonService {
//    private final HashMap<String, Person> database;
//
//    public PersonService() {
//        database = new HashMap<>();
//        // You can add more persons here
//        database.put("Raj", new Person("Raj", "Raj's address"));
//    }
//
//    public Person findPersonByName(String name) {
//        return database.get(name);
//    }
//}
////
////    public Person getPersonDetails(String name) {
////        // Here you would generally interact with your repository/data source
////        // For simplicity, we're returning a dummy Person
////
////        Person person = new Person();
////        person.setName(name);
////        person.setAddress("Dummy Address for " + name);
////
////        return person;
////    }

