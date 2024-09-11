public class NumberofStepstoReduceaNumbertoZero1342 {
    public int numberOfSteps(int num) {
        int stepCounter = 0;
        while (num > 0) {
            if (num % 2 == 0) {
                num /= 2;
                stepCounter++;
            } else {
                num--;
                stepCounter++;
            }
        }
        return stepCounter;
    }
}
