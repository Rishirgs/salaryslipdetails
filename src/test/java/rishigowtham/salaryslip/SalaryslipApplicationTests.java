package rishigowtham.salaryslip;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
class SalaryslipApplicationTests {
@MockBean
emprepository rep;
@Autowired
empservice ser;
@Test
public void test() {
	empdetails emp=new empdetails(1, "rishi", "rishi123", "rishi0601", "java developer", 1, 200000.0, null);
	empdetails emp1=new empdetails(2, "kumar", "kum123", "kum0601", "web designer", 2, 300000.0, null);
	when(rep.save(emp)).thenReturn(emp);
	assertEquals("rishi", ser.madecreate(emp).getEmpname());
}
}
