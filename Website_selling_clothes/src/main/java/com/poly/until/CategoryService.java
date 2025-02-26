package com.poly.until;

import com.poly.mode.Categories;
import com.poly.until.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Categories> findAll() {
        return categoryRepository.findAll();
    }

    public void save(Categories category) {
        categoryRepository.save(category);
    }

 
    
    public void deleteById(Long id) {
        categoryRepository.deleteById(id);
    }
}

