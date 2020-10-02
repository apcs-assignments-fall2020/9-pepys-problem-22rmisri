public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int c = 0;
        for (int i = 0; i < 100000; i++) {
            for (int j = 0; j < 6; j++) {
                int val = (int) (Math.random()* 6) + 1;
                if ( val == 6) {
                    c = c + 1;
                    break;
                }
            }
        }
        return (c/100000.0 * 100.0);
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int c = 0;
        for (int i = 0; i < 100000; i++) {
            int c2 = 0;
            for (int j = 0; j < 12; j++) {
                int val = (int) (Math.random()* 6) + 1;
                if ((val == 6 ) && (c2 == 1)) {
                    c++;
                    break;
                    }
                else if (val == 6) {
                    c2++;
                }
                
            }
        }
        return (c/100000.0 * 100.0);
    }
    

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
       int c = 0;
        for (int i = 0; i < 100000; i++) {
            int c2 = 0;
            for (int j = 0; j < 18; j++) {
                int val = (int) (Math.random()* 6) + 1;
                if ((val == 6 ) && (c2 == 2)) {
                    c++;
                    break;
                    }
                else if (val == 6) {
                    c2++;
                }
                
            }
        }
        return (c/100000.0 * 100.0);
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
