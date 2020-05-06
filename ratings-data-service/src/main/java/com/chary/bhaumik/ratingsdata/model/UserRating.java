package com.chary.bhaumik.ratingsdata.model;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class UserRating implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private List<Rating> userRatings;

}
