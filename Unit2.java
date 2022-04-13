package com.company;

import java.util.*;
import java.util.function.IntUnaryOperator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Unit2 {
    public static void main(String[] args) {
        Exercise1();
        Exercise2();
        Exercise3();
        Exercise4();
        Exercise5();
        Exercise6();
        Exercise7();
        Exercise8();
        Exercise9();
        Exercise10();
        Exercise11();
        Exercise12();
        Exercise13();
        Exercise14();
        Exercise15();
        Exercise16();
        Exercise17();
        Exercise18();
        Exercise19();
        Exercise20();
        Exercise21();
        Exercise22();
        Exercise23();
        Exercise24();
        Exercise25();
        Exercise26();
        Exercise27();
        Exercise28();
        Exercise29();
        Exercise30();
        Exercise31();
        Exercise32();
        Exercise33();
        
    }

    private static void Exercise1() {
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        int sum = 0;

        for (int j : a) {
            if (j % k == 0) {
                sum += j;
            }
        }
        System.out.println("Сумма элементов, которые кратны " + k + ", равна " + sum);
        System.out.println();

    }
    private static void Exercise2() {
        System.out.println("Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим \n" +
                "числом. Подсчитать количество замен.");
        int[] array1 = {-1, 65, 11, 1, 9, 5};
        System.out.println(Arrays.toString(funcElementsReplacements(array1, 10)));
        int[] array2 = {7, 12, 90, 7, 77, 99};
        System.out.println(Arrays.toString(elementReplacement(array2, 20)));
    }
    public static int[] funcElementsReplacements(int[] array, int element) {
        final long[] counter = {0};

        IntUnaryOperator operator = operand -> {
            if (operand > element) {
                counter[0]++;
                return element;
            } else {
                return operand;
            }
        };

        int[] result = Arrays.stream(array)
                .map(operator).toArray();
        System.out.println("Replacements: " + counter[0]);
        return result;
    }
    public static int[] elementReplacement(int[] array, int element) {
        long counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > element) {
                array[i] = element;
                counter++;
            }
        }
        System.out.println("Replacements: " + counter);
        return array;
    }
    private static void Exercise3() {
        System.out.println("3.Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных, \n" +
                "положительных и нулевых элементов.");
        int[] array = {6, 9, 21, 0, 88, 1, -11, -12, 7};

        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (int j : array) {
            if (j > 0) {
                positive++;
            } else if (j < 0) {
                negative++;
            } else {
                zero++;
            }
        }
        System.out.printf("Positive : %d\nNegative : %d\nZero : %d", positive, negative, zero);
        System.out.println();
    }
    private static void Exercise4() {
        System.out.println("4.Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.\n");
        int[] array = {1, 2, -9, 5, 10, 4};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(flipMinMax(array)));
    }
    public static int[] flipMinMax(int[] array) {
        if (array != null) {
            int minIndex = 0;
            int maxIndex = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[minIndex]) {
                    minIndex = i;
                }
                if (array[i] > array[maxIndex]) {
                    maxIndex = i;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[maxIndex];
            array[maxIndex] = temp;
        }
        return array;
    }
    private static void Exercise5() {
        System.out.println("5.Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i\"");
        int[] array = {-5, 134, 21, -6, 0, -2, 14};
        {
            for (int i = 0; array.length > i; i++)
                if (array[i] > i) {
                    System.out.print(array[i] + " ");
                }
            System.out.println();
        }
    }
    private static void Exercise6() {
        System.out.println("6.Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых \n" +
                "являются простыми числами.");
        double[] arr = new Random().doubles(4, 0., 100.).toArray();
        double sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(i)) {
                sum += arr[i];
            }
        }
        System.out.println("Sum: " + sum);

    }
    public static boolean isPrime(int x) {
        if (x < 2) return false;
        int temp;
        for (int i = 2; i <= x / 2; i++) {
            temp = x % i;
            if (temp == 0) {
                return false;
            }
        }
        return true;
    }
    private static void Exercise7() {
        System.out.println("7.Даны действительные числа a1,a2.....an.Найити:");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array N: ");
        int n = in.nextInt();
        double[] array = new double[n];
        if (array.length % 2 != 0) {
            throw new IllegalArgumentException("Enter the size of the array!!!");
        }
        System.out.println("Populate the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = in.nextDouble();
        }
        System.out.println("Max sum = " + maxSumEvenArray(array));
    }
    public static double maxSumEvenArray(double[] array) {
        double maxSum = array[0] + array[array.length - 1];
        for (int i = 1; i < array.length / 2; i++) {
            if ((array[i] + array[array.length - i - 1]) > maxSum) {
                maxSum = array[i] + array[array.length - i - 1];
            }
        }
        return maxSum;
    }
    private static void Exercise8() {
        System.out.println("8.Даны действительные числа a1,a2.....an.Образовать новую последовательность, выбросив из \n" +
                "исходной те члены, которые равны \n" +
                "min(a1,a2.....an)");
        int[] array = {1, 2, 3, 4, 5, 6, 1, 8, 9, 1, 3, 6, 8};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(removeMin(array)));
        System.out.println(Arrays.toString(funcRemoveMin(array)));
    }
    public static int[] removeMin(int[] array) {
        int counter = 0;
        int min = array[0];

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }

        for (int element : array) {
            if (element == min) {
                counter++;
            }
        }

        int[] result = new int[array.length - counter];

        int j = 0;
        for (int k : array) {
            if (k != min) {
                result[j++] = k;
            }
        }

        return result;
    }
    public static int[] funcRemoveMin(int[] array) {
        int min = Arrays.stream(array)
                .min().getAsInt();
        return Arrays.stream(array)
                .filter(n -> n != min)
                .toArray();
    }
    private static void Exercise9() {
        System.out.println("9.В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких \n" +
                "чисел несколько, то определить наименьшее из них.\n");
        final int EXC = 1;
        int[] array = {7, 2, 3, 7, 4, 5, 7, 6, 8, 9, 7, 7};
        int[] exceptionNumbers = new int[array.length];
        int counterOfSameNumbers = 0;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                if (array[i] == array[j] && array[j] != EXC) {
                    counterOfSameNumbers++;
                    exceptionNumbers[counter] = array[j];
                }
            }
            if (counterOfSameNumbers > 1) {
                System.out.println("Number " + array[i] + " meets " + counterOfSameNumbers + " once");
                for (int j = 0; j < array.length; j++) {
                    if (array[j] == exceptionNumbers[counter]) array[j] = EXC;
                }
            }
            counterOfSameNumbers = 0;
            counter++;
        }
    }
    private static void Exercise10() {
        System.out.println("10.Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй \n" +
                "элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать");
        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayMas(array)));
    }
    public static int[] arrayMas(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i = i + 2) {
            array[index] = array[i];
            index++;
        }

        Arrays.fill(array, index, array.length, 0);
        return array;
    }
    private static void Exercise11() {
        System.out.println("11.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.");
        int[][] matrixA;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Matrix height: ");
        int m = scanner.nextInt();
        System.out.println("Matrix Width: ");
        int n = scanner.nextInt();
        matrixA = new int[m][n];
        for (int i = 0; i < m; i++) {
            System.out.println((i + 1) + "String");
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = scanner.nextInt();
            }
        }
        System.out.println();
        System.out.println("Odd columns whose first element is greater than the last:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j += 2) {
                if (matrixA[0][j] > matrixA[m - 1][j]) {
                    System.out.print(matrixA[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
    private static void Exercise12() {
        System.out.println("12.Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.");
        Scanner s = new Scanner(System.in);
        System.out.println("Matrix size");
        int n = s.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + " String");
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();
            }
        }
        for (int i = a.length - 1; i >= 0; i--) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(a[i][j] + " ");
                }
            }
        }
        System.out.println();

    }
    private static void Exercise13() {
        System.out.println("13.Дана матрица. Вывести k-ю строку и p-й столбец матрицы");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int strings = Integer.parseInt(reader.readLine());
            System.out.println("Enter quality of strings");
            int columns = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[strings][columns];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println("Choose the string");
            int k = Integer.parseInt(reader.readLine());
            System.out.println("Choose the column");
            int p = Integer.parseInt(reader.readLine());

            System.out.println("The string is ");
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (i == k - 1)
                        System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

            System.out.println("The column is ");
            for (int[] ints : matrix) {
                for (int j = 0; j < ints.length; j++) {
                    if (j == p - 1)
                        System.out.printf("%3d ", ints[j]);
                }
                System.out.println();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void Exercise14() {
        System.out.println("14.формировать квадратную матрицу порядка n по заданному образцу(n - четное):\n");
        int n = enterNum();
        int[][] mas = new int[n][n];
        form(mas);
        print(mas);

    }
    public static int enterNum() {
        int num;
        while (true) {
            System.out.print("Enter number n: ");
            @SuppressWarnings("resource")
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num > 1) {
                    if (num % 2 == 0)
                        break;
                    else System.out.print("Odd number, does not fit the condition!  ");
                } else {
                    System.out.print("The number is negative or less than 2, please re-enter!  ");
                }
            } else {
                System.out.print("Incorrect value, please try again!  ");
            }
        }
        return num;
    }
    public static void form(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < mat[i].length; j++) {
                    mat[i][j] = mat[j].length - j;
                }
            }
        }


    }
    public static void print(int[][] mat) {
        for (int[] ints : mat) {
            for (int anInt : ints) {
                System.out.printf("%3d", anInt);
            }
            System.out.println();
        }


    }
    private static void Exercise15() {
        System.out.println("15.формировать квадратную матрицу порядка n по заданному образцу(n - четное):\n");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = in.nextInt();
        int[][] array = new int[n][n];
        if (n % 2 != 0) {
            throw new IllegalArgumentException("The size of the array must be even!");
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == n - count) {
                    for (; j < n; j++) {
                        array[i][j] = 0;
                    }
                } else
                    array[i][j] = i + 1;
            }
            count++;
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    private static void Exercise16() {
        System.out.println("16.формировать квадратную матрицу порядка n по заданному образцу(n - четное):\n");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the square matrix with even number n: ");
            int n = Integer.parseInt(reader.readLine());
            int[][] matrix = new int[n][n];

            if (n % 2 == 0) {
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if ((j >= i && j + i < n) || (j <= i && j + i >= n - 1)) {
                            matrix[i][j] = 1;
                        } else {
                            matrix[i][j] = 0;
                        }
                        System.out.printf("%2d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            } else {
                System.out.println(" Number N is odd ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise17() {
        System.out.println("17.Сформировать квадратную матрицу порядка N по правилу: ");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter the square matrix with even number n: ");
            int n = Integer.parseInt(reader.readLine());
            double [][] matrix = new double[n][n];
            int count;

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = Math.sin((i * i - j * j) / n);
                    System.out.printf("%5f",matrix[i][j]);
                }
                System.out.println();
            }

            count = 0;
            for (double [] array : matrix) {
                for (double element : array) {
                    if (element > 0) {
                        count++;
                    }
                }
            }
            System.out.printf("%n Amount of positive numbers: %d", count);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise18() {
        System.out.println("18.В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить \n" +
                "на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит \n" +
                "пользователь с клавиатуры.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];
            int swap;
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                    matrix[i][j] = (int) (Math.random() * 100) * positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Choose the number 1 of column that you want to change: ");
            int s = Integer.parseInt(read.readLine()) - 1;
            System.out.println("Choose the number 2 of column that you want to change: ");
            int z = Integer.parseInt(read.readLine()) - 1;

            for (int i = 0; i < matrix.length; i++) {
                swap = matrix[i][s];
                matrix[i][s] = matrix[i][z];
                matrix[i][z] = swap;
            }

            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise19() {
        System.out.println("19.Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой \n" +
                "столбец содержит максимальную сумму.\n");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = (int) (Math.random() * 100);
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            int maxColumn = 1;
            int maxSum = 0;
            int sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                for (int[] ints : matrix) {
                    sum += ints[j];
                }
                System.out.printf("%nThe sum elements in column is №%d: %d", j + 1, sum);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxColumn = j + 1;
                }
                sum = 0;
            }

            System.out.printf("\n\nColumn №%d consists max sum.", maxColumn);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise20() {
        System.out.println("20.Найти положительные элементы главной диагонали квадратной матрицы.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {

                    int positiveNegative = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 50)*positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            System.out.println("\nPositive elements of main diagonal : ");
            for (int i = 0; i < matrix.length; i++) {
                if (matrix[i][i] > 0) {
                    System.out.printf("%d, ", matrix[i][i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise21(){
        System.out.println("21.Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в \n" +
                "которых число 5 встречается три и более раз.");
        int[][] matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 15);
                System.out.printf("%3d ", matrix[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int count;
        System.out.println("\nNumber of string, where digit 5 meets three or more times: ");
        for (int i = 0; i < matrix.length; i++) {
            count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.printf("%d, ", i + 1);
            }
        }
        System.out.println("\b\b");
    }
    private static void Exercise22() {
        System.out.println("22.Отсортировать строки матрицы по возрастанию и убыванию значений элементов.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 89)*positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println();

            boolean isSorted;
            int swap;
            System.out.println("Sorting by ascending ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] > matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }

            System.out.println("\nSorting by descending  ");
            for (int i = 0; i < matrix.length; i++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int j = 0; j < matrix[i].length - 1; j++) {
                        if (matrix[i][j] < matrix[i][j + 1]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i][j + 1];
                            matrix[i][j + 1] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise23() {
        System.out.println("23.Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.");
        boolean isSorted;
        int swap;

        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 100)*positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }
            System.out.println("\nSorting by ascending ");
            for (int j = 0; j < matrix[0].length; j++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < matrix.length - 1; i++) {
                        if (matrix[i][j] > matrix[i + 1][j]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
            System.out.println("\nSorting by descending  ");
            for (int j = 0; j < matrix[0].length; j++) {
                isSorted = false;
                while (!isSorted) {
                    isSorted = true;
                    for (int i = 0; i < matrix.length - 1; i++) {
                        if (matrix[i][j] < matrix[i + 1][j]) {
                            isSorted = false;
                            swap = matrix[i][j];
                            matrix[i][j] = matrix[i + 1][j];
                            matrix[i + 1][j] = swap;
                        }
                    }
                }
            }
            for (int[] ints : matrix) {
                for (int anInt : ints) {
                    System.out.printf("%3d ", anInt);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise24() {
        System.out.println("24.Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число \n" +
                "единиц равно номеру столбца");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quality of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quality of columns equals quality of strings ");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            if(m == n) {
                int count;
                for (int i = 0; i < matrix.length; i++) {
                    count = i + 1;
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (count - 1 > 0) {
                            matrix[i][j] = 0;
                            count--;
                        } else {
                            matrix[i][j] = 1;
                        }
                        System.out.printf("%3d ", matrix[i][j]);
                    }
                    System.out.println();
                }
            }else System.out.println("If you want to get correct answer please enter m = n! ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise25() {
        System.out.println("25.Найдите наибольший элемент матрицы и заменить все нечетные элементы на него");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity of strings");
            int n = Integer.parseInt(read.readLine());
            System.out.println("Enter quantity of columns");
            int m = Integer.parseInt(read.readLine());
            int[][] matrix = new int[n][m];

            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    int positiveNegative = Math.random()<0.5?-1:1;
                    matrix[i][j] = (int) (Math.random()* 100)*positiveNegative;
                    System.out.printf("%3d ", matrix[i][j]);
                }
                System.out.println();
            }

            System.out.println();
            int max = Integer.MIN_VALUE;
            for (int [] array : matrix) {
                for (int element : array) {
                    if (element > max) {
                        max = element;
                    }
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    if (matrix[i][j] % 2 != 0) {
                        matrix[i][j] = max;
                    }
                }
            }
            for (int[] array : matrix) {
                for (int element : array) {
                    System.out.printf("%3d ", element);
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise26() {
        System.out.println("26. Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...n^2\n" +
                "так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между \n" +
                "собой. Построить такой квадрат. Пример магического квадрата порядка 3:");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {

            int [][] square;
            int n;

            System.out.println("Create an order of magic square: ");
            n = Integer.parseInt(reader.readLine());

            while (n < 3) {
                System.out.printf("Magic square an order %d not exist %n", n);
                System.out.println("Create new order of magic square: ");
                n = Integer.parseInt(reader.readLine());
            }
            if ((n - 1) % 2 == 0) {
                square = oddMagicSquare(n);
            } else if (n % 4 == 0) {
                square = evenMagicSquare(n);
            } else {
                square = evenOddMagicSquare(n);
            }
            System.out.println("\nTo get magic square: ");
            printMatrix(square);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int [][] oddMagicSquare (int n){
        int [][] square = new int[n][n];
        int i = 0;
        int j = (n - 1) / 2;
        square[i--][j++] = 1;
        for (int k = 2; k <= n * n; i--, j++, k++) {
            if (i < 0 && j > n - 1) {
                i += 2;
                j--;
            }
            if (i < 0) {
                i = n - 1;
            }
            if (j > n - 1) {
                j = 0;
            }
            if (square[i][j] != 0) {
                i += 2;
                j--;
            }
            square[i][j] = k;
        }
        return square;
    }
    private static int [][] evenMagicSquare (int n){
        int [][] square = new int[n][n];
        int k = 1;

        for (int i = 0; i < square.length; i++) {
            for (int j = 0; j < square.length; j++) {
                square[i][j] = k;
                k++;
            }
        }

        for (int i = 0; i < n; i += 4 ) {
            for (int j = 1; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 3][j] = n * n + 1 - square[i + 3][j];
                square[i][j + 1] = n * n + 1 - square[i][j + 1];
                square[i + 3][j + 1] = n * n + 1 - square[i + 3][j + 1];
            }
        }
        for (int i = 1; i < n; i += 4 ) {
            for (int j = 0; j < n; j += 4) {
                square[i][j] = n * n + 1 - square[i][j];
                square[i + 1][j] = n * n + 1 - square[i + 1][j];
                square[i][j + 3] = n * n + 1 - square[i][j + 3];
                square[i + 1][j + 3] = n * n + 1 - square[i + 1][j + 3];
            }
        }
        return square;
    }
    private static int [][] evenOddMagicSquare (int n){
        int [][] square = new int[n][n];
        int [][] squareT = evenMagicSquare(n - 2);
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                square[i][j] = squareT[i - 1][j - 1] + 2 * (n - 1);
            }
        }
        int m = n / 2;
        int d = n * n + 1;

        square[0][0] = 3 * m - 1;
        square[0][n - 1] = 1;
        square[n - 1][0] = d - 1;
        square[n - 1][n - 1] = d - 3 * m + 1;

        int i, j;
        for (i = 1; i <= m - 2; i++) {
            square[0][i] = 2 * i + 1;
        }
        for (j = 1; j <= m; j++) {
            square[0][j + i - 1] = d - 2 * j;
        }
        for (j = 1; j < n - 1; j++) {
            square[n - 1][j] = n * n + 1 - square[0][j];
        }
        square[1][0] = 2 * m - 1;
        for (i = 1; i <= m / 2; i++) {
            square[i + 1][0] = 3 * m - 1 - i;
        }
        i--;
        for (j = 1; j <= m / 2 + 1; j++) {
            square[i + j + 1][0] = d - 4 * m + 1 + j;
        }
        j--;
        for (int q = 1; q <= m / 2 - 1; q++, i++){
            square[i + j + q + 1][0] = 3 * m - 1 + q;
            square[i + j + q + 2][0] = d - 2 * m - q;
        }

        for (i = 1; i < n - 1; i++) {
            square[i][n - 1] = n * n + 1 - square[i][0];
        }

        return square;
    }
    private static void printMatrix (int [][] square) {
        for (int[] array : square) {
            for (int element : array) {
                System.out.printf("%4d ", element);
            }
            System.out.println();
        }
    }
    private static void Exercise27() {
        System.out.println("1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.");
        System.out.println("27. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в \n" +
                "один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя \n" +
                "дополнительный массив.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity an elements of first array: ");
            int n = Integer.parseInt(read.readLine());
            int[] firstArray = new int[n];

            for (int i = 0; i < firstArray.length; i++) {
                firstArray[i] = (int) (Math.random() * 100) - 50;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\n\nEnter quantity an elements of second array: ");
            int m = Integer.parseInt(read.readLine());
            int[] secondArray = new int[m];

            for (int i = 0; i < secondArray.length; i++) {
                secondArray[i] = (int) (Math.random() * 100) - 50;
                System.out.print(secondArray[i] + ", ");
            }

            System.out.println("\n\nChoose number from first array: ");
            int k = Integer.parseInt(read.readLine());

            System.out.println("\n\nResult of joining two arrays : ");
            for (int value : firstArray) {
                System.out.print(value + ", ");
                if (k == value) {
                    for (int i : secondArray) {
                        System.out.print(i + ", ");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise28() {
        System.out.println("28.Даны две последовательности a1 <= a2 <= a3 <= aN и b1 <= b2 <=b3 <= bM. Образовать из них новую последовательность\n" +
                "    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity the elements of first sequence: ");
            int n = Integer.parseInt(read.readLine());
            int[] firstArray = new int[n + 1];

            for (int i = 1; i < firstArray.length; i++) {
                firstArray[i] = firstArray[i - 1] + 1;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\n\nEnter quantity the elements of second sequence: ");
            int m = Integer.parseInt(read.readLine());
            int[] secondArray = new int[m + 1];

            for (int i = 1; i < secondArray.length; i++) {
                secondArray[i] = secondArray[i - 1] + 2;
                System.out.print(secondArray[i] + ", ");
            }

            int[] joinArray = new int[firstArray.length + secondArray.length];

            for (int i = 0; i < joinArray.length; i++) {
                if (i < firstArray.length) {
                    joinArray[i] = firstArray[i];
                } else {
                    joinArray[i] = secondArray[i - firstArray.length];
                }
            }

            for (int i = joinArray.length - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (joinArray[j] > joinArray[j + 1]) {
                        int temp = joinArray[j];
                        joinArray[j] = joinArray[j + 1];
                        joinArray[j + 1] = temp;
                    }
                }
            }
            System.out.println("\n\nNew sequence: ");
            for (int value : joinArray) {
                System.out.print(value + ", ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void Exercise29() {
        System.out.println("29.Сортировка выбором. Дана последовательность чисел a1<=a2<=a3<= ...<=aN .Требуется переставить элементы так,\n" +
                "        чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший\n" +
                "        элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура\n" +
                "        повторяется. Написать алгоритм сортировки выбором.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity the elements of sequence: ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n + 1];
            for (int i = 1; i < array.length; i++) {
                array[i] = array[i - 1] + 3;
                System.out.print(array[i] + ", ");
            }
            System.out.println();

            int max;
            int temp;
            for (int i = 0; i < array.length; i++) {
                max = i;
                for (int j = i; j < array.length; j++) {
                    if (array[j] > array[max]) {
                        max = j;
                    }
                }
                temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
            for (int i = 0; i < array.length-1; i++) {
                System.out.print(array[i] + ", ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    private static void Exercise30() {
        System.out.println("30.Сортировка обменами. Дана последовательность чисел a1 <= a2 <=...<= aN .Требуется переставить числа в\n" +
                "        порядке возрастания. Для этого сравниваются два соседних числа a i и a i + 1 . Если a i > a i + 1 , то делается\n" +
                "        перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.\n" +
                "        Составить алгоритм сортировки, подсчитывая при этом количества перестановок.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter quantity an elements of array: ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                array[i] = (int) (Math.random() * 77) - 44;
                System.out.print(array[i] + ", ");
            }
            System.out.println("\n\n Bubble sort : ");
            int swap;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < i; j++) {

                    if (array[i] < array[j]) {
                        swap = array[i];
                        array[i] = array[j];
                        array[j] = swap;
                    }
                }
            }
            for (int value : array) {
                System.out.print(value + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void Exercise31() {
        System.out.println("31.Сортировка вставками. Дана последовательность чисел a1, a2, a3, a4...aN.\n" +
                "   Требуется переставить числа в порядке возрастания. Делается это следующим образом.\n" +
                "   Пусть a1, a2, a3 .. aN упорядоченная последовательность, т.е. a1<=a2<=...<=aN.\n" +
                "   Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая\n" +
                "   последовательность была тоже возрастающей.\n" +
                "   Процесс производится до тех пор, пока все элементы от i + 1 до n не будут перебраны.\n" +
                "   Примечание. Место помещения очередного элемента в отсортированную часть производить\n" +
                "   с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity of the sequence. ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 30) * positiveNegative;
                System.out.print(array[i] + ", ");
            }

            sortingByInsert(array);

            System.out.println("\nAfter sorting: ");
            for (int value : array) {
                System.out.print(value + ", ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void sortingByInsert(int[] array) {
        int temp;
        for (int i = 1; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                int j = binarySearch(array, i, array[i + 1]);
                if (i + 1 - j >= 0) System.arraycopy(array, j, array, j + 1, i + 1 - j);
                array[j] = temp;
            }
        }
    }
    private static int binarySearch(int[] array, int lastIndex, int element) {
        int j = lastIndex;
        int firstIndex = 0;
        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
    private static void Exercise32() {
        System.out.println("32.Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить\n" +
                " *  его по возрастанию. Делается это следующим образом: сравниваются два сосед-\n" +
                " *  них элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один\n" +
                " *  элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаю-\n" +
                " *  тся на один элемент назад. Составить алгоритм этой сортировки.");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity of the sequence. ");
            int n = Integer.parseInt(read.readLine());
            int[] array = new int[n];

            for (int i = 0; i < array.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                array[i] = (int) (Math.random() * 44) * positiveNegative;
                System.out.print(array[i] + ", ");
            }

            System.out.println("\nResult after sorting: ");
            sortingShell(array);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static void sortingShell(int[] array){
        int temp;
        int i = 1;
        while (i < array.length) {
            if (array[i - 1] > array[i]) {
                temp = array[i - 1];
                array[i - 1] = array[i];
                array[i] = temp;
                if (i - 1 > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        for (int value : array) {
            System.out.print(value + ", ");
        }

    }
    private static void Exercise33() {
        System.out.println("33. Пусть даны две неубывающие последовательности действительных чисел\n" +
                " * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на\n" +
                " * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в\n" +
                " * первую последовательность так, чтобы новая последовательность оставалась\n" +
                " * возрастающей");
        try (BufferedReader read = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("Enter quantity of the first sequence. ");
            int n = Integer.parseInt(read.readLine());
            int[] firstArray = new int[n];

            for (int i = 0; i < firstArray.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                firstArray[i] = (int) (Math.random() * 41) * positiveNegative;
                System.out.print(firstArray[i] + ", ");
            }

            System.out.println("\nEnter quantity of the second sequence. ");
            int m = Integer.parseInt(read.readLine());
            int[] secondArray = new int[m];

            for (int i = 0; i < secondArray.length; i++) {
                int positiveNegative = Math.random() < 0.5 ? -1 : 1;
                secondArray[i] = (int) (Math.random() * 100) * positiveNegative;
                System.out.print(secondArray[i] + ", ");
            }

            int[] newArray = firstArray;

            System.out.println("\nResult after sorting: ");
            for (int element : secondArray) {
                int pointInsert = insert(newArray, element);
                int[] arrayTemp = new int[newArray.length + 1];
                for (int i = 0; i < newArray.length; i++) {
                    if (pointInsert > i) {
                        arrayTemp[i] = newArray[i];
                    } else if (pointInsert == i) {
                        arrayTemp[i] = element;
                        arrayTemp[i + 1] = newArray[i];
                    } else {
                        arrayTemp[i + 1] = newArray[i];
                    }
                }
                newArray = arrayTemp;
                System.out.printf("%n%nPosition of insert of new array \"%d\": i = %d", element, pointInsert);
                System.out.println("\n\n New sequence after sorting : ");

                printArray(newArray);
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    private static int insert(int[] array, int element) {
        int j = 0;
        int firstIndex = 0;
        int lastIndex = array.length - 1;

        while (firstIndex <= lastIndex) {
            j = (firstIndex + lastIndex) / 2;
            if (array[j] == element) {
                return j;
            } else if (array[j] < element) {
                firstIndex = j + 1;
            } else if (array[j] > element && j != 0 && !(array[j - 1] < element)) {
                lastIndex = j - 1;
            } else {
                break;
            }
        }
        return j;
    }
    private static void printArray(int[] a) {
        for (int element : a) {
            System.out.printf("%d ", element);
        }
    }




}
