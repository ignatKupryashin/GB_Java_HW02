import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class Task2 {
    //    Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
//

    public static void main(String[] args) throws IOException {
        int[] myArray = {1, 2, 6, 7, 23 , 32, 1, 5};

        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(bubbleSort(myArray)));

    }

    public static int[] bubbleSort(int[] array) throws IOException{

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler myHandler = new FileHandler("log.xml");
        logger.addHandler(myHandler);
        XMLFormatter xml = new XMLFormatter();
        myHandler.setFormatter(xml);


        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length - i - 1; j++){
                if(array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    logger.info(Arrays.toString(array));
                }

        }

    }
        return array;
    }

}

