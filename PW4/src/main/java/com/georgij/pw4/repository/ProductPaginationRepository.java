package com.georgij.pw4.repository;

import com.georgij.pw4.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductPaginationRepository extends PagingAndSortingRepository<Product, Integer> {

}
