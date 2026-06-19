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

        list1.printLength();
    }
}
