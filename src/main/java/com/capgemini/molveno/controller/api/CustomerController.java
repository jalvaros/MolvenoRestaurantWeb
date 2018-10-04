package com.capgemini.molveno.controller.api;

import com.capgemini.molveno.model.Person;
import com.capgemini.molveno.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("person_api_controller")
@RequestMapping("/api/person")
public class PersonController {
    @Autowired
    private PersonService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public List<Person> get() {
        return null;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public Person getSingle(@PathVariable(name="id") int id) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public Person add(@RequestBody Person person) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Person update(@RequestBody Person person) {
        return null;
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@RequestBody Person person) {
        return false;
    }
}
