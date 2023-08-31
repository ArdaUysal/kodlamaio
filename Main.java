import business.CategoryManager;
import business.CourseManager;
import business.TeacherManager;
import core.logger.DatabaseLogger;
import core.logger.FileLogger;
import database.HibernateDao;
import database.JDBCDao;
import entities.Category;
import entities.Course;
import entities.Teacher;

public class Main {
    public static void main(String[] args) throws Exception {
        Teacher teacher = new Teacher("Engin", "Demiroğ");


        Course course1 = new Course("Java Programming Course",teacher,200);
        
        Course course2 = new Course("Python & Selenium",teacher,0);
        
        Course[] courses = {course1};

        
        Category category1 = new Category("Programming");

        Category category2 = new Category("Graphic Design");

        Category[] categories = {category1};


        CourseManager courseManager = new CourseManager(courses, new JDBCDao(), new DatabaseLogger());
        courseManager.add(course2);
        courseManager.update(course2);
        courseManager.delete(course2);


        CategoryManager categoryManager = new CategoryManager(categories, new HibernateDao(), new FileLogger());
        categoryManager.add(category2);
        categoryManager.update(category2);        
        categoryManager.delete(category2);


        TeacherManager teacherManager = new TeacherManager(new HibernateDao(), new FileLogger());
        teacherManager.add(teacher);
        teacherManager.update(teacher);
        teacherManager.delete(teacher);

        
        

    }
}