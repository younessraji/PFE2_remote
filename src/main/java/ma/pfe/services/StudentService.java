package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;

import java.util.List;

public interface StudentService {
    Long save(StudentDto dto);
    boolean update(StudentDto dto);
    boolean delete(long id);
    List<StudentDto> readAll();
}
