package com.chary.bhaumik.consumer.controller;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chary.bhaumik.consumer.client.ProductClient;
import com.chary.bhaumik.consumer.model.Customer;
import com.chary.bhaumik.consumer.model.CustomerDto;
import com.chary.bhaumik.consumer.model.DataStore;
import com.chary.bhaumik.consumer.model.Product;

@RestController
@RequestMapping("/customers")
public class CustomerController 
{
	
	@Autowired
    private ProductClient productClient;

    @GetMapping("/{id}")
    public CustomerDto getCustomerById(@PathVariable String id){
        Customer customer = DataStore.listCustomers().stream().filter(cust -> cust.getId().equalsIgnoreCase(id)).findFirst().get();
        List<Product> products = productClient.listProductsByCustomerId(id);
        CustomerDto dto = new CustomerDto();
        BeanUtils.copyProperties(customer, dto);
        dto.setProducts(products);
        return dto;
    }
	
}
