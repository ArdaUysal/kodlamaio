package business;



import core.logger.Logger;
import database.IProductDao;
import entities.Course;

public class CourseManager implements ICourseService {
    private Course[] courses;
    private IProductDao productDao;
    private Logger log;
    
    public CourseManager(Course[] courses, IProductDao productDao, Logger log){
        this.courses = courses;
        this.productDao = productDao;
        this.log = log;
    }

    @Override
    public void add(Course course) throws Exception{
        if(course.getUnitPrice() < 0){
            throw new Exception("Course price cannot be less than 0.");
        }
        //Course name check
        for (Course courseName : courses) {
            if(courseName.getCourseName() == course.getCourseName()){
                throw new Exception("This course has already been added.");
            }
        }
        productDao.add(course);
        log.add(course);

    }

    @Override
    public void delete(Course course) {
        productDao.delete(course);
        
    }

    @Override
    public void update(Course course) {
        productDao.update(course);
        
    }
    
}
