import java.util.Scanner;

public class App {
    public static void main(String[] agrs) {
        Subscriber1 sub1 = new Subscriber1();
        Subscriber2 sub2 = new Subscriber2();
        HeadQuater pub = new HeadQuater();
        pub.add(sub1);
        pub.add(sub2);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter Score ");
            String next = scanner.nextLine();
            if (next.equals("")) {
                break;
            }
            pub.setResult(next);
        }
    }
}