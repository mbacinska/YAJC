public class Experiments {

    public static void main(String[] args) {
        int result = resultInt(-7);
    }

    static Integer resultInt(Integer arg) {
        return arg < 0 ? null : arg; //wpisujemy null to primitive inta i otrzymujemy exception
    }

    static double sqrtWrapper(double arg) {
        return arg < 0
                ? 0.0
                : Math.sqrt(arg);
    }



    static double sqrtWrapper2(double arg) {
        Double result = Math.sqrt(arg);
        if (result.isNaN()) {
            return 0.0;
        }
        return result; //DRY
    }
}

