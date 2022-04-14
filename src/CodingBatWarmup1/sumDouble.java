package CodingBatWarmup1;

public class sumDouble {
    /*
    Given two int values, return their sum.
    Unless the two values are the same, then return double their sum.
     */
    public int sumDouble(int a, int b) {
        int sum = a + b;

        if (a == b) {
            sum = sum* 2;
        }
        return sum;


    }
}
//        if (a == b) {
//            return (a + b) * 2;
//        } else {
//            return a + b;
//        }
//
//    }

//}


