package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.entity.Customer;
import com.entity.Store;
import com.service.CustomerSer;
import com.service.StoreSer;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	
	@Autowired
	private CustomerSer customerser ;
	@Autowired
	private StoreSer storeser ;
	
	@Autowired(required = true)
	public void setCustomer( CustomerSer cusmSer) {
		this.customerser = cusmSer ;}
	
	@Autowired(required = true)
	public void setStore(StoreSer storeser) {
		this.storeser=storeser;
		
	}
	
	@GetMapping("/index")
	public String index () {
		return "index";
		
		
	}
	
	@GetMapping("/listC")
	public  String ShowFormAdd (Model model) {
		List <Customer> thecustomers = customerser.getCustomers();
		model.addAttribute("customers", thecustomers);
		return "list-customers";
	}
	
	@GetMapping ("/showFormC")
	public String ShowForm(Model model) {
		Customer thecustomer = new Customer();	
		List<Store>listeStores = storeser.getAllStores();
		model.addAttribute("customer",thecustomer);
		model.addAttribute("listStores",listeStores);
		System.out.print(listeStores);

		return "customer-form";
	}
	
	@PostMapping("/saveCustomerC")
	public String saveCustomer(@ModelAttribute("customer") Customer theCustomer){
		customerser.saveCustomer(theCustomer);
		System.out.print("resultet eshh"+theCustomer.getListeStore());
		return "redirect:/customer/listC";
		
	}
	
	 @GetMapping("/updateFormC")
	    public String showFormForUpdate(@RequestParam("customerId") int theId ,Model theModel){
	        Customer theCustomer = customerser.getCustomer(theId);
	        theModel.addAttribute("customer", theCustomer);
	        return "customer-form";
	    }
	 
	 @GetMapping("/deleteC")
	    public String deleteCustomer(@RequestParam("customerId") int theId) {
		customerser.deleteCustomer(theId);
	        return "redirect:/customer/listC";
	    }
	
	
	
	
	

}
