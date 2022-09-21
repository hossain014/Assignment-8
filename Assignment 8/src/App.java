import java.util.Scanner;

public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner myInput = new Scanner(System.in);

        System.out.print("what is the quantity");
        int quantity = myInput.nextInt();

        if (quantity > 100){

            System.out.println("10 %");
        }

        if (quantity > 200){

            System.out.println("20%");
        }

        if (quantity > 500){

            System.out.println("30%");
        }
    }
}
