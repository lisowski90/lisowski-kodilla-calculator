package com.kodilla.hibernate.manytomany.dao.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import com.kodilla.hibernate.manytomany.fasade.Finder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FinderTestSuite {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    @Autowired
    Finder finder;

    @Test
    public void testFindCompanyByCharset() {
        //Given
        companyDao.save(new Company("Firm"));
        companyDao.save(new Company("Limited"));
        companyDao.save(new Company("Company"));

        //When
        List<Company> companyList = finder.findCompanyByCharset("%irm%");

        //Then
        assertEquals(companyList.size(), 1);

        //CleanUp
        companyDao.deleteAll();
    }

    @Test
    public void testFindEmployeeByCharset() {
        //Given
        employeeDao.save(new Employee("Jack", "Nowak"));
        employeeDao.save(new Employee("Stan", "Kowalski"));
        employeeDao.save(new Employee("Ed", "Cisowski"));

        //When
        List<Employee> employeeList = finder.findEmployeeByCharset("%ski%");

        //Then
        assertEquals(2, employeeList.size());

        //CleanUp
        employeeDao.deleteAll();
    }
}
