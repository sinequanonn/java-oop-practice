package oop.practice1;

import java.util.List;

public class User {
    private String name;
    private List<Integer> page;
    private CalPage calPage = new CalPage();

    public User(String name, List<Integer> page) {
        this.name = name;
        this.page = page;
    }

    public int checkNumber() {
        int result = 0;

        // 왼쪽 페이지 계산
        int left1 = calPage.sumPage(page.get(0));
        result = Math.max(result, left1);
        int left2 = calPage.mulPage(page.get(0));
        result = Math.max(result, left2);

        // 오른쪽 페이지 계산
        int right1 = calPage.sumPage(page.get(0));
        result = Math.max(result, right1);
        int right2 = calPage.mulPage(page.get(1));
        result = Math.max(result, right2);

        return result;
    }
}
