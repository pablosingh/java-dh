
public class Main {
    public static void main(String[] args){
        System.out.println("Hola");
        University university = new University("Monster University");
        university.generateStudent(1, "Mike");
        university.generateCourse(300, "Algebra");
        try {
            university.suscribeStudent(1, 30);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
