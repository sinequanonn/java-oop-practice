package oop.practice1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class ValPageTest {

    @Test
    void 왼쪽_페이지가_홀수인지_검증_예외처리발생() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(96, 97);

        //when, then
        assertThatThrownBy(() -> valPage.validate(page))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 왼쪽 페이지가 홀수이어야 합니다.");
    }

    @Test
    void 왼쪽_페이지가_홀수인지_검증_성공() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(97, 98);

        //when, then
        assertDoesNotThrow(() -> {
            valPage.validate(page);
        });
    }

    @Test
    void 오른쪽_페이지가_짝수인지_검증_예외처리발생() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(95, 97);

        //when, then
        assertThatThrownBy(() -> valPage.validate(page))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 오른쪽 페이지가 짝수이어야 합니다.");
    }

    @Test
    void 오른쪽_페이지가_짝수인지_검증_성공() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(97, 98);

        //when, then
        assertDoesNotThrow(() -> {
            valPage.validate(page);
        });
    }

    @Test
    void 페이지_차이가_1인지_검증_예외처리발생() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(97, 100);

        assertThatThrownBy(() -> valPage.validate(page))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 두 페이지의 차가 1이어야 합니다.");
    }

    @Test
    void 페이지_차이가_1인지_검증_성공() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(97, 98);

        assertDoesNotThrow(() -> {
            valPage.validate(page);
        });
    }

    @Test
    void 페이지_범위_1_400_사이_검증() {
        //given
        ValPage valPage = new ValPage();
        List<Integer> page = Arrays.asList(-1, 101);

        // when, then
        assertThatThrownBy(() -> valPage.validate(page))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("[ERROR] 페이지의 범위는 1~400이어야 합니다.");
    }
}
