package org.example;
import java.util.ArrayList;
import java.util.Arrays;

public class Trainee {
    public static void main(String[] args) {
        long massive[] = {10,5,-3,6,8,9,2,5};
        System.out.println(Arrays.toString(solution(massive)));
        solutionSort(new int[]{32,4,6,7},new int[]{32,4,6,7},new int[]{32,5,6,2,7,4,6});
    }

    public static long[] solution(long array[]){
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++){
            if (array[i] >= 0 && array[i]%2 == 0){
                list.add(String.valueOf(array[i]));
            }
        }
        long result[] = new long[list.size()];
        for (int j = 0; j < list.size(); j++){
            result[j] = Long.parseLong(list.get(j));
        }
        return result;
    }

    public static int[] solutionSort(int a[], int b[], int c[]){
        ArrayList<Integer> list = new ArrayList<>();
        int res[] = new int[a.length + b.length + c.length];
        System.arraycopy(a,0,res,0,a.length);
        System.arraycopy(b,0,res,a.length,b.length);
        System.arraycopy(c,0,res,b.length,c.length);
        // не успеваю тут можно метод сортировки пузырьком применить
    }
}