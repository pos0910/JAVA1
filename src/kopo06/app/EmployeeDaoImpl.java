package kopo06.app;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {

    private List<Employee> employees = new ArrayList<>(); //리스트 생성
    private int nextId = 1; //지역변수 선언

    @Override
    public Employee create(Employee employee) {
        employee.setId(nextId++);
        employees.add(employee);
        return employee;
    }

    @Override
    public Employee readOne(int id) {
        for (Employee emp : employees) {
            if (emp.getId() == id) return emp;
        }
        return null;
    }

    @Override
    public List<Employee> readAll() {
        return new ArrayList<>(employees);
    }

    @Override
    public Employee update(int id, Employee updated) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                updated.setId(id);
                employees.set(i, updated);
                return updated;
            }
        }
        return null;
    }

    @Override
    public Employee delete(int id) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) {
                return employees.remove(i);
            }
        }
        return null;
    }

    @Override
    public Employee findByName(String name) {
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) return emp;
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeeDaoImpl dao = new EmployeeDaoImpl();

        // 추가
        dao.create(new kopo06.model.FullTime("김자바", 30, "개발팀", 6000));
        dao.create(new kopo06.model.Contract("이자바", 26, "디자인팀", 15000, 160));
        dao.create(new kopo06.model.Intern("박자바", 22, "기획팀", 200));

        // 전체 조회
        System.out.println("=== 전체 직원 ===");
        for (Employee emp : dao.readAll()) {
            emp.print();
        }

        // 이름 검색
        System.out.println("\n=== 이름 검색 ===");
        dao.findByName("김자바").print();

        // 수정
        dao.update(1, new kopo06.model.FullTime("김자바수정", 31, "백엔드팀", 7000));

        // 삭제
        //dao.delete(2);

        // 전체 조회
        System.out.println("\n=== 수정/삭제 후 ===");
        for (Employee emp : dao.readAll()) {
            emp.print();
        }
    }
}