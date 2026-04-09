import kopo06.model.FullTime;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertThrows;
import static org.testng.AssertJUnit.*;

public class ExceptionTest {
    void testFactoryInvalidType() {
        // "FREELANCER"는 지원하지 않는 타입 → 예외 발생해야!
        Exception ex = Assert.assertThrows(IllegalArgumentException.class, () -> {
            EmployeeFactory.create("FREELANCER", "박루비", 35, "외주팀", 300);
        });
        AssertJUnit.assertTrue(ex.getMessage().contains("알 수 없는 직원 유형"));
    }

    @Test
    void testNegativeAge() {
        // 나이가 음수면 0으로 보정되어야 함
        FullTime ft = new FullTime("테스트", -5, "테스트팀", 3000);
        AssertJUnit.assertEquals(0, ft.getAge());    // 음수 → 0 보정 확인
    }

    @Test
    void testNullName() {
        // null 이름은 어떻게 처리되는지 확인
        FullTime ft = new FullTime(null, 25, "개발팀", 4000);
        AssertJUnit.assertNull(ft.getName());        // null이 그대로인지 확인
    }
}
