package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.function.IntUnaryOperator;
import java.util.Scanner;
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
}



