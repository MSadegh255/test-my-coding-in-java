import java.util.Scanner;
import java.util.Date;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        String[] strArray = {"Hi", "Hello"};
        var list1 = new GenericList<String>(strArray, 2);

        Integer[] array = new Integer[10];
        var list2 = new GenericList<Integer>(array, 0);
        list1.add("null");

        var str = list1.getFromIndex(2).toUpperCase();
        System.out.println(str);

    }
}
