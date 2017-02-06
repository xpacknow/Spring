package com.info.xpacknow.controller;

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.info.xpacknow.domain.Product;

import com.info.xpacknow.service.ProductService;

@Controller

public class ProductController {

	@Autowired
	private ProductService productService;

	 private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	 
	 

	@RequestMapping(value = "/products/all", method = RequestMethod.GET)
	public String allProdukcts(Model model) {

		logger.info("wiadomosc3");
		model.addAttribute("produkt2", productService.getAllProducts());

		return "productsAll";
	}

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String getProduct(@ModelAttribute("form") Product addproduct) {

		logger.info("wiadomosc");
		
		return "dodajProdukt";
	}

	@RequestMapping(value = "/products", method = RequestMethod.POST)
	public String putProduct(@ModelAttribute("form") Product addproduct, HttpServletRequest request) {

		logger.info("wiadomosc2");
		
		 
		
		MultipartFile zdjecie = addproduct.getZdjecie();

			if (zdjecie!=null && !zdjecie.isEmpty()) {
	       try {
	    	  
	    	   
	    	   zdjecie.transferTo(new File("D:\\pliki_git\\x_projekt\\src\\main\\webapp\\resources\\"+addproduct.getNazwa()+".png"));
		       } catch (Exception e) {
				throw new RuntimeException("Pr�ba zapisu obrazka zako�czona niepowodzeniem", e);
		   }
		   }
		

		productService.addProduct(addproduct);

		return "forward:/productsAll";

	}
	
	
	@RequestMapping(value = "/products/edit", method = RequestMethod.GET)
	public String editProduct(@ModelAttribute("form") Product product, @RequestParam("id") long id ,Model model) {

	
		model.addAttribute("product2", productService.getProductById(id));
		
		
		return "productsEdit";
	}
	
	@RequestMapping(value = "/products/edit", method = RequestMethod.POST)
	public String editPutProduct(@ModelAttribute("form") Product product, @RequestParam("id") long id ,Model model) {

	
	productService.updateProduct(product,id);
	
		
	
		return "redirect:/products/all";
	}

	
	
	@RequestMapping(value = "/products/delete", method = RequestMethod.GET)
	public String deleteProduct(@ModelAttribute("form") Product product, @RequestParam("id") long id ,Model model) {

	
	System.out.println(id);

		productService.delateProduct(id);
		
		
		return "productsAll";
	}
	
	@RequestMapping(value = "/productss")
	public String list(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "products";
	}
	
	@RequestMapping(value = "/product")
	public String getProductById(Model model, @RequestParam("id") String productId) {

		model.addAttribute("products", productService.getProductById(Long.parseLong(productId)));
		
		return "product";
	}
	
	
}
