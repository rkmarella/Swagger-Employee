package com.java.controller;

import com.java.model.Person;

import org.springframework.web.bind.annotation.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("")
@Api(tags = "Person API")


public class PersonController {


    private final Person person;
    private final Person anotherPerson;

    public PersonController() {
        person = new Person();
        anotherPerson = new Person();

        person.setName("Raj");
        person.setId(1);
        person.setAddress("Texas");

        anotherPerson.setName("John");
        anotherPerson.setId(2);
        anotherPerson.setAddress("California");
    }

    @GetMapping("/Raj")
    @ApiOperation("Get person's name")
    public String getPersonName() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(person.getId()).append("\n");
        sb.append("Name: ").append(person.getName()).append("\n");
        sb.append("Address: ").append(person.getAddress()).append("\n");
        return sb.toString();
    }

    @GetMapping("/John")
    @ApiOperation("Get another person's name")
    public String getAnotherPersonName() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(anotherPerson.getId()).append("\n");
        sb.append("Name: ").append(anotherPerson.getName()).append("\n");
        sb.append("Address: ").append(anotherPerson.getAddress()).append("\n");
        return sb.toString();
    }
//
//    private final Person person;
//
//    public PersonController() {
//        person = new Person();
//
//        person.setName("Raj");
//        person.setId(1);
//        person.setAddress("Texas");
//    }
//
//    @GetMapping("/name")
//    @ApiOperation("Get person's name")
//    public String getPersonName() {
//        StringBuilder sb = new StringBuilder();
//        sb.append("ID: ").append(person.getId()).append("\n");
//        sb.append("Name: ").append(person.getName()).append("\n");
//        sb.append("Address: ").append(person.getAddress()).append("\n");
//
//        return sb.toString();
//    }


}