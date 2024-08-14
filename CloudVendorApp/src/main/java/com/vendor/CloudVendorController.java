package com.vendor;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorController {
	CloudVendor cloudVendor;
	
	@GetMapping("{vendorId}")
	public CloudVendor getCloudVendorDetails(Integer vendorId) {
		System.out.println("get_");
		return cloudVendor;
	}
	
	@PostMapping
	public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		System.out.println("create_");
		this.cloudVendor = cloudVendor;
		return "cloud vendor created successfully!";
	}
	
	@PutMapping
	public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
		System.out.println("update_");
		this.cloudVendor = cloudVendor;
		return "cloud vendor updated successfully!";
	}
	
	@DeleteMapping("{vendorId}")
	public String updateCloudVendorDetails(Integer vendorId) {
		System.out.println("delete_");
		this.cloudVendor = null;
		return "cloud vendor deleted successfully!";
	}
}
