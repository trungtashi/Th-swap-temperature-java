import java.util.Scanner;

public class swap_celsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double f;
        double c;
        int choice;

        do {
            System.out.println("Option:");
            System.out.println("1. F to C");
            System.out.println("2. C to F");
            System.out.println("0. Exit");

            System.out.println("Enter choice: ");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter F: ");
                    f = scanner.nextDouble();
                    System.out.println("F to C: " + fToC(f));
                    break;
                case 2:
                    System.out.println("Enter C: ");
                    c = scanner.nextDouble();
                    System.out.println("C to F: " + cToF(c));
                    break;
                case 0:
                    System.exit(0);
            }
        }while ( choice < 3);
    }
//    Tạo phương thức chuyển từ độ C qua F
    public static  double cToF(double c){
        double fah = (9.0 / 5) * c + 32;
        return fah;
    }
    //    Tạo phương thức chuyển từ độ F qua C
    public static  double fToC(double f){
        double fah = (5.0 / 9) * (f - 32);
        return fah;
    }
}
