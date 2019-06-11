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

        //print elements in an array
        System.out.println("---------  Inside Loop -----");
        printArray(arr);



        //TODO Extract the below logic to a function
        //Remove 30 element from an array
        int[] result = new int[10];
        //Remove Element
        int counter = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != 30){
                result[counter++] = arr[i];
            }
        }

        System.out.println("----------- Print Remove Result ------------");
        printArray(result);

        //TODO Extract below logic to a function
        //-----------------------------------------------------------
        //add element in an array
        int[] addResult = new int[12];
        int counter1 = 0;
        int dataToBeAdded = 80;
        for(int i=0; i< arr.length; i++){
                addResult[counter1++] = arr[i];
        }
        addResult[counter1++] = dataToBeAdded;


        //-----------------------------------------------------------

        System.out.println("----------- Print Add Result ------------");
        printArray(addResult);


        //TODO Add element at particular posistion: -- Tomorrow assignment.
    }

    private static void printArray(int[] arr) {
        for(int i=0; i< arr.length; i++){
            System.out.println( arr[i]  );
        }
    }

}
