package com.lucas.produto.resources;

import com.lucas.produto.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/categories")
public class CategoryResources {

    @GetMapping
    public ResponseEntity<List<Category>> findAll(){
        return ResponseEntity.ok().body();

    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<> findById(@PathVariable Long id){
        return ResponseEntity.ok.body();

    }


}
