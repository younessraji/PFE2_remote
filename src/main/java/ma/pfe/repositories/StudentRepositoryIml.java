package ma.pfe.repositories;

import ma.pfe.entities.StudentEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class StudentRepositoryIml implements StudentRepository{
    private final static Logger LOG= LoggerFactory.getLogger(StudentRepositoryIml.class);

    @Override
    public Long save(StudentEntity e) {
        LOG.debug("start save");
        LOG.debug("end save");
        return null;
    }

    @Override
    public boolean update(StudentEntity e) {
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
    public List<StudentEntity> readAll() {
        LOG.debug("start readAll");
        LOG.debug("end readAll");
        return null;
    }
}
