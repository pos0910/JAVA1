package kopo06.app;
import kopo06.model.FullTime;   // 추가
import kopo06.model.Contract;   // 추가
import kopo06.model.Intern;
public class EmployeeMain {

    static void printAll(Employee[] emps) {
        System.out.println("=== 전체 직원 목록 ===");
        for (Employee emp : emps) {
            emp.print();
        }
    }

    static double calcTotalSalary(Employee[] emps) {
        double total = 0;
        for (Employee emp : emps) {
            total += emp.calcSalary();
        }
        return total;
    }

    public static void main(String[] args) {
        Employee[] employees = {
                new FullTime("김자바", 30, "개발팀", 5000),
                new FullTime("이스프링", 35, "백엔드팀", 6000),
                new Contract("박파이썬", 28, "데이터팀", 25000, 160),
                new Contract("최리액트", 26, "프론트팀", 20000, 140),
                new Intern("정코틀린", 22, "개발팀", 180)
        };



        printAll(employees);
        System.out.printf("총 인건비: %.0f만원%n", calcTotalSalary(employees));
        System.out.println("총인원 수: " + Employee.getTotalCount());
    }
}