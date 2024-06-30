package com.practice._SD35.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice._SD35.entity.Review;
import com.practice._SD35.repo.ReviewRepo;

@Service
public class ReviewService {
	
	@Autowired
	private ReviewRepo reviewRepo;

	public void saveReview(Review review) {
		reviewRepo.save(review);
		
	}

}
