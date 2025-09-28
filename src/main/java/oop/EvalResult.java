package oop;

public class EvalResult {

    public int checkResult(int pobi, int crong) {
        if (pobi > crong) {
            return 1;
        }
        if (crong > pobi) {
            return 2;
        }
        if (pobi == crong) {
            return 0;
        }

        return -1;
    }
}
