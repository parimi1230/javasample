package collections;

public class ArraySample {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 20, 30, 40, 50, 60};

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr[5]);


        System.out.println(arr.length);

        System.out.println("---------  Inside Loop -----");
        for(int i=0; i< arr.length; i++){
            System.out.println( arr[i]  );
        }
    }

}
