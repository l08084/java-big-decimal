import java.math.BigDecimal;
import java.math.RoundingMode;

class BigDecimalPractice {
    public static void main(String[] args) {
        // whyBigDecimal();
        // init();
        // callConst();
        // compare();
        // compareTo();
        // add();
        // subtract();
        // multiply();
        divide();
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

    private static void compare() {
        System.out.println(BigDecimal.valueOf(0.0).equals(BigDecimal.valueOf(0))); // 値のscaleが異なるため、falseになってしまう
        System.out.println(BigDecimal.valueOf(0).equals(BigDecimal.valueOf(0))); // true
    }

    private static void compareTo() {
        BigDecimal one = BigDecimal.valueOf(1.00);
        System.out.println(one.compareTo(BigDecimal.ZERO)); // 1
        System.out.println(one.compareTo(BigDecimal.ONE)); // 0
        System.out.println(one.compareTo(BigDecimal.TEN)); // -1
    }

    private static void add() {
        BigDecimal three = BigDecimal.valueOf(3.00);
        BigDecimal four = BigDecimal.valueOf(4.0);

        System.out.println(three.add(four)); // 7.0
    }

    private static void subtract() {
        BigDecimal three = BigDecimal.valueOf(3.00);
        BigDecimal four = BigDecimal.valueOf(4.0);

        System.out.println(three.subtract(four)); // -1.0
    }

    private static void multiply() {
        BigDecimal three = BigDecimal.valueOf(3.00);
        BigDecimal four = BigDecimal.valueOf(4.0);

        System.out.println(three.multiply(four)); // 12.00
    }

    private static void divide() {
        BigDecimal three = BigDecimal.valueOf(10.00);
        BigDecimal four = BigDecimal.valueOf(3.0);

        System.out.println(three.divide(four)); // 0.750
    }

}