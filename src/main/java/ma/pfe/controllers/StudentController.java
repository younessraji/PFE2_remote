package ma.pfe.controllers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.services.StudentService;
import ma.pfe.services.StudentServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/student")

public class StudentController {
    private final static Logger LOG= LoggerFactory.getLogger(StudentController.class);

    private StudentService service;
    StudentController(StudentService service){
        this.service=service;
    }
    @PostMapping("/save")
    public long save(@RequestBody StudentDto dto){
        LOG.debug("start save dto:{}",dto);
        LOG.debug("end save dto:{}",dto);
        return service.save(dto);
    }
    @PutMapping
    public boolean update(@RequestBody StudentDto dto){
        LOG.debug("start update");
        LOG.debug("end update");
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable("id") long id){
        LOG.debug("start delete");
        LOG.debug("end delete");
        return service.delete(id);
    }
    @GetMapping
    public List<StudentDto> selectAll(){
        LOG.debug("start selectAll");
        LOG.debug("end selectAll");
        return service.readAll();
    }
}
