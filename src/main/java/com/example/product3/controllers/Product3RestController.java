package com.example.product3.controllers;

import com.example.product3.entities.Product3;
import com.example.product3.repos.Product3Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Product3RestController {
    @Autowired
    Product3Repository repository;


    @RequestMapping(value="/product3/",method = RequestMethod.GET)
    public Iterable<Product3> getProduct3(){
        return repository.findAll();

    }
    @RequestMapping(value="/product3/{product3name}",method = RequestMethod.GET)
    public Product3 getProduct3(@PathVariable("product3name")String product3name){
        return repository.findById(product3name).get();
    }
    @RequestMapping(value="/product3/{product3name}",method = RequestMethod.POST)
    public Product3 createProduct3(@RequestBody Product3 product3){
        Product3 save = repository.save(product3);
        return save;
    }
    @RequestMapping(value="/product3/{product3name}",method = RequestMethod.PUT)
    public Product3 updateProduct3(@RequestBody Product3 product3) {
        return repository.save(product3);
    }
    @RequestMapping(value="/products3/{product3name}",method = RequestMethod.DELETE)
    public void deleteProduct3(@PathVariable("product3name")String product3name) {
        repository.deleteById(product3name);
    }

}
