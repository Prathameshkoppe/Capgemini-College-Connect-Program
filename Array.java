package lab9;

public class Array {
    public static void main(String[] args) {
        int[] marks = {11, 22, 33};
        int[] marks1 = {45, 52, 63};
        int[] add = new int[3];
        
        for (int i = 0; i < add.length; i++) {
            add[i] = marks[i] + marks1[i];
        }
        
        for (int i = 0; i < add.length; i++) {
            System.out.println(add[i]);
        }
    }
}
