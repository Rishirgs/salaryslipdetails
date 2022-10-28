package rishigowtham.salaryslip;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {
@Autowired
empservice seremp;
@Autowired
payslipservices serpay;
@PostMapping("/crea")
public String makecreate(@RequestBody empdetails dets) {
	return seremp.madecreate(dets).getEmpname()+"it is created";
}
@PutMapping("/upda")
public String makeupadte(@RequestBody empdetails upd) {
	return seremp.madecreate(upd).getEmpname()+"it is updated";
}
@PostMapping("/newones")
public payslipdetails mvp(@RequestBody payslipdetails rig) {
	empdetails erd=seremp.getexactnum(rig.getEmpdetails().getEmpid());
	double month=erd.getEmpsalary()/12;
	double basic=month-(month*(rig.getPayslipallownace())/100);
	rig.setPayslipbasicsalary(basic);
	month=basic-rig.getPaysliptds()/100;
	rig.setPaysliptakehome(month);
	erd.getMypayslip().add(rig);
	serpay.makecreate(rig);
	seremp.madecreate(erd);
	return rig;
}
}
