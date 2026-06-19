import java.util.Scanner;
import java.util.Date;
import java.awt.*;
import java.io.File;
import java.io.FileReader;
import java.text.NumberFormat;
import java.util.Arrays;

public class App {

    public static void main(String[] args) throws Exception {
        var controller = GenericList.compare(new Employee(2000, 12), new Controller(3000, 3));
        System.out.println(controller.getBaseSallary());

    }
}
