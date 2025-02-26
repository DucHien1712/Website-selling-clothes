package com.poly.mode;

import com.poly.mode.product;
import com.poly.until.ProductRepository;
import com.poly.until.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ShopController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService; // Dùng instance, không gọi tĩnh

    @GetMapping("/shop/index")
    public String shop(Model model) {
        List<product> products = productRepository.findByIsDeleteFalse();
        model.addAttribute("products", products);
        return "productshop";
    }
    @GetMapping("/shop/search")
    public String searchProducts(@RequestParam("keyword") String keyword, Model model) {
        List<product> searchResults = productService.searchProductsByName(keyword); // Sử dụng instance
        model.addAttribute("products", searchResults);
        model.addAttribute("keyword", keyword);
        return "productshop";
    }
}
