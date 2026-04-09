public class StudentRecord implements Printable, Exportable, Comparable<StudentRecord> {
    private String name;
    private int kor, eng, math;

    StudentRecord(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    int getTotal() { return kor + eng + math; }
    double getAvg() { return getTotal() / 3.0; }

    @Override
    public void print() {
        System.out.printf("[%s] 국어:%d 영어:%d 수학:%d | 총점:%d 평균:%.1f%n",
                name, kor, eng, math, getTotal(), getAvg());
    }

    @Override
    public String toCSV() {
        return name + "," + kor + "," + eng + "," + math + "," + getTotal();
    }

    @Override
    public int compareTo(StudentRecord other) {
        return other.getTotal() - this.getTotal();
    }
}