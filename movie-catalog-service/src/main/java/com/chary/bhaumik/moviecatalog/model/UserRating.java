package com.chary.bhaumik.moviecatalog.model;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class UserRating implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private List<Rating> userRatings;

}
