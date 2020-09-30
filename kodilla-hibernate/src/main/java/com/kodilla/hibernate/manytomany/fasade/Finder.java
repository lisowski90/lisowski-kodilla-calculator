package com.kodilla.hibernate.manytomany.fasade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Finder {

    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(Finder.class);

    public List<Company> findCompanyByCharset (String charset) {
        LOGGER.info("Looking for company with charset: " + charset);
        List<Company> companyList = companyDao.findByCharSet(charset);
            if(companyList.size() >= 1) {
                LOGGER.info("Successful search!");
            } else {
                LOGGER.error("Search ended with error!");
            }
            return companyList;
    }

    public List<Employee> findEmployeeByCharset (String charset) {
        LOGGER.info("Looking for employee with charset: " + charset);
        List<Employee> employeeList = employeeDao.employeeByCharset(charset);
        if(employeeList.size() >= 1) {
            LOGGER.info("Successful search!");
        } else {
            LOGGER.error("Search ended with error!");
        }
        return employeeList;
    }
}
