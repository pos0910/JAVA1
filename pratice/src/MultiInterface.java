public class MultiInterface {
    public static void main(String[] args) {

        Report report = new Report("월간보고서", "이번 달 매출 120% 달성");//여기서 객체생성

        report.print();              // Printable
        report.save("report.txt");   // Saveable
        System.out.println(report.toCSV());  // Exportable

        // 인터페이스 타입으로도 참조 가능 (다형성!)
        Printable p = report;

        p.print();                   // Printable로 보면 print()만 가능
    }
}
