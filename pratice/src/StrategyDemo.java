interface SalaryStrategy {
    double calculate(double base);    // base를 기준으로 급여 계산
    String getDescription();          // 전략 설명
}

// === 전략 구현체 3가지 ===
class AnnualStrategy implements SalaryStrategy {
    @Override
    public double calculate(double base) {
        return base / 12;            // 연봉 / 12 = 월급
    }
    @Override
    public String getDescription() { return "연봉제 (연봉/12)"; }
}

class HourlyStrategy implements SalaryStrategy {
    private int hours;
    HourlyStrategy(int hours) { this.hours = hours; }
    @Override
    public double calculate(double base) {
        return base * hours / 10000; // 시급 × 시간 / 만원
    }
    @Override
    public String getDescription() { return "시급제 (시급×" + hours + "시간)"; }
}

class FixedStrategy implements SalaryStrategy {
    @Override
    public double calculate(double base) {
        return base;                 // 고정 수당 그대로
    }
    @Override
    public String getDescription() { return "고정수당제"; }
}

// === 컨텍스트: 전략을 사용하는 클래스 ===
class SalaryCalculator {
    private SalaryStrategy strategy; // 전략을 교체 가능!

    void setStrategy(SalaryStrategy strategy) {
        this.strategy = strategy;
    }

    void printSalary(String name, double base) {
        double salary = strategy.calculate(base);
        System.out.printf("[%s] %s → 월급: %.0f만원%n",
                name, strategy.getDescription(), salary);
    }
}

public class StrategyDemo {
    public static void main(String[] args) {
        SalaryCalculator calc = new SalaryCalculator();

        // 전략 교체: 같은 계산기, 다른 알고리즘!
        calc.setStrategy(new AnnualStrategy());
        calc.printSalary("김자바", 5000);

        calc.setStrategy(new HourlyStrategy(160));
        calc.printSalary("이파이썬", 25000);

        calc.setStrategy(new FixedStrategy());
        calc.printSalary("정코틀린", 180);
    }
}