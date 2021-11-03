package com.github.Maikoncarlos.Spring.React.repositories;

import com.github.Maikoncarlos.Spring.React.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<Seller,Long> {
}
