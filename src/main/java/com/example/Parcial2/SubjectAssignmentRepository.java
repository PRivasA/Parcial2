package com.example.Parcial2;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectAssignmentRepository extends JpaRepository<SubjectAssignment, Long> {
}
