package oop.practice1;

import java.util.Arrays;

public class Application {

    private static void solution() {
        EvalResult evalResult = new EvalResult();
        CalPage calPage = new CalPage();

        User pobi = new User("pobi", Arrays.asList(97, 98));
        User crong = new User("crong", Arrays.asList(197, 198));

        int pobi_result = pobi.checkNumber(calPage);
        int crong_result = crong.checkNumber(calPage);

        evalResult.checkResult(pobi_result, crong_result);
    }

    public static void main(String[] args) {
        // TODO 구현
        solution();
    }
}
