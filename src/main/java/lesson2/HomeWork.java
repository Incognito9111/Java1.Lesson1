package lesson2;

public class HomeWork {

    public static void main(String[] args) {
        determineNumber(100);
        checkNumber(10,5);
        bar(8);
        outputString(5,"Hello!");
        printYear(2021);
    }

    public static boolean checkNumber(int x1, int x2) { // quest №1
        int sum = x1 + x2;
        if (sum >= 10 && sum <=20) {
            return true;
        } else {
            return false;
        }
    }

    public static void determineNumber(long figure) { // quest №2
        if (figure < 0) {
            System.out.println("Negative number");
        } else {
            System.out.println("Positive number");
        }
    }

    public static boolean bar(int numOne) { // quest №3
        if (numOne < 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void outputString(int figure, String word) { // quest №4
        for (int i = 0; i < figure; i++) {
            System.out.println(word);
        }
    }

    public static boolean printYear (int year) { // quest №5*
      if (year % 4 == 0) {
          return true;
      } else if (year % 100 == 0){
          return false;
      } else if (year % 400 == 0){
          return true;
      } else {
          return false;
      }

    }
}
