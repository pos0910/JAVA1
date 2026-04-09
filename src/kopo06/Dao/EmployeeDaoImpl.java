package kopo06.Dao;

import kopo06.app.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDaoImpl implements EmployeeDao {


    private static EmployeeDaoImpl instance; //싱글톤

     List<Employee> employees = new ArrayList<>(); //리스트 생성
    private int nextId = 1; //지역변수 선언

    private  EmployeeDaoImpl() {}//싱글턴

    public static EmployeeDaoImpl getInstance() {//싱글턴
        if (instance == null) {
            instance = new EmployeeDaoImpl();
        }
        return instance;
    }


    public Employee create(Employee employee) {//추가하기
        employee.setId(nextId++);
        employees.add(employee);

        System.out.println("추가완료!  " + employee.getName() + " (총 "+(nextId-1)+"명)");
        return employee;
    }

    public List<Employee> readAll() {
        return new ArrayList<>(employees);
    }

    public Employee update(int id, Employee updated) {
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getId() == id) { //updated할 id를 찾아서 -> 리스트 교체 -> updated 반환
                updated.setId(id);
                employees.set(i, updated);
                return updated;
            }
        }
        return null;
    }

    public Employee delete(String name) {
        for (int i = 0; i < employees.size(); i++) {
            // 현재 위치(i)에 있는 직원의 이름이 입력받은 name과 같은지 비교
            if (employees.get(i).getName().equals(name)) {
                Employee removed = employees.remove(i);
                System.out.println("\n--- 삭제 ---! \n" + name);
                return removed; // 삭제된 객체를 반환하고 종료
            }
        }
        return  null;
    }

    //readone
    public Employee readOne(String name) {//사람 이름으로 직원을 찾는 메서드
        for (Employee emp : employees) {
            if (emp.getName().equals(name)) return emp;
        }
        return null;
    }

    public static void main(String[] args) {
        EmployeeDaoImpl dao = EmployeeDaoImpl.getInstance();

        // 추가하려는 데이터 입력하기

        dao.create(new kopo06.model.FullTime("김자바", 30, "개발팀", 6000));
        dao.create(new kopo06.model.Contract("이자바", 26, "디자인팀", 15000, 160));
        dao.create(new kopo06.model.Intern("박자바", 22, "기획팀", 200));

        EmployeeDaoImpl dao2 = EmployeeDaoImpl.getInstance();
        System.out.println("싱글톤 확인: " + (dao == dao2));  // true - 같은 객체


        // 전체 조회
        System.out.println("\n--- 전체 직원 ---");
        for (Employee emp : dao.readAll()) {
            emp.print();
        }

        // 이름 검색
        System.out.println("\n--- 이름 검색 ---");
        dao.readOne("김자바").print();

        // 수정
        dao.update(1, new kopo06.model.FullTime("김자바수정", 31, "백엔드팀", 7000));

        // 삭제
        dao.delete("박자바");

        // 전체 조회
        System.out.println("\n--- 수정/삭제 후 ---");
        for (Employee emp : dao.readAll()) {
            emp.print();
        }
    }
}