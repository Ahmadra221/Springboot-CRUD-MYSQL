package com.ahmad.spring.springbootcrud.service;


import com.ahmad.spring.springbootcrud.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {
    public  String createCloudVendor(CloudVendor cloudVendor);
    public  String updateCloudVendor(CloudVendor cloudVendor);
    public  String deleteCloudVendor (String cloudVendorId);
    public  CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
