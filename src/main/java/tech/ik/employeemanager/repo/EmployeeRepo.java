package tech.ik.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.ik.employeemanager.model.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
