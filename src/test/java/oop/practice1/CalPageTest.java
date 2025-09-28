package oop.practice1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



class CalPageTest {

    @Test
    void 페이지_각_자릿수_합_계산() {
        //given
        CalPage calPage = new CalPage();
        int page = 97;

        //when
        int result = calPage.sumPage(page);

        // then
        Assertions.assertThat(result).isEqualTo(16);
    }

    @Test
    void 페이지_각_자릿수_곱_계산() {
        //given
        CalPage calPage = new CalPage();
        int page = 97;

        //when
        int result = calPage.mulPage(page);

        //then
        Assertions.assertThat(result).isEqualTo(63);
    }
}
