import java.util.Scanner;
public class My_Mind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you ok?");
        String ok = scanner.nextLine();
        System.out.println("your answer (" + ok + ") doesn't matter here, but welcome to the chaos!");
    }
}

class MyMind {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you ok? ");
        System.out.println("your answer (" + scanner.nextLine() + ") doesn't matter here, but welcome to the chaos!");
    }
}
