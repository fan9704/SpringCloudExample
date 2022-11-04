package main.api.Service;

import main.api.model.Department;
import main.api.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DepartmentService {
    private DepartmentRepository departmentRepository;

    public Department createDepartment(Department department){
        return this.departmentRepository.save(department);
    }

    public Department findById(long id){
        Optional<Department> optionalDepartment = this.departmentRepository.findById(id);
        if(optionalDepartment.isPresent()){
            return optionalDepartment.get();
        }else{
            return null;
        }
    }

    public List<Department> findAll(){
        return this.departmentRepository.findAll();
    }
}
