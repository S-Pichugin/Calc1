import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;public class Main {
    public static String calc(String Input) {
        String result = "";
        String[] part = Input.split(" ");
        if (part.length>3){
            try{
                throw new Exception();
            } catch (Exception e){
                return result = "throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)";}
        }
        if (part.length<3){
            try{
                throw new Exception();
            } catch (Exception e){
                return result = "throws Exception //т.к. строка не является математической операцией";}
        }
        String ch1 = part[0];
        int romnum = 0;
        int num1;
        switch (ch1) {
            case "I" -> romnum = 1;
            case "II" -> romnum = 2;
            case "III" -> romnum = 3;
            case "IV" -> romnum = 4;
            case "V" -> romnum = 5;
            case "VI" -> romnum = 6;
            case "VII" -> romnum = 7;
            case "VIII" -> romnum = 8;
            case "IX" -> romnum = 9;
            case "X" -> romnum = 10;
        }
        if (romnum>=1 & romnum<=10) {
             num1 = romnum;}
        else num1 = Integer.parseInt(ch1);

        String ch2 = part[2];
        int romnum1 = 0;
        int num2;
        switch (ch2) {
            case "I" -> romnum1 = 1;
            case "II" -> romnum1 = 2;
            case "III" -> romnum1 = 3;
            case "IV" -> romnum1 = 4;
            case "V" -> romnum1 = 5;
            case "VI" -> romnum1 = 6;
            case "VII" -> romnum1 = 7;
            case "VIII" -> romnum1 = 8;
            case "IX" -> romnum1 = 9;
            case "X" -> romnum1 = 10;
        }
        if (romnum1>=1 & romnum1<=10) {
            num2 = romnum1;}
        else num2 = Integer.parseInt(ch2);

        int otvet = 0;
        switch (part[1]) {
            case "+":
                otvet = num1 + num2;
                break;
            case "-":
                otvet = num1 - num2;
                break;
            case "*":
                otvet = num1 * num2;
                break;
            case "/":
                otvet = num1 / num2;
                break;
            default:
                return result = ("Математическая операция не распознана! Калькулятор считает только (+, -, /, *)");
              }
         if (romnum>=1 & romnum<=10) {
             String[] romNun = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
             String romOtvet;
             try {
                 romOtvet = romNun[otvet - 1];
             } catch (ArrayIndexOutOfBoundsException e) {
                 return result = "throws Exception //т.к. в римской системе нет отрицательных чисел";
             }
             result = romOtvet;
         } else {result = Integer.toString(otvet);}
         if ((num1<0|num1>10)||(num2<0|num2>10)){
             try{
             throw new Exception();
         } catch (Exception e){return result = "Калькулятор считает числа от 0 до 10";}
         }
         String[] stringArray = new String[] {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII","XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX", "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL", "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX", "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX", "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX", "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC", "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"};
        String[] arabArray = new String[]{"0","1","2","3","4","5","6","7","8","9","10"};
        boolean proverka = false;
        boolean proverka1 = false;
        boolean proverka2 = false;
        if(Arrays.stream(stringArray).anyMatch(s -> s.equals(ch1))) {
            proverka1 = true;
        }
        if(Arrays.stream(stringArray).anyMatch(s -> s.equals(ch2))) {
            proverka2 = true;
        }
             if (proverka1==true & proverka2==true){proverka = true;}

        boolean proverkaArCh = false;
        boolean proverkaAr1 = false;
        boolean proverkaAr2 = false;
        if(Arrays.stream(arabArray).anyMatch(s -> s.equals(ch1))) {
            proverkaAr1 = true;
        }
        if(Arrays.stream(arabArray).anyMatch(s -> s.equals(ch2))) {
            proverkaAr2 = true;
        }
        if (proverkaAr1==true & proverkaAr2==true){proverkaArCh = true;}
        boolean proverkaObshaya = false;
        if (proverkaArCh==true || proverka==true){proverkaObshaya = true;}
             if (proverkaObshaya == false){
            try{
                throw new IOException();
            } catch (IOException e){
                result = "throws Exception //т.к. используются одновременно разные системы счисления";}
        }
             return result;
    }
    public static void main(String[] args) {
        System.out.println("Введите выражение (каждый символ через пробел):");
        Scanner sc = new Scanner(System.in);
        String Input = sc.nextLine();
        String result = calc(Input);
        System.out.println(result);
    }
}