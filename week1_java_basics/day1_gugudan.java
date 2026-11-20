// 1주차 1일차 - 구구단 (2~9단)
// 3단계: 1) 보고 따라치기 2) 가리고 설명하며 치기 3) 완전히 안 보고

public class day1_gugudan {
    public static void main(String[] args) {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " * " + j + " = " + (i * j));
            }
        }
    }
}
