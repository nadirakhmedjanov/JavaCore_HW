package Lesson02;

import Lesson02.prog.Hw;


public class Main {
    public static void main(String[] args) {       
        Hw hw = new Hw(); 
        int[] nums = {2, 0, 2, 0, 4};
        System.out.println("Количество чётных чисел в заданном масиве: " + hw.countEvens(nums));
        System.out.println();
       
        System.out.println("Разница между максимальным и минимальным значением эллементов массива: " + hw.difMaxMin(nums));
        System.out.println();
       
        System.out.println("Имеются ли два соседних эллемента массива оба равных нулю: " + hw.findZeros(nums));
        System.out.println();
    }
    
}