package com.example.spring_boot_homework.dao;

import com.example.spring_boot_homework.entity.Employees;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
@Repository
public class EmployeesDAOImpl implements EmployeesDAO {
    private EntityManager entityManager;

    public EmployeesDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employees> getEmployees() {
        return entityManager.createQuery("From Employees ").getResultList();
    }

    @Override
    public Employees getEmployeesById(int id) {
        return entityManager.find(Employees.class, id);
    }

    @Override
    public void addEmployees(Employees employees) {
        Employees newEmployees = entityManager.merge(employees);
        employees.setId(newEmployees.getId());
    }

    @Override
    public void updateEmployees(Employees employees) {
        entityManager.merge(employees);
    }

    @Override
    public void deleteEmployees(int id) {
        Query query = entityManager.createQuery("delete from Employees where id=:id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

}
