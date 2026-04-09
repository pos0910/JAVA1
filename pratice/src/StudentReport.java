public class StudentReport {
    static void printAll(Printable[] items) {
        for (Printable item : items) {
            item.print();
        }
    }

    public static void main(String[] args) {
        StudentRecord[] students = {
                new StudentRecord("김자바", 90, 85, 78),
                new StudentRecord("이파이썬", 75, 92, 88),
                new StudentRecord("박스프링", 88, 80, 95)
        };

        System.out.println("=== 성적표 ===");
        printAll(students);

        System.out.println("\n=== CSV 내보내기 ===");
        for (StudentRecord s : students) {
            System.out.println(s.toCSV());
        }

        java.util.Arrays.sort(students);
        System.out.println("\n=== 성적순 정렬 ===");
        printAll(students);
    }
}