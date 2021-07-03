package chernyh.company;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Main {

    public static void main(String[] args) {
        public static void main(String[] args) {
            Integer[][] twoDimArray = {{2, 9, 5}, {8, 47, 2}, {100, 3, 5}};

            System.out.println(first(twoDimArray));
            System.out.println(second(twoDimArray));
            System.out.println(third(twoDimArray));
            Arrays.stream(fourth(5, 7)).map(Arrays::toString).forEach(System.out::println);
            System.out.println(fifth(new int[]{4, 8, 2}, new int[]{1, 2, 1}));
        }
        public static Integer first(Integer[][] array) {
         {
            if (array == null)
                throw new NullPointerException();

            Integer maxValue = null;
            for (Integer[] subArray : array) {
                for (Integer item : subArray) {
                    if (maxValue == null) {
                        maxValue = item;
                        continue;
                    }

                    if (item.compareTo(maxValue) > 0)
                        maxValue = item;
                }
            }

            return maxValue;
        }
        public static boolean second(Integer[][] array) {
            if (array == null)
                throw new NullPointerException();

            for (Integer[] subArray : array) {
                if (subArray.length != array.length)
                    return false;
            }

            return true;
        }
        public static Integer third(Integer[][] array) {
            if (array == null)
                throw new NullPointerException();

            int sum = 0;
            Integer line = null;
            for (int i = 0; i < array.length; i++) {
                int subSum = 0;
                for (Integer item : array[i]) {
                    subSum += item;
                }

                if (subSum > sum) {
                    line = i;
                    sum = subSum;
                }
            }

            return line;
        }
        public static char[][] fourth(int m, int n) {
            if (m <= 0 || n <= 0)
                throw new Error("Входные параметры должны быть больше \"0\"");

            Random random = new Random();
            String rus = "абвгдеёжзийклмнопрстуфхцчъыьэюя";

            char[][] array = new char[m][n];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++)
                    array[i][j] = rus.charAt(random.nextInt(rus.length()));
            }

            return array;
        }
        // write your code here
    }
}
    public static int fifth(int[] numbers, int[] weight) {
        if (numbers.length != weight.length)
            throw new Error("Длинна входных массивов должна быть одинаковой");

        Set<Integer> set = new HashSet<>();
        Random random = new Random();
        while (true) {
            int i = random.nextInt(numbers.length);
            set.add(i);
            for (int item : weight) {
                if (numbers[i] == item)
                    return numbers[i];
            }

            if (set.size() == numbers.length)
                throw new Error("Во входных массивах нет одинаковых элементов");
        }
    }
}
