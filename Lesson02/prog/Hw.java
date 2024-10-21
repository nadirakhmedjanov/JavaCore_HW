package Lesson02.prog;

public class Hw {

    /**
     * Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */
    public int countEvens(int[] nums) {
        int countEvenNums = 0;
        for (int num : nums) {
            if (num % 2 == 0) {
                countEvenNums++;
            }
        }
        return countEvenNums;
    }

    /**
     * Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
     */
    public int difMaxMin (int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }

        return max - min;
    }

    /**
     * Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     */
    public boolean findZeros(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0 && nums[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
