import java.util.Arrays;

public class ComparableDemo {
    public static void main(String[] args){
        Student[] students = {
                new Student("김자바", 85),
                new Student("이자바", 85),
                new Student("박자바", 85),
                new Student("최자바", 85)

        };
        System.out.println("정렬 전: ");
        Arrays.sort(students);
        System.out.println("정렬 후: " + Arrays.toString(students));



    }
}
