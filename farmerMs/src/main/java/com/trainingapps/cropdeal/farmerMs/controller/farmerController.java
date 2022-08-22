package com.trainingapps.cropdeal.farmerMs.controller;

import com.trainingapps.cropdeal.farmerMs.models.Farmer;
import com.trainingapps.cropdeal.farmerMs.service.FarmersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//mark class as Controller
@RestController
@RequestMapping("/farmers")
public class farmerController {
    @Autowired
    private FarmersService farmerService;

    // creating a get mapping that retrieves all the farmers detail from the database
    @GetMapping("/allfarmers")
    private List<Farmer> getAllFarmer(){
        return farmerService.getAllFarmer();
    }

    //creating post mapping that post the farmer detail in the database
    @PostMapping("/create")
    private int saveFarmer(@RequestBody Farmer farmer)
    {
        farmerService.saveFarmer(farmer);
        return farmer.getId();
    }
    @GetMapping("/byid/{id}")
    public Farmer findById(@PathVariable int id) {
        Farmer response = farmerService.findById(id);
        return response;
    }

    //creating a delete mapping that deletes a specified farmer
    @DeleteMapping("/delete/{id}")
    private void deleteFarmer(@PathVariable("id") int id)
    {
        farmerService.deleteFarmer(id);
    }
    //creating put mapping that updates the farmer detail
    @PutMapping("/update")
    private Farmer updateFarmer(@RequestBody Farmer farmer) {
        farmerService.updateFarmer(farmer);
        return farmer;
    }
    }
