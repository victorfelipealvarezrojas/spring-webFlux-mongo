package com.valvarez.spwebflux.service.impl;

import com.valvarez.spwebflux.dto.EmployeeDto;
import com.valvarez.spwebflux.entity.Employee;
import com.valvarez.spwebflux.mapper.EmployeeMapper;
import com.valvarez.spwebflux.repository.EmployeeRepository;
import com.valvarez.spwebflux.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public Mono<EmployeeDto> saveEmployee(EmployeeDto employee) {
        Employee empToMap = EmployeeMapper.toEmployee(employee);
        Mono<Employee> emp = this.employeeRepository.save(empToMap);
        return emp.map(EmployeeMapper::toEmployeeDto);
    }

    @Override
    public Mono<String> getEmployee(String id) {
        return null;
    }

    @Override
    public Mono<String> updateEmployee(String id, EmployeeDto employee) {
        return null;
    }

    @Override
    public Mono<String> deleteEmployee(String id) {
        return null;
    }
}
