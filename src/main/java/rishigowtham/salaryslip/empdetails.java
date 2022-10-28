package rishigowtham.salaryslip;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

import org.springframework.lang.Nullable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class empdetails {
@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
private int empid;
private String empname;
private String username;
private String password;
private String empDesignation;
private int expexp;
private double empsalary;
@OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
@JoinTable(name="newtable", joinColumns = @JoinColumn(name="empid"), inverseJoinColumns = @JoinColumn(name="payslipid"))
@Nullable
public Collection<payslipdetails> mypayslip=new ArrayList<payslipdetails>();
}
