package oop.practice1;

import java.util.List;

public class User {
    private String name;
    private List<Integer> page;
    private int result;

    public User(String name, List<Integer> page) {
        this.name = name;
        this.page = page;
    }

    public void checkNumber(CalPage calPage) {
        // 왼쪽 페이지 계산
        int left1 = calPage.sumPage(page.get(0));
        this.result = Math.max(this.result, left1);
        int left2 = calPage.mulPage(page.get(0));
        this.result = Math.max(this.result, left2);

        // 오른쪽 페이지 계산
        int right1 = calPage.sumPage(page.get(0));
        this.result = Math.max(this.result, right1);
        int right2 = calPage.mulPage(page.get(1));
        this.result = Math.max(this.result, right2);
    }

    public int getResult() {
        return this.result;
    }
}
