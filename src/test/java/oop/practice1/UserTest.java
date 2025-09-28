package oop.practice1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class UserTest {

    @Test
    void 페이지_각_자릿수의_합과_곱_중에서_큰_값을_가짐() {
        // given
        User user = new User("pobi", Arrays.asList(97, 98));

        // when
        int result = user.checkNumber();

        // then
        Assertions.assertThat(result).isEqualTo(72);
    }
}
