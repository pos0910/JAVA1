import kopo06.app.Employee;
import kopo06.model.Contract;
import kopo06.model.FullTime;
import kopo06.model.Intern;

public class EmployeeFactory {
    // double params -> double... params (가변 인자로 변경)
    public static Employee create(String type, String name, int age, String dept, double... params) {

        switch (type.toUpperCase()) {
            case "FULL":
                // params[0]은 연봉 등 첫 번째 값
                return new FullTime(name, age, dept, params[0]);
            case "CONTRACT":
                // params[0]은 시급, params[1]은 시간 등
                return new Contract(name, age, dept, params[0], (int) params[1]);
            case "INTERN":
                return new Intern(name, age, dept, params[0]);
            default:
                throw new IllegalArgumentException("알 수 없는 직원 유형: " + type);
        }
    }

    public static void main(String[] args) {
        // 이제 인자 개수가 달라도 오류가 나지 않습니다.
        Employee e1 = EmployeeFactory.create("FULL", "김자바", 30, "개발팀", 5000);
        Employee e2 = EmployeeFactory.create("CONTRACT", "이파이썬", 28, "데이터팀", 25000, 160);
        Employee e3 = EmployeeFactory.create("INTERN", "정코틀린", 22, "개발팀", 180);

        e1.print();
        e2.print();
        e3.print();

        try{
            Employee e4 = EmployeeFactory.create("FREELANCER", "박루비",35,"외주팀", 300);

        }catch (IllegalArgumentException e){
            System.out.println("에러: " + e.getMessage());

        }
    }
}
