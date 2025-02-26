package com.poly.until;


import com.poly.mode.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<product, Long> {
    List<product> findByIsDeleteFalse(); 
        List<product> findByNameContainingIgnoreCase(String keyword);
    }


