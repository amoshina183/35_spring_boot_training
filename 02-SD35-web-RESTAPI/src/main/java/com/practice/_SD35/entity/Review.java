package com.practice._SD35.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Review {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	private String comments;
	
	@ManyToOne
	@JoinColumn(name = "p_id", nullable = false)
	private Product product;

	public Review() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Review(Long reviewId, String comments, Product product) {
		super();
		this.reviewId = reviewId;
		this.comments = comments;
		this.product = product;
	}

	public Long getReviewId() {
		return reviewId;
	}

	public void setReviewId(Long reviewId) {
		this.reviewId = reviewId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	

}
