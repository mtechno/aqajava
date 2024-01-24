public class Lesson3 {
    public static void main(String[] args) {

    }
    //1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true,
    // в противном случае – false.
    public static boolean checkNumbers (int one, int two){
        int sum = one + two;
        if (sum>=10 && sum<=20){
            return true;
        } else return false;
    }
    //2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.
    public static void checkPositive (int numb) {
        if (numb>=0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    //3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean checkNegative (int numb) {
        if (numb>=0){
            return false;
        } else {
            return true;
        }
    }
    //4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printStringAmount (String string, int amount){
        for (int i = 0; i < amount; i++) {
            System.out.println(string);
        }
    }
    //5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false).
    // Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean checkLeapYear (int year) {
        if ((year%4==0 && year%100!=0) || year%400==0){
            return true;
        } else return false;
    }
    //6. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static void arrayConvert ()  {
        int[] arrayOne = new int[10];
        for (int i = 0; i < arrayOne.length; i = i + 2) {
            arrayOne[i] = 1;
        }
        for (int i = 0; i < arrayOne.length; i = i + 1) {
            arrayOne[i] = 0;
        }
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i]==1) arrayOne[i]=0;
                else arrayOne[i]=1;
        }
    }
    //7. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 ... 100;
    public static void arrayInput () {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }
    }
    //8. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static void arrayInvert () {
        int[] array = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i]*2;
        }
    }
    //9. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    // (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны,
    // то есть [0][0], [1][1], [2][2], ..., [n][n];
    public static void arrayX () {
        int[][] array = new int[6][6];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (i==j) array[i][j] = 1;
            }
        }
    }
    //10. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue.
    public static int[] returnArray (int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < array.length; i++) {
            array[i]=initialValue;
        }
        return array;
    }

}
