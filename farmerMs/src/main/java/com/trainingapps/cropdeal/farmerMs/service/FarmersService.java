package com.trainingapps.cropdeal.farmerMs.service;

import com.trainingapps.cropdeal.farmerMs.models.Farmer;
import com.trainingapps.cropdeal.farmerMs.repository.FarmersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FarmersService {
    @Autowired
    FarmersRepository farmersRepository;

    //getting all books record by using the method findAll() of CrudRepository
    public List<Farmer> getAllFarmer()
    {
        List<Farmer> farmers = new ArrayList<Farmer>();
        farmersRepository.findAll().forEach(farmers1 -> farmers.add(farmers1));
        return farmers;
    }

    //getting a specific record by using the method findById() of CrudRepository
    public Farmer findById(int id)
    {
        return farmersRepository.findById(id);
    }

    //saving a specific record by using the method save() of CrudRepository
    public void saveFarmer(Farmer farmer)
    {
        farmersRepository.save(farmer);
    }

    //deleting a specific record by using the method deleteById() of CrudRepository
    public void deleteFarmer(int id)
    {
        farmersRepository.deleteById(id);
    }

    //updating a record
    public void updateFarmer(Farmer farmer)
    {
        farmersRepository.save(farmer);
    }

}
