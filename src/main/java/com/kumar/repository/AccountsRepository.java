package com.kumar.repository;

import com.kumar.model.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author RakeshKumar created on 18/01/24
 */
@Repository
public interface AccountsRepository extends JpaRepository<Accounts,Integer> {

    Accounts findByCustomerId(int customerId);

}