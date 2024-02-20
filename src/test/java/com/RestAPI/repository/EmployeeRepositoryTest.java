//package com.RestAPI.repository;
//
//import com.RestAPI.model.Employee;
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//
//import java.util.List;
//
//import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
//
//@DataJpaTest
//public class EmployeeRepositoryTest {
//
//    @Autowired
//    private EmployeeRepository employeeRepository;
//    Employee employee;
//
//    @BeforeEach
//    void setUp() {
//        employee = new Employee(1, "Paras", "Gurgaon", "8437861802");
//        employeeRepository.save(employee);
//    }
//
//    @AfterEach
//    void tearDown() {
//        employee = null;
//        employeeRepository.deleteAll();
//    }
//
//    //Test Case SUCCESS
//    @Test
//    void testFindByEmpName_Found()
//    {
//       List <Employee> employeeList = employeeRepository.findByEmpName("Paras");
//       assertThat(employeeList.get(0).getEmpId()).isEqualTo(employee.getEmpId());
//       assertThat(employeeList.get(0).getEmpCity()).isEqualTo(employee.getEmpCity());
//    }
//
//    //Test Case FAILURE
//    @Test
//    void testFindByEmpName_NotFound()
//    {
//        List <Employee> employeeList = employeeRepository.findByEmpName("Aarushi");
//        assertThat(employeeList.isEmpty()).isTrue();
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
