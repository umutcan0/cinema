package com.example.cinema.service;

import com.example.cinema.entity.Category;
import com.example.cinema.exception.CategoryNotFoundException;
import com.example.cinema.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category getCategory(Long id){
        return categoryRepository.findById(id).orElseThrow(() ->{
            throw new CategoryNotFoundException("Category mevcut değil",id);
        });
    }

    @Override
    public List<Category> getAllCategory() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category updateCategory(Long id, Category category){
        Category existingCategory = categoryRepository.findById(id).orElseThrow(() ->
                new CategoryNotFoundException("Category bulunamadı", id));

        existingCategory.setName(category.getName());

        return categoryRepository.save(existingCategory);
    }

    @Override
    public void deleteCategory(Long id){
        categoryRepository.deleteById(id);
    }

}

