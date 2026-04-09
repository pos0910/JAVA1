//import kopo06.Dao.EmployeeDao;
//import kopo06.Dao.EmployeeDaoImpl;
//import kopo06.app.Employee;
//import org.junit.Test;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//
//public class EmployeeServiceTest {
//
//    private EmployeeDao employeeDao = new EmployeeDaoImpl();
//    private EmployeeDao employeeDao = new EmployeeDaoMock();
//    private EmployeeService employeeService = new EmployeeServiceImpl();
//
//
//    @Test
//    void testCalcSalary() {
//        employeeService.setEmployeeDao(employeeDao);
//        Employee employee = employeeDao.readOne(1);
//        EmployeeDao employee = employeeDao.readOne("김자바");
//
//        assertThat(416.67, salary);
//    }
//
//    public class EmployeeDaoMock implements EmployeeDao {
//        public Employee readOne(int id) {
//            Employee employee = new Employee();
//            employee.setId(1);
//            return employee;
//
//        }
//
//    }
//
//
//}