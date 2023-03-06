package ma.pfe.mappers;

import ma.pfe.dtos.StudentDto;
import ma.pfe.entities.StudentEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentMapper {
    StudentDto converttoDto(StudentEntity entity){
        StudentDto studentDto= new StudentDto();
        studentDto.setId(entity.getId());
        studentDto.setName(entity.getName());
        return studentDto;
    }
    StudentEntity converttoEntity(StudentDto dto){
        StudentEntity entity = new StudentEntity();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
    List<StudentEntity> converttoEntities(List<StudentDto>l){
       return l.stream().map(dto -> converttoEntity(dto)).collect(Collectors.toList());
    }
    List<StudentDto> converttoDtos(List<StudentEntity>l) {
        return l.stream().map(entity -> converttoDto(entity)).collect(Collectors.toList());
    }
}
