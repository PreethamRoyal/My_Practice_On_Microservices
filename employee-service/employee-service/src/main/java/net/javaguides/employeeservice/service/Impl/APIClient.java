package net.javaguides.employeeservice.service.Impl;


import net.javaguides.employeeservice.dto.DepartmentDto;
import net.javaguides.employeeservice.dto.OrganizationDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="DEPARTMENT-SERVICE")
public interface APIClient {
    @GetMapping("api/departments/{department-code}")
    DepartmentDto getDepartment(@PathVariable("department-code") String departmentCode);


    @GetMapping("api/organizations/{code}")
    OrganizationDto getOrganization(@PathVariable("code") String organizationCode);
}
