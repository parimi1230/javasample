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


        System.out.println("----------- Print Remove Result ------------");
        printArray(removeElement(arr));

        System.out.println("----------- Print Add Result ------------");
        printArray(addElement(arr));

        //TODO Add element at particular posistion: -- Tomorrow assignment.
        //expected result 10, 20, 30, 40, 50, 60
        int[] resultArr = addElementInPosition(arr, 5, 100);
        //Add element in a position
        printArray(resultArr);
    }

    private static int[] addElementInPosition(int[] arr, int position, int posValue) {
        int[] resultArr = new int[12];
        int counter = 0;
        for(int i=0; i<=arr.length; i++){
            if(i == position){
                resultArr[counter++] = posValue;
            }else{
                int val;
                if(i == arr.length){
                    val = arr[i-1];
                }else{
                    val = arr[i];
                }
                resultArr[counter++] = val;
            }
        }
        return resultArr;
    }

    private static void printArray(int[] arr) {
        for(int i=0; i< arr.length; i++){
            System.out.println( arr[i]  );
        }
    }

    private static int[] removeElement(int arr[]){
        int[] result = new int[10];
        //Remove Element
        int counter = 0;
        for(int i=0; i< arr.length; i++){
            if(arr[i] != 30){
                result[counter++] = arr[i];
            }
        }
        return result;
    }

    private static int[] addElement(int[] arr){
        int[] addResult = new int[12];
        int counter1 = 0;
        int dataToBeAdded = 80;
        for(int i=0; i< arr.length; i++){
            addResult[counter1++] = arr[i];
        }
        addResult[counter1++] = dataToBeAdded;
        return addResult;
    }
}
