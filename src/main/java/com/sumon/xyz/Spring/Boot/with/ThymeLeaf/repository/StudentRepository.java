package com.sumon.xyz.Spring.Boot.with.ThymeLeaf.repository;

import com.sumon.xyz.Spring.Boot.with.ThymeLeaf.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

  List<Student> findByName(String name);

}
