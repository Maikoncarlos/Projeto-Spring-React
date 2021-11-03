package com.github.Maikoncarlos.Spring.React.repositories;

import com.github.Maikoncarlos.Spring.React.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
