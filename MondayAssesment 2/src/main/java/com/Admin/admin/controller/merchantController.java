package com.Admin.admin.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

package com.Admin.admin.Entity;
package com.Admin.admin.Repository;

@RestController
@RequestMapping("/merchant")
public class merchantController {
	
	merchantRepository merchantRepository;
	@GetMapping("/")
	public List<MerchantEntity >getMer() {
		return merchantRepository.findAll();
	}
	
	@PostMapping("/")
	public List<MerchantEntity> saveMer(@RequestBody MerchantEntity merEntity){
		
		merchantRepository.save(merEntity);
		return merchantRepository.findAll();
	}

	@PutMapping("/")
    public List<MerchantEntity> updateMer(@RequestBody MerchantEntity merEntity){
		
		merchantRepository.save(merEntity);
		return merchantRepository.findAll();
	}
	
	@DeleteMapping("/{id}")
    public List<MerchantEntity> deleteMer(@PathVariable("id") int id){
		
		merchantRepository.deleteById(id);
		return merchantRepository.findAll();
	}


}
