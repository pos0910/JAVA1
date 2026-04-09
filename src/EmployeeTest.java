import kopo06.model.Contract;
import kopo06.model.FullTime;
import kopo06.model.Intern;
import org.junit.jupiter.api.Test;
import static org.testng.AssertJUnit.assertEquals;


public class EmployeeTest {
    @Test
    void testFullTimeSalary(){
        FullTime ft = new FullTime("김자바",30,"개발팀", 5000);
        double salary = ft.calcSalary();
        assertEquals(416.67, salary, 0.01);

    }
    @Test
    void testContractSalary() {
        Contract ct = new Contract("이파이썬", 28, "데이터팀", 25000, 160);
        assertEquals(400.0, ct.calcSalary(), 0.01);  // 25000*160/10000
    }
    @Test
    void testInternSalary() {
        Intern in = new Intern("정코틀린", 22, "개발팀", 180);
        assertEquals(180.0, in.calcSalary(), 0.01);  // 고정 수당
    }


}
