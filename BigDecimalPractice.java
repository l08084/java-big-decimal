import java.math.BigDecimal;

class BigDecimalPractice {
    public static void main(String[] args) {
        // 1. float, double型では、少数の計算で誤差が発生するケースがある
        double doubleAnswer = 3.3 / 1.1;
        System.out.println("double: " + doubleAnswer); // double: 2.9999999999999996

        BigDecimal bigDecimalAnswer = BigDecimal.valueOf(3.3).divide(BigDecimal.valueOf(1.1));
        System.out.println("bigDecimal: " + bigDecimalAnswer); // bigDecimal: 3

        // 2. 値の丸めかたを指定することができる
    }
}