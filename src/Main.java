public class Main {


    public static void main(String[] args) {

        int[] standart = {1, 2, 3, 4};
        int[] reversArray = revers(standart);

        for (int i = 0; i < standart.length; i++) {
            System.out.print(reversArray[i]);
        }

    }

    public static int[] revers(int[] rev) {

        int len = rev.length;
        int[] revers = new int[len];


        for (int i = 0; i < len; i++) {
            revers[i] = rev[len - i - 1];
        }

        return revers;
    }
}