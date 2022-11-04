package main.api.controller;

import main.api.Service.DepartmentService;
import main.api.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/departments")
    public List<Department> findAll(){
        return this.departmentService.findAll();
    }

    @PostMapping("/department")
    public Department createDepartment(@RequestBody Department department){
        return this.departmentService.createDepartment(department);
    }

    @GetMapping("/department/{id}")
    public Department findById(@PathVariable("id") long id){
        return this.departmentService.findById(id);
    }
}
