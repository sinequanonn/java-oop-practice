package oop.practice1;

public class CalPage {

    // 페이지의 각 자릿수의 합을 계산하는 함수
    public int sumPage(int page) {
        int result = 0;
        while (page != 0) {
            result += (page % 10);
            page /= 10;
        }
        return result;
    }


    public int mulPage(int page) {
        int result = 1;

        while (page != 0) {
            result *= (page%10);
            page /= 10;
        }
        return result;
    }
}
