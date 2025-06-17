import java.util.HashSet;
import java.util.Set;

public class University {
    private String name;
    private Set<Student> studentSet;
    private Set<Course> courseSet;

    public University(String name) {
        this.name = name;
        studentSet = new HashSet<>();
        courseSet = new HashSet<>();
    }

    public void generateStudent(Integer id, String name){
        Student student = new Student(id, name);
        studentSet.add(student);
    }
    public void generateCourse(Integer id, String name){
        Course course = new Course(id, name);
        courseSet.add(course);
    }
    public void suscribeStudent(Integer studentId, Integer courseId) throws StudentNotFoundException, CourseNotFoundException {
        Course course = findCourse(courseId);
        Student student = findStudent(studentId);
        if (course == null){
            throw new CourseNotFoundException(courseId + " Course Not Found");
        }
        if (student == null){
            throw new StudentNotFoundException(studentId + " Student Not Found");
        }
        course.addStudent(student);
        System.out.println("Agregado "+ student.getName() + " al curso : "+ course.getSubject());
    }
    private Student findStudent(Integer studentId){
        Student wantedStudent = null;
        for(Student student : studentSet){
            if(student.getId().equals(studentId)){
                wantedStudent = student;
            }
        }
        return wantedStudent;
    }
    private Course findCourse(Integer courseId){
        Course wantedCourse = null;
        for( Course course : courseSet){
            if(course.getId().equals(courseId)){
                wantedCourse = course;
            }
        }
        return  wantedCourse;
    }
}
