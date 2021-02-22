package AndroidLessons;

import java.lang.reflect.Array;

public class Main {
    public static int sum = 0;

    public static void main(String[] args) throws MyArrayDataException, MyArraySizeException {
        String[][] array = new String[4][4];
        array[0] = new String[]{"1", "1", "1", "1"};
        array[1] = new String[]{"2", "2", "2", "2"};
        array[2] = new String[]{"3", "3", "3e", "3"};
        array[3] = new String[]{"4", "4", "4", "4"};
        if (checkArray(array)){
            sss(array);
        }

        System.out.println(sum);

    }
    public static void sss(String[][] array) throws MyArrayDataException {
        for (int i = 0; i <array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += parseInt(array[i][j]);
                } catch (Exception e){
                    throw new MyArrayDataException("ячейку " + i + "x" + j +" не получилось преобразовать в число");
                }
            }
        }
    }
    public static int parseInt(String number) {
        int newNumber = 0;
        newNumber = Integer.parseInt(number);
        //throw new MyArrayDataException(number +" не получилось преобразовать в число");
        /*try {
            //throw new MyArrayDataException(number +" не получилось преобразовать в число");
            newNumber = Integer.parseInt(number);
        } catch (Exception e){
            System.out.println("Что-то пошло не так");
            //throw new MyArrayDataException(number +" не получилось преобразовать в число");
            //e.printStackTrace();

        }*/
        return newNumber;
    }

    public static boolean checkArray(String[][] array) throws MyArraySizeException {
        int size = array.length;
        int size2 = array[0].length;
        if (size != 4 || size2 != 4){
            throw new MyArraySizeException("Массив неподходящего размера");
        }
        return true;
    }
}

class MyArrayDataException extends Exception{
    public MyArrayDataException(String message){
        super(message);
    }
}

class MyArraySizeException extends Exception{
    public MyArraySizeException(String message){
        super(message);
    }
}
