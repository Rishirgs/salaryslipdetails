package rishigowtham.salaryslip;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface paysliprepositories extends JpaRepository<payslipdetails, Integer>{
	
public List<empdetails> findAllByEmpdetails(empdetails emp); 
}
