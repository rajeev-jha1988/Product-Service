/**
 * 
 */
package com.raj.mybazzar.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author rajeev
 *
 */
@RestController
public class ProdctCataLogApi {
	
	@GetMapping("/getProduct")
	public List<String> getProduct() {
		List<String> items = new ArrayList<>();
		items.add("Mango");
		items.add("banana");
		return items;
	}

}
