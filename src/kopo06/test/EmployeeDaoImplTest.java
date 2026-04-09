package kopo06.test;

import kopo06.Dao.EmployeeDaoImpl;
import kopo06.app.Employee;
import kopo06.model.Contract;
import kopo06.model.FullTime;
import kopo06.model.Intern;
import org.junit.jupiter.api.*;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class EmployeeDaoImplTest {

    static EmployeeDaoImpl dao;

    @BeforeAll
    static void setUp() {
        dao = EmployeeDaoImpl.getInstance();
        dao.create(new FullTime("김자바", 30, "개발팀", 6000));
        dao.create(new Contract("이자바", 26, "디자인팀", 15000, 160));
        dao.create(new Intern("박자바", 22, "기획팀", 200));
    }

    @Test
    @Order(1)
    @DisplayName("싱글톤 - 같은 인스턴스 반환")
    void testSingleton() {
        EmployeeDaoImpl dao2 = EmployeeDaoImpl.getInstance();
        assertSame(dao, dao2);
    }

    @Test
    @Order(2)
    @DisplayName("전체 조회 - 3명")
    void testReadAll() {
        List<Employee> list = dao.readAll();
        assertEquals(3, list.size());
    }

    @Test
    @Order(3)
    @DisplayName("이름 검색 - 김자바 찾기")
    void testReadOne() {
        Employee emp = dao.readOne("김자바");
        assertNotNull(emp);
        assertEquals("김자바", emp.getName());
    }

    @Test
    @Order(4)
    @DisplayName("이름 검색 - 없는 직원")
    void testReadOneNotFound() {
        Employee emp = dao.readOne("없는사람");
        assertNull(emp);
    }

    @Test
    @Order(5)
    @DisplayName("수정 - id 1번 직원 수정")
    void testUpdate() {
        Employee updated = dao.update(1, new FullTime("김자바수정", 31, "백엔드팀", 7000));
        assertNotNull(updated);
        assertEquals("김자바수정", updated.getName());
    }

    @Test
    @Order(6)
    @DisplayName("삭제 - 박자바 삭제")
    void testDelete() {
        Employee deleted = dao.delete("박자바");
        assertNotNull(deleted);
        assertNull(dao.readOne("박자바"));
    }

    @Test
    @Order(7)
    @DisplayName("삭제 후 전체 조회 - 2명")
    void testReadAllAfterDelete() {
        List<Employee> list = dao.readAll();    //리스트 값 전부 출력
        assertEquals(2, list.size());
    }
}