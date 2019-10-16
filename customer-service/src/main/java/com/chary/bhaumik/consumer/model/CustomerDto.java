package com.chary.bhaumik.consumer.model;

import java.util.List;

import lombok.Data;

@Data
public class CustomerDto extends Customer
{
	private static final long serialVersionUID = 1L;
	
	private List<Product> products;

}
