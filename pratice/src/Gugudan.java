public class Gugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 4; i++) {     // 외부: 단 (2~4단)
            System.out.println("[ " + i + "단 ]");
            for (int j = 1; j <= 9; j++) { // 내부: 곱하는 수
                System.out.printf("%d x %d = %2d\n", i, j, i * j);
            }
            System.out.println();          // 단 사이 빈 줄
        }
    }
}