package com.github.Maikoncarlos.Spring.React.repositories;

import com.github.Maikoncarlos.Spring.React.dto.SaleSucessDTO;
import com.github.Maikoncarlos.Spring.React.dto.SaleSumDTO;
import com.github.Maikoncarlos.Spring.React.entities.Sale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SaleRepository extends JpaRepository<Sale, Long> {

    @Query("SELECT new com.github.Maikoncarlos.Spring.React.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSumDTO> amountGroupBySeller();

    @Query("SELECT new com.github.Maikoncarlos.Spring.React.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.deals)) "
            + "FROM Sale AS obj GROUP BY obj.seller")
    List<SaleSucessDTO> sucessGroupedBySeller();


}
