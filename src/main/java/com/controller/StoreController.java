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
import com.service.StoreSer;

@Controller
@RequestMapping("/store")
public class StoreController {
	
	@Autowired
	private StoreSer storeser ;
	
	
	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	
	
	@GetMapping("/listS")
	public String getAllStores(Model model) {
		List <Store> listestores =storeser.getAllStores();
		model.addAttribute("stores",listestores);
		return "list-magasin";	
	}
	
	@GetMapping ("/showFormS")
	public String showForm (Model model) {
		Store storeobj  = new Store ();
		model.addAttribute("store",storeobj);
		return "form-magasin";
	
	}
	
	@PostMapping ("/saveStoreS")
	public String saveStore(@ModelAttribute("store") Store theStore) {
		storeser.saveStore(theStore);
		return "redirect:/store/listS";		
	}
	
	 @GetMapping("/updateFormS")
	    public String showFormForUpdate(@RequestParam("storeId") int theId ,Model theModel){
	        Store theStore = storeser.getStore(theId);
	        theModel.addAttribute("store", theStore);
	        return "form-magasin";
	    }
	 
	 @GetMapping("/deleteS")
	    public String deleteCustomer(@RequestParam("storeId") int theId) {
		 storeser.deleteStore(theId);
	        return "redirect:/store/listS";
	    }
	
	
	
	
	

}
