package com.project.shopapp.controllers;

import com.project.shopapp.dtos.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

 

@RestController
@RequestMapping ("${api.prefix}/categories")
//@Validated

public class CategoryController {
    //hien tat ca danh muc
    @GetMapping("") //http://localhost:8088/${api.prefix}/categories?page=1&limit=10
    public ResponseEntity<String> getAllCategories(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit
    ){
        return ResponseEntity.ok(String.format("Get all categories with page: %d and limit: %d", page, limit));
    }
    @PostMapping("")
    // tham so truyen vao la object => Data Transfer Object (DTO) = Request Object
    public ResponseEntity<?> insertCategory(
            @Valid @RequestBody CategoryDTO categoryDTO,
            BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            List<String> errorMessage = bindingResult.getFieldErrors()
                    .stream()
                    .map(FieldError::getDefaultMessage)
                    .toList();
            return ResponseEntity.badRequest().body(errorMessage);
            }
        return ResponseEntity.ok("Create category: "+categoryDTO);
    }
    @PutMapping("/{id}")
    public ResponseEntity<String> updateCategory(@PathVariable("id") Long id){
        return ResponseEntity.ok("Update category with id: " + id);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(@PathVariable("id") Long id){
        return ResponseEntity.ok("Delete category with id: " + id);
    }
}
