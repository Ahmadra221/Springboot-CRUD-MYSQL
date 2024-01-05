package com.ahmad.spring.springbootcrud.controller;

import com.ahmad.spring.springbootcrud.model.CloudVendor;
import com.ahmad.spring.springbootcrud.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vendorcontroller")
public class CloudAPIserviceController {


    CloudVendorService cloudVendorService;

    public CloudAPIserviceController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }




    @GetMapping("{vendorId}")
    public CloudVendor getVendorDetails(@PathVariable("vendorId") String vendorId){

    return  cloudVendorService.getCloudVendor(vendorId);
    }

    @GetMapping()
    public List<CloudVendor> getAllVendorDetails(){

        return  cloudVendorService.getAllCloudVendors();
    }

    @PostMapping
    public  String createCloudvendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor created!";
    }

    @PutMapping
    public  String updateCloudvendor(@RequestBody CloudVendor cloudVendor){
       cloudVendorService.updateCloudVendor(cloudVendor);
        return "Cloud vendor updated!";
    }

    @DeleteMapping("{vendorId}")
    public  String deleteCloudvendor(@PathVariable("vendorId") String vendorId){
        cloudVendorService.deleteCloudVendor(vendorId);
        return "Cloud vendor deleted!";
    }
}
