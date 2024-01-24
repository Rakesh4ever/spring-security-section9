package com.kumar.repository;

import com.kumar.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author RakeshKumar created on 18/01/24
 */

@Repository
public interface CardsRepository extends JpaRepository<Cards,Integer> {

    List<Cards> findByCustomerId(int customerId);

}
