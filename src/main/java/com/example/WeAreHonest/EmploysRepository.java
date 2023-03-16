package com.example.WeAreHonest;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface EmploysRepository extends JpaRepository<Employ, Long> {

}
