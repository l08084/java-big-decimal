import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalPractice {
    public static void main(String[] args) {
        // whyBigDecimal();
        // init();
        callConst();
    }

    private static void whyBigDecimal() {
        // 1. float, double型では、少数の計算で誤差が発生するケースがある
        double doubleAnswer = 3.3 / 1.1;
        System.out.println("double: " + doubleAnswer); // double: 2.9999999999999996

        BigDecimal bigDecimalAnswer = BigDecimal.valueOf(3.3).divide(BigDecimal.valueOf(1.1));
        System.out.println("bigDecimal: " + bigDecimalAnswer); // bigDecimal: 3

        // 2. 値の丸めかたを指定することができる
        double doubleAnswer2 = 10.0 / 3.0;
        System.out.println("double: " + doubleAnswer2); // double: 3.3333333333333335

        BigDecimal bigDecimalAnswer2 = BigDecimal.valueOf(10.0).divide(BigDecimal.valueOf(3.0), 2, RoundingMode.HALF_UP);
        System.out.println("bigDecimal: " + bigDecimalAnswer2); // bigDecimal: 3.33
    }

    private static void init() {
        BigDecimal value1 = BigDecimal.valueOf(1234.56);// 数値からの生成
        BigDecimal value2 = new BigDecimal("1234.56");// 文字列から生成

        System.out.println(value1);
        System.out.println(value2);
    }

    private static void callConst() {
        System.out.println(BigDecimal.ZERO);
        System.out.println(BigDecimal.ONE);
        System.out.println(BigDecimal.TEN);
    }
}