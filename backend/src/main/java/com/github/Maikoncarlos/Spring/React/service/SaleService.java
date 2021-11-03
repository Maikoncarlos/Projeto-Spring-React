package com.github.Maikoncarlos.Spring.React.service;

import com.github.Maikoncarlos.Spring.React.dto.SaleDTO;
import com.github.Maikoncarlos.Spring.React.dto.SaleSucessDTO;
import com.github.Maikoncarlos.Spring.React.dto.SaleSumDTO;
import com.github.Maikoncarlos.Spring.React.entities.Sale;
import com.github.Maikoncarlos.Spring.React.repositories.SaleRepository;
import com.github.Maikoncarlos.Spring.React.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sellerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable) {
        sellerRepository.findAll();
        Page<Sale> result = repository.findAll(pageable);
        return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupBySeller(){
        return repository.amountGroupBySeller();
    }

    @Transactional(readOnly = true)
    public List<SaleSucessDTO> sucessGroupBySeller(){
        return repository.sucessGroupedBySeller();
    }


}
