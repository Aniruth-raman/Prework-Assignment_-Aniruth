import java.util.Scanner;

class FirstLetterPrinter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        System.out.println(firstLetterPrinter(input));
        in.close();
    }

    static String firstLetterPrinter(String str) {
        // write your code here
        String[] arrOfStr = str.split(" ");
        char arrNew[] = new char[arrOfStr.length + 1];
        int i;
        for (i = 0; i < arrOfStr.length; i++) {
            arrNew[i] = arrOfStr[i].charAt(0);
        }
        return new String(arrNew);
    }
}