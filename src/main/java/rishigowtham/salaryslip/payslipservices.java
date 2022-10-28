package rishigowtham.salaryslip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class payslipservices {
@Autowired
paysliprepositories repopay;
public payslipdetails makecreate(payslipdetails paydet) {
	return repopay.save(paydet);
	}
public List<payslipdetails> makelist(){
	return repopay.findAll();
}
public payslipdetails getexactnumbb(int getnums) {
	return repopay.findById(getnums).orElse(new payslipdetails());
}
}
