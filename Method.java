public class Method {

    public static void main(String[] args) {
        System.out.println(Method.method(2222));
    }

    static int method(int x) {
        String num = Integer.toString(x);
        char[] numChar = num.toCharArray();
        int[] numInt = new int[numChar.length];

        for (int i = 0; i < numChar.length; i++) {
            numInt[i] = Character.getNumericValue(numChar[i]);
        }

        int sum = 0;
        for (int i = 0; i < numInt.length; i++) {
            sum += numInt[i];
        }

        return sum;
    }
}
