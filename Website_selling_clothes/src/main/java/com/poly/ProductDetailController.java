package com.poly;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.poly.mode.product;
import com.poly.until.ProductRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller


public class ProductDetailController {
	@Autowired
	ProductRepository productRepository;
	@GetMapping("/product/detail/{id}")
	public String getMethodName(@PathVariable("id") Long id,Model model ) {
		product product =  productRepository.findById(id).get();
		model.addAttribute("product",product);
		return "product-detail";
	}
	

}
