package oop.practice1;

import java.util.Arrays;
import java.util.List;

public class Application {

    private static void solution() {
        EvalResult evalResult = new EvalResult();
        CalPage calPage = new CalPage();
        ValPage valPage = new ValPage();

        List<Integer> pobi_page = Arrays.asList(97, 98);
        List<Integer> crong_page = Arrays.asList(197, 198);
        valPage.validate(pobi_page);
        valPage.validate(crong_page);

        User pobi = new User("pobi", pobi_page);
        User crong = new User("crong", crong_page);

        pobi.checkNumber(calPage);
        crong.checkNumber(calPage);

        int result = evalResult.checkResult(pobi.getResult(), crong.getResult());
        System.out.println(result);
    }

    public static void main(String[] args) {
        // TODO 구현
        solution();
    }
}
