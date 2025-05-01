
public class Main {
    public static void main(String[] args) {
        // Функции в Java
//        info("Привет");

        short num = 8;
        short num2 = 5;
        summa(num2,  num);
        // Второй вариант записи
        short num3 = 10;
        summa((short) 8, num3);
    }

    public static void info(String word) {
        System.out.println(word);
    }

    public static void summa(short a, short b){
        int res = a + b;
        String result = "Результат: " + res;
        info(result);
    }
}