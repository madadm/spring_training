package com.cydeo.bootstrap;

import com.cydeo.entity.Car;
import com.cydeo.entity.Department;
import com.cydeo.entity.Employee;
import com.cydeo.enums.Gender;
import com.cydeo.repository.CarRepository;
import com.cydeo.repository.DepartmentRepository;
import com.cydeo.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DataGenerator implements CommandLineRunner {

    private final CarRepository carRepository;
    private final DepartmentRepository departmentRepository;
    private final EmployeeRepository employeeRepository;

    public DataGenerator(CarRepository carRepository, DepartmentRepository departmentRepository, EmployeeRepository employeeRepository) {
        this.carRepository = carRepository;
        this.departmentRepository = departmentRepository;
        this.employeeRepository = employeeRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("BMW","M3");
        Car c2 = new Car("Honda", "Civic");
        Car c3 = new Car("Toyota","Corolla");

        carRepository.save(c1);
        carRepository.save(c2);
        carRepository.save(c3);

        Employee e1 = new Employee("Berrie","Manueau","bmanueu@dion.ne.jp", LocalDate.of(2006,04,17), Gender.FEMALE,6000);
        Employee e2 = new Employee("Ariel","McNee","amacnee@google.es", LocalDate.of(2009,01,21), Gender.FEMALE,5500);


        Department d1 = new Department("Sports","Outdoors");
        Department d2 = new Department("Tools","Hardware");


        List<Employee> employeeList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();

        employeeList.addAll(Arrays.asList(e1,e2));

        departmentList.addAll(Arrays.asList(d1,d2));

        employeeRepository.saveAll(employeeList);
        departmentRepository.saveAll(departmentList);


    }
}
