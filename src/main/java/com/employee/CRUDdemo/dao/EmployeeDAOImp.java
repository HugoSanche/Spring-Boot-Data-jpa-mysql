package com.employee.CRUDdemo.dao;

import com.employee.CRUDdemo.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeDAOImp implements EmployeeDAO {

    // define field for entity manager
    private EntityManager entityManager;

    //inject entity manager using constructor injection
    public EmployeeDAOImp(EntityManager entityManager){
        this.entityManager=entityManager;
    }


    // implement save method
    @Transactional
    @Override
    public void save(Employee theEmployee) {
       entityManager.persist(theEmployee);
    }

    @Override
    public Employee foundById(Integer id) {
        return  entityManager.find(Employee.class,id);
    }

    @Override
    public List<Employee> getAllEmployee() {
        TypedQuery<Employee> employees=entityManager.createQuery("from Employee order by firstName", Employee.class);
        return employees.getResultList();
    }

    @Override
    public List<Employee> findByFirstName(String firstName) {
        TypedQuery<Employee> theQuery=entityManager.createQuery("from Employee where firstName=:theData",Employee.class);
        theQuery.setParameter("theData",firstName);

        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Employee employee) {
        entityManager.merge(employee);
    }

    @Transactional
    @Override
    public void delete(Integer id) {

        System.out.println("Deleting Employee");

        Employee theEmployee=entityManager.find(Employee.class,id);
        System.out.println(theEmployee);
        entityManager.remove(theEmployee);

    }

    @Override
    @Transactional
    public int deleteAllEmployee() {
       int numbersOfRowsDeleted=entityManager.createQuery("delete from Employee").executeUpdate();
        return numbersOfRowsDeleted;
    }
}
