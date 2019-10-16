package com.chary.bhaumik.product.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class DataStore implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	 public static List<Customer> listCustomers()
	 {
	        List<Customer> customers = new ArrayList<Customer>();
	        for(int i = 1; i < 6; i++){
	            Customer customer = new Customer();
	            customer.setId("CUST" + i);
	            customer.setAge(30 + i);
	            customer.setName("customer " + i);
	            customers.add(customer);
	        }
	        return customers;
	    }

	    public static List<Product> listProducts()
	    {
	        List<Product> products = new ArrayList<Product>();
	        for(int i = 1; i < 6; i++){
	            Product product = new Product();
	            product.setId("PRD" + i);
	            product.setName("Product Name " + 1);
	            product.setPrice("USD " + 100 + i);
	            product.setCustomerId("CUST" + i);
	            products.add(product);
	        }
	        return products;
	    }

}
