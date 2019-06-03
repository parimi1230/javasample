package exceptiondemo;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    public int add(int a, int b) throws CustomException{
        try{
            int c = a/b;
        }catch (ArithmeticException ex){
            throw new CustomException("Dont enter b value as zero --", ex);
        }

        return a+b;
    }

    public int sub(int a, int b) throws CustomException{
        try{
            List<String> str = new ArrayList<String>();
            str.get(1);
            int c = a/b;
        }catch (IndexOutOfBoundsException ex){
            throw new CustomException("You are retriving value which does not exist", ex);
        }
        return a-b;
    }

}
