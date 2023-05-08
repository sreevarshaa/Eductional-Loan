package com.demo.EducationalLoan.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.EducationalLoan.Model.UserModel;

@Repository
public interface UserModelRepository extends JpaRepository<UserModel,Integer>{

}
