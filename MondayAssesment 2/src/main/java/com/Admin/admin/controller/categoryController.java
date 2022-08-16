package com.Admin.admin.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/category")
public class categoryController {
	
	@Autowired
	categoryRepository categoryRepo;
	
	@GetMapping("/")
	public List<categoryEntity >getCat() {
		return categoryRepo.findAll();
	}
	
	@PostMapping("/")
	public List<categoryEntity> saveDept(@RequestBody categoryEntity categoryEntity){
		
		catRepo.save(categoryEntity);
		return catRepo.findAll();
	}

	@PutMapping("/")
    public List<categoryEntity> updateDept(@RequestBody categoryEntity categoryEntity){
		
		catRepo.save(categoryEntity);
		return catRepo.findAll();
	}
	
	@DeleteMapping("/{id}")
    public List<categoryEntity> deleteDept(@PathVariable("id") int id){
		
		catRepo.deleteById(id);
		return categoryRepo.findAll();
	}

}
