package com.example.cinema.controller;

import com.example.cinema.entity.Category;
import com.example.cinema.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/{id}")//{} -> dinamik variable olduğunu belirtir
    public ResponseEntity<Category> getCategory(@PathVariable Long id) {
        Category category = categoryService.getCategory(id);
        return ResponseEntity.status(HttpStatus.OK).body(category);
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Category>> getAllCategory() {
        List<Category> category = categoryService.getAllCategory();
        return ResponseEntity.ok(category);
    }

    @PostMapping("/create")
    public ResponseEntity<Category> createCategory(@RequestBody Category category) {
        Category createdCategory = categoryService.createCategory(category);
        return ResponseEntity.ok(createdCategory);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Category> updateCategory(@PathVariable Long id, @RequestBody Category category) {
        Category updatedCategory = categoryService.updateCategory(id, category);
        return ResponseEntity.ok(updatedCategory);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id){
        categoryService.deleteCategory(id); // Response var ancak Body yok.
    } // Bir response döndüğünde içinde ihtiyaca göre body dönebilir veya dönmeyebilir.
}
