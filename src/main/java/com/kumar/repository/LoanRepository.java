package com.kumar.repository;

import com.kumar.model.Loans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author RakeshKumar created on 18/01/24
 */

@Repository
public interface LoanRepository extends JpaRepository<Loans, Integer> {

    List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}