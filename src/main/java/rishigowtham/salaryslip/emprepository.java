package rishigowtham.salaryslip;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface emprepository extends JpaRepository<empdetails, Integer>{
	

}
