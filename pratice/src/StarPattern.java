public class StarPattern {
    public static void main(String[] args) {
        int n = 5;                         // 총 줄 수
        for (int i = 1; i <= n; i++) {     // 외부: 줄 반복 (1~5)
            for (int j = 1; j <= i; j++) { // 내부: 별 개수 = 줄 번호
                System.out.print("★ ");    // 줄바꿈 없이 별 출력
            }
            System.out.println();          // 한 줄 끝나면 줄바꿈
        }
    }
}