package ma.pfe.services;

import ma.pfe.dtos.StudentDto;
import ma.pfe.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService{
    private final static Logger LOG= LoggerFactory.getLogger(StudentServiceImpl.class);
    private StudentRepository repository;
    private StudentServiceImpl(StudentRepository repository){
        this.repository = repository;
    }
    @Override
    public Long save(StudentDto dto) {
        LOG.debug("start create");
        LOG.debug("end create");

        return 1L;
    }

    @Override
    public boolean update(StudentDto dto) {
        LOG.debug("start update");
        LOG.debug("end update");
        return false;
    }

    @Override
    public boolean delete(long id) {
        LOG.debug("start delete");
        LOG.debug("end delete");
        return false;
    }

    @Override
    public List<StudentDto> readAll() {
        LOG.debug("start readAll");
        LOG.debug("end readALl");
        return null;
    }
}
