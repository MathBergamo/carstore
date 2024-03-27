package com.main.carstore.service;

import com.main.carstore.DTO.OwnerPostDTO;
import com.main.carstore.client.CarPostStoreClient;
import org.springframework.beans.factory.annotation.Autowired;

public class OwnerPostServiceImpl implements OwnerPostService{

    @Autowired
    private CarPostStoreClient carPostStoreClient;

    @Override
    public void createOwnerCar(OwnerPostDTO ownerPostDTO) {
        carPostStoreClient.ownerPostsClient(ownerPostDTO);
    }
}
