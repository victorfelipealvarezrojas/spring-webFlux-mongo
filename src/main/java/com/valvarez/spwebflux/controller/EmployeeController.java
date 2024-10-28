package com.valvarez.spwebflux.controller;

import com.valvarez.spwebflux.dto.EmployeeDto;
import com.valvarez.spwebflux.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @PostMapping
    public Mono<EmployeeDto> saveEmployee(@RequestBody EmployeeDto employee) {
        return this.employeeService.saveEmployee(employee);
    }



}
