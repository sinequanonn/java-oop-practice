package oop.practice1;

import java.util.List;

public class ValPage {
    public void validate(List<Integer> page) {
        // 왼쪽 페이지 검증
        int leftPage = page.get(0);
        int rightPage = page.get(1);

        if (leftPage % 2 == 0) {
            throw new IllegalArgumentException("[ERROR] 왼쪽 페이지가 홀수이어야 합니다.");
        }

        if (leftPage < 1 || leftPage > 400 || rightPage < 1 || rightPage > 400) {
            throw new IllegalArgumentException("[ERROR] 페이지의 범위는 1~400이어야 합니다.");
        }

        if (rightPage % 2 == 1) {
            throw new IllegalArgumentException("[ERROR] 오른쪽 페이지가 짝수이어야 합니다.");
        }

        if (rightPage - leftPage != 1) {
            throw new IllegalArgumentException("[ERROR] 두 페이지의 차가 1이어야 합니다.");
        }
    }
}
