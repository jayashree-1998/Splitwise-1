package com.splitwise.expenseservice.respository;

import com.splitwise.expenseservice.entities.Paid;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaidRepository extends JpaRepository<Paid, String> {
}
