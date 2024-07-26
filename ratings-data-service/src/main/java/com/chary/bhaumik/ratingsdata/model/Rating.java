package com.chary.bhaumik.ratingsdata.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Rating implements Serializable
{
	private static final long serialVersionUID = 1L;
	
	private String movieId;
	private int rating;

}
