package rishigowtham.salaryslip;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class payslipdetails {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int payslipid;
private double payslipbasicsalary;
private double payslipallownace;
private double paysliptds;
private double paysliptakehome;
@ManyToOne
@JoinColumn(name="empid")
private empdetails empdetails;
}
