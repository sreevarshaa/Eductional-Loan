package com.demo.EducationalLoan.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.EducationalLoan.Model.LoanApplicationModel;

import com.demo.EducationalLoan.Repository.LoanApplicationModelRepository;

@Service
public class LoanApplicationModelService {

	@Autowired
	LoanApplicationModelRepository lr;
	
	public List<LoanApplicationModel> getDetail()
	{
		return lr.findAll();
	}
	
	public LoanApplicationModel postDetail(LoanApplicationModel loantype)
	{
		return lr.save(loantype);
	}
	
	public void delete(int id)
	{
		lr.deleteById(id);
	}
	
	public LoanApplicationModel update(LoanApplicationModel id)
	{
		return lr.save(id);
	}
}
