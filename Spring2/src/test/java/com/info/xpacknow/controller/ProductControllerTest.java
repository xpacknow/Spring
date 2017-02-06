package com.info.xpacknow.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;

import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.info.xpacknow.domain.Product;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("test-DispatcherServlet-context.xml")
@WebAppConfiguration
public class ProductControllerTest {

	@Autowired
    private WebApplicationContext wac;

    private MockMvc mockMvc;

    @Before
    public void setup() {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testGetProducts() throws Exception {
        this.mockMvc.perform(get("/productss"))
            		.andExpect(model().attributeExists("products"));
    }
    
    @Test
    public void testGetProductById() throws Exception {
    	
    	//Ustaw
    	Product phone = new Product(1234,"Samsung S5", new BigDecimal(500));
    	
    	//wykonaj
    	    	this.mockMvc.perform(get("/product").param("id","1234"))
    			.andExpect(model().attributeExists("products"))
    			.andExpect(model().attribute("product", phone));;
    	            		
    	  
    	
   	
           		
            		
    }

    
}
