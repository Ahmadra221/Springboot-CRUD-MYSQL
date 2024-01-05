package com.ahmad.spring.springbootcrud.service.impl;

import com.ahmad.spring.springbootcrud.model.CloudVendor;
import com.ahmad.spring.springbootcrud.repository.CloudRepository;
import com.ahmad.spring.springbootcrud.service.CloudVendorService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloudVendorServiceImpl implements CloudVendorService {

    public CloudVendorServiceImpl(CloudRepository cloudRepository) {
        this.cloudRepository = cloudRepository;
    }

    CloudRepository cloudRepository;




    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
        cloudRepository.save(cloudVendor);

        return "created";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudRepository.save(cloudVendor);
        return "updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudRepository.deleteById(cloudVendorId);
        return "deleted";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudRepository.findById(cloudVendorId).get();
    }

    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudRepository.findAll();
    }
}
