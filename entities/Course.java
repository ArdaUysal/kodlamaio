package entities;

public class Course {
    private String courseName;
    private Teacher teacher;
    private int unitPrice;

    public Course(String courseName, Teacher teacher, int unitPrice){
        this.courseName = courseName;
        this.teacher = teacher;
        this.unitPrice = unitPrice;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName = courseName;
    }

    public Teacher getTeacher(){
        return teacher;
    }

    public void setTeacher(Teacher teacher){
        this.teacher = teacher;
    }

    public int getUnitPrice(){
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice){
        this.unitPrice = unitPrice;
    }
}
