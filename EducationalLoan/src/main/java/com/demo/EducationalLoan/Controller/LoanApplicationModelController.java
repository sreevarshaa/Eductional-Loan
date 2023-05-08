package com.demo.EducationalLoan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.EducationalLoan.Model.LoanApplicationModel;
import com.demo.EducationalLoan.Service.LoanApplicationModelService;

@RestController
public class LoanApplicationModelController {

	@Autowired
	LoanApplicationModelService ls;
	
	@GetMapping("/get1")
	public List<LoanApplicationModel> setAll()
	{
		return ls.getDetail();
	}
	
	@PostMapping("/post1")
	public LoanApplicationModel postDetail(@RequestBody LoanApplicationModel loantype)
	{
		return ls.postDetail(loantype);
		}
	
	@DeleteMapping("/delete1/{id}")
	public String deleteById(@PathVariable int id)
	{
		ls.delete(id);
		return "deleted";
	}
	
	@PutMapping("/put1")
	public LoanApplicationModel update1(@RequestBody LoanApplicationModel id)
	{
		return ls.update(id);
	}
}
