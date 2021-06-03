package com.efub.clone.acmicpc.domain.problem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProblemRepository extends JpaRepository<Problem,Long> {
    @Query("SELECT p FROM Problem p ORDER BY p.create_date DESC")
    List<Problem> findAllDesc();

    @Query("SELECT p FROM Problem p WHERE p.isMultilingual=true ORDER BY p.create_date DESC")
    List<Problem> findMultilingualDesc();
}
