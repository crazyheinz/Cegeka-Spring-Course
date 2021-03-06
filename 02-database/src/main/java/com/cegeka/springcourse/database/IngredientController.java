package com.cegeka.springcourse.database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
@RequestMapping("ingredients")
public class IngredientController {

    @Autowired
    private IngredientRepository ingredientRepository;

    @GetMapping("/amount")
    public int getNumberOfIngredientsInStock() {
        return ingredientRepository.findAll().size();
    }

    @GetMapping("/glutenfree")
    public List<String> getGlutenFreeProductNames() {
        return null;
    }

    @GetMapping("/glutencontaining")
    public List<String> getGlutenContainingProductNames() {
        return null;
    }

    @GetMapping("/add/ingredient/{name}")
    public void addIngredient(@PathVariable("name") String name) {
    }

    @GetMapping("/remove/ingredient/{id}")
    public void removeIngredient(@PathVariable("id") String id) {
    }

    @GetMapping("/update/ingredient/{id}/{name}")
    public void updateIngredientName(@PathVariable("id") String id, @PathVariable("name") String name) {
    }
}
