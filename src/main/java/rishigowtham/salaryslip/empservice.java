package rishigowtham.salaryslip;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class empservice {
@Autowired
emprepository repoemp;
public empdetails madecreate(empdetails empdet) {
	return repoemp.save(empdet);
}
public List<empdetails> makelist(){
	return repoemp.findAll();
}
public String madedelete(int del) {
	String eraser=repoemp.findById(del).orElse(new empdetails()).getEmpname();
	repoemp.deleteById(del);
	return eraser;
}
public empdetails getexactnum(int getnum) {
	return repoemp.findById(getnum).orElse(new empdetails());
}
}
