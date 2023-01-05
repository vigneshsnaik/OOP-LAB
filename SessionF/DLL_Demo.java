import java.util.Scanner;
import java.util.StringTokenizer;

public class DLL_Demo {
    static void help() {
        System.out.println("Options:(case sensitive)\n");
        System.out.println("append <VALUE>             Appends elements to the end ");
        System.out.println("insert <VALUE> <POSITION>  Inserts elements to the POSITION ");
        System.out.println("remove <VALUE>             Deletes the element of given value");
        System.out.println("removeat <POSITION>       Deletes the element at the POSITION ");
        System.out.println("pop                        Pops the element at the end");
        System.out.println("help                       Displays this message");
        System.out.println("clear                      Clear the Terminal screen");
        System.out.println("exit                       Exits the program");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL list = new DLL();
        String cmd;
        // StringTokenizer st;
        // system("clear"); // clears the terminal for a CLI-like interface
        help();
        while (true) {
            System.out.print(">>>> ");
            cmd = sc.next();
            if (cmd.equals("append")) {
                list.append(sc.nextInt());
            } else if (cmd.equals("insert")) {
                list.insert(sc.nextInt(), sc.nextInt());
            } else if (cmd.equals("pop")) {
                list.pop();
            } else if (cmd.equals("remove")) {
                list.remove(sc.nextInt());
            } else if (cmd.equals("removeat")) {
                list.removeAt(sc.nextInt());
            } else if (cmd.equals("display")) {
                list.print();
            } else if (cmd.equals("exit")) {
                break;
            }

        }
        System.out.println("THANK YOU\n");
        sc.close();
    }
}