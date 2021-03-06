package com.capgemini.molveno.controller.api;

import com.capgemini.molveno.model.Ingredient;
import com.capgemini.molveno.model.Ingredient;
import com.capgemini.molveno.model.Unit;
import com.capgemini.molveno.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import java.util.LinkedList;
import java.util.List;

@RestController("ingredient_api")
@RequestMapping("/api/ingredient")
public class IngredientController {
    @Autowired
    private IngredientService service;

    @RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
    public List<Ingredient> get() {
        return service.all();
    }

    @RequestMapping(value = "/for/{id}", method = RequestMethod.GET, produces= MediaType.APPLICATION_JSON_VALUE)
    public List<Ingredient> getIngredientsOnMenuItem(@PathVariable(name="id") int id) {
        return service.all();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
    public Ingredient add(@RequestBody Ingredient ingredient) {
        int id = service.create(ingredient);
        ingredient.setId(id);
        return ingredient;
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_VALUE)
    public Ingredient update(@PathVariable int id, @RequestBody Ingredient ingredient) {
        return service.update(id, ingredient);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean delete(@PathVariable(name="id") int id) {
        service.delete(id);
        return true;
    }
}
