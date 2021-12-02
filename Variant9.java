package lab0;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Variant9 {

    public int integerNumbersTask(int k) {
        assert 99 < k && k < 1000: "Number should be 3-digit long";
        return k / 100;
    }

    public boolean booleanTask(int A, int B) {
        return (A % 2 == 1) || (B % 2 == 1);
    }

    public double[] ifTask(double a, double b) {
        if (a <= b){
            return new double[]{a, b};
        }
        else return new double[]{b, a};
    }

    public int[] switchTask(int D, int M) {
        assert D > 0 & D < 32: "D should be between 1 and 31";
        assert M > 0 & M < 13: "M should be between 1 and 12";
        int[] arr = new int[2];

        switch(M){
            case 1:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 2;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 1;
                }
                break;
            case 2:
                if(D >= 28){
                    arr[0] = 1;
                    arr[1] = 3;
                }
                else {
                    arr[0] = D + 1;
                    arr[1] = 2;
                }
                break;
            case 3:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 4;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 3;
                }
                break;
            case 4:
                if(D >= 30){
                    arr[0] = 1;
                    arr[1] = 5;
                }
                else {
                    arr[0] = D + 1;
                    arr[1] = 4;
                }
                break;
            case 5:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 6;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 5;
                }
                break;
            case 6:
                if(D >= 30){
                    arr[0] = 1;
                    arr[1] = 7;
                }
                else {
                    arr[0] = D + 1;
                    arr[1] = 6;
                }
                break;
            case 7:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 8;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 7;
                }
                break;
            case 8:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 9;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 8;
                }
                break;
            case 9:
                if(D >= 30){
                    arr[0] = 1;
                    arr[1] = 10;
                }
                else {
                    arr[0] = D + 1;
                    arr[1] = 9;
                }
                break;
            case 10:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 11;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 10;
                }
                break;
            case 11:
                if(D >= 30){
                    arr[0] = 1;
                    arr[1] = 12;
                }
                else {
                    arr[0] = D + 1;
                    arr[1] = 11;
                }
                break;
            case 12:
                if(D == 31){
                    arr[0] = 1;
                    arr[1] = 1;
                }
                else{
                    arr[0] = D + 1;
                    arr[1] = 12;
                }
                break;
        }
        return arr;
    }

    public double forTask(int a, int b) {
        assert a < b: "a should be less than b";
        int sum = 0;
        for(int i = a; i < b + 1; i++){
            sum += i * i;
        }
        return sum;
    }

    public int whileTask(int n) {
        assert n > 1: "Input should be more than 1";
        int k = 0;
        while (pow(3, k) <= n){
            k++;
        }
        return k;
    }

    public int[] minMaxTask(int[] array){
        int n = array.length;
        int[] indeces = new int[2];

        int max = array[0];
        for(int i = 1;i < n;i++){
            max = Math.max(max, array[i]);
        }
        int k = 0;
        for (int i = 0; i < n; i++) {
            if(max == array[i]){
                indeces[k] = i;
                k++;
                break;
            }
        }
        for(int i = n - 1;i >= 0;i--){
            if(max == array[i]){
                indeces[k] = i;
                break;
            }
        }
        return indeces;
    }

    public List<Integer> arrayTask(int[] array) {
        int n = array.length;

        List<Integer> res = new ArrayList<>();
        int j = 0;
        for(int i = n - 1; i >= 0; i--){
            if(array[i] % 2 == 0){
                res.add(array[i]);
                j++;
            }
        }
        res.add(j);
        return res;
    }

    public int[][] matrixTask(int[][] array){
        int n = array.length;
        int m = array[0].length;
        for(int i = 1; i < n; i++){
            assert array[i].length == m: "The 2D array should be a matrix";
        }

        int[][] res = new int[n / 2][m];
        int j = 0;
        for (int i = 1; i < n; i += 2) {
            res[j] = array[i];
            j++;
        }
        return res;
    }

    public static void main(String... strings) {
        System.out.println("Start of zero lab");
        System.out.println("Done!!!");
    }

}