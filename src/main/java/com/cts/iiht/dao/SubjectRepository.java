package com.cts.iiht.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.iiht.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long>{

}
