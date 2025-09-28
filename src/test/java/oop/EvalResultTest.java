package oop;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EvalResultTest {

    @Test
    void 포비_승리시_1_반환_검증() {
        // given
        EvalResult evalResult = new EvalResult();
        int pobi = 130;
        int crong = 129;

        // when
        int result = evalResult.checkResult(pobi, crong);

        // then
        Assertions.assertThat(result).isEqualTo(1);
    }

    @Test
    void 크롱_승리시_2_반환_검증() {
        // given
        EvalResult evalResult = new EvalResult();
        int pobi = 130;
        int crong = 131;

        // when
        int result = evalResult.checkResult(pobi, crong);

        // then
        Assertions.assertThat(result).isEqualTo(2);
    }

    @Test
    void 무승부시_0_반환_검증() {
        // given
        EvalResult evalResult = new EvalResult();
        int pobi = 130;
        int crong = 130;

        // when
        int result = evalResult.checkResult(pobi, crong);

        // then
        Assertions.assertThat(result).isEqualTo(0);
    }
}
