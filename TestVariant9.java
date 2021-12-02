package test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lab0.Variant9;

import java.util.List;

public class TestVariant9 {

    public static double EPS = 0.000001;

    ////////////////////////////////////////////////

    @Test(dataProvider = "integerProvider")
    public void inputTest(int p1, int p3) {
        assertEquals(new Variant9().integerNumbersTask(p1), p3);
    }

    @DataProvider
    public Object[][] integerProvider() {
        return new Object[][]{{150, 1}, {654, 6}, {888, 8}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeIntegerTest() {
        new Variant9().integerNumbersTask(-2);
    }

    ////////////////////////////////////////////////

    @Test(dataProvider = "ifProvider")
    public void ifTest(double p1, double p2, double[] p3) {
        assertEquals(new Variant9().ifTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] ifProvider() {
        return new Object[][]{{1, 2, new double[]{1, 2}},
                              {25, 25, new double[]{25, 25}},
                              {50, 5, new double[]{5, 50}}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "booleanProvider")
    public void booleanTest(int p1, int p2, boolean p3) {
        assertEquals(new Variant9().booleanTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] booleanProvider() {
        return new Object[][]{{1, 1, true}, {0, 17, true}, {42, 44, false}};
    }

    //////////////////////////////////////////////////

    @Test(dataProvider = "switchProvider")
    public void switchTest(int p1, int p2, int[] arr) {
        assertEquals(new Variant9().switchTask(p1, p2), arr);
    }

    @DataProvider
    public Object[][] switchProvider() {
        return new Object[][]  {{1, 1, new int[] {2, 1}},
                                {28, 2, new int[] {1, 3}},
                                {31, 12, new int[] {1, 1}}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void switchNegativeTest() {
        new Variant9().switchTask(-100, 13);
    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "forProvider")
    public void forTest(int p1, int p2, int p3) {
        assertEquals(new Variant9().forTask(p1, p2), p3);
    }

    @DataProvider
    public Object[][] forProvider() {
        return new Object[][]{{1, 5, 55}, {-5, -3, 50}, {69, 70, 69 * 69 + 70 * 70}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeForTest(){
        new Variant9().forTask(100, -100);
    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "whileProvider")
    public void whileTest(int n, int res) {
        assertEquals(new Variant9().whileTask(n), res);
    }

    @DataProvider
    public Object[][] whileProvider() {
        return new Object[][]  {{5, 2},
                                {10, 3},
                                {100, 5}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeWhileTest() {
        new Variant9().whileTask(0);
    }

    ///////////////////////////////////////////////////

    @Test(dataProvider = "minMaxProvider")
    public void minMaxTest(int[] arr, int[] res) {
        assertEquals(new Variant9().minMaxTask(arr), res);
    }

    @DataProvider
    public Object[][] minMaxProvider() {
        return new Object[][]  {{new int[]{1, 2, 1000000, 4, 5, 1000000, 10}, new int[]{2, 5}},
                                {new int[]{-1, -1, -1}, new int[]{0, 2}},
                                {new int[]{0}, new int[]{0, 0}}};
    }

    //////////////////////////////////////////

    @Test(dataProvider = "arrayProvider")
    public void arrayTest(int[] array, List<Integer> value) {
        assertEquals(new Variant9().arrayTask(array), value);
    }

    @DataProvider
    public Object[][] arrayProvider() {
        return new Object[][]  {{new int[]{1, 2, 3, 4, 5, 6, 7, 8}, List.of(8, 6, 4, 2, 4)},
                                {new int[]{1, 1, 1, 1, 1, 1, 1}, List.of(0)},
                                {new int[]{-6, -6, 0, -1, -1, -1, -1, -1}, List.of(0, -6, -6, 3)}};
    }

    //////////////////////////////////////////

    @Test(dataProvider = "matrixProvider")
    public void matrixTest(int[][] input, int[][] output) {
        assertEquals(new Variant9().matrixTask(input), output);
    }

    @DataProvider
    public Object[][] matrixProvider() {
        int[][] input1 = {{1, 2},
                          {3, 4},
                          {5, 6},
                          {7, 8}};

        int[][] input2 = {{0, -10, -9, 1, 2, -8},
                          {6,   6, -6, 6, 6, -6},
                          {-9, 98,  9, 5, 5,  4}};

        int[][] output1 = {{3, 4},
                           {7, 8}};

        int[][] output2 = {{6, 6, -6, 6, 6, -6}};

        return new Object[][]{{input1, output1}, {input2, output2}};
    }

    @Test(expectedExceptions = AssertionError.class)
    public void negativeMatrixTest(){
        new Variant9().matrixTask(new int[][] {{7},
                                               {7, 7},
                                               {7, 7, 7}});
    }
}
