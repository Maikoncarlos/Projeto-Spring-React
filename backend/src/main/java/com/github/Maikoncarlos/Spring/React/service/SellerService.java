package com.github.Maikoncarlos.Spring.React.service;

import com.github.Maikoncarlos.Spring.React.dto.SellerDTO;
import com.github.Maikoncarlos.Spring.React.entities.Seller;
import com.github.Maikoncarlos.Spring.React.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    public List<SellerDTO> findAll() {
      List<Seller> result = repository.findAll();
      return result.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
    }
}
