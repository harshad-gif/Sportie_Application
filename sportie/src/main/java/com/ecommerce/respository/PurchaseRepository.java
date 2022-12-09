package com.ecommerce.respository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entity.PurchaseReport;

@Repository
public interface PurchaseRepository extends JpaRepository<PurchaseReport, Integer> {
	
	@Query("select pr from PurchaseReport pr where pr.category_product=:category")
	List<PurchaseReport> findAllByCategory(String category);

	@Query("select pr from PurchaseReport pr where pr.date_product=:date")
	List<PurchaseReport> findAllByDate(Date date);
	
}
