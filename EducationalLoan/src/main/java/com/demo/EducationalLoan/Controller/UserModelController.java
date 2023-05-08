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

import com.demo.EducationalLoan.Model.UserModel;
import com.demo.EducationalLoan.Service.UserModelService;

@RestController
public class UserModelController {

	@Autowired
	UserModelService us;
	
	@GetMapping("/get")
	public List<UserModel> setAll()
	{
		return us.getDetail();
	}
	
	@PostMapping("/post")
	public UserModel postDetail(@RequestBody UserModel id)
	{
		return us.postDetail(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteById(@PathVariable int id)
	{
		us.delete(id);
		return "deleted";
	}
	
	@PutMapping("/put")
	public UserModel update1(@RequestBody UserModel id)
	{
		return us.update(id);
	}
}
