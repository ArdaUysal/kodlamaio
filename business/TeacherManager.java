package business;

import core.logger.Logger;
import database.IProductDao;
import entities.Teacher;

public class TeacherManager implements ITeacherService{
    private IProductDao productDao;
    private Logger log;

    public TeacherManager(IProductDao productDao, Logger log){
        this.productDao = productDao;
        this.log = log;
    }

    @Override
    public void add(Teacher teacher) {
        productDao.add(teacher);
        log.add(teacher);
    }

    @Override
    public void delete(Teacher teacher) {
        productDao.delete(teacher);
        
    }

    @Override
    public void update(Teacher teacher) {
        productDao.update(teacher);
        
    }
    
}
