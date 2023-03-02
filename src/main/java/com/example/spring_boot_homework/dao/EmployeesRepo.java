package com.example.spring_boot_homework.dao;


import com.example.spring_boot_homework.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepo extends JpaRepository<Employees, Integer> {

}