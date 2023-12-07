package com.example.cinema.service;

import com.example.cinema.entity.Category;

import java.util.List;

public interface CategoryService {

    public Category getCategory(Long id);
    public List<Category> getAllCategory();
    public Category createCategory(Category category);
    public Category updateCategory(Long id, Category category);
    public void deleteCategory(Long id);
}
