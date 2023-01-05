import java.util.Scanner;

public class DLL_Demo {
    static void help() {
        System.out.println("Options:(case sensitive)\n");
        System.out.println("append <VALUE>             Appends elements to the end ");
        System.out.println("insert <VALUE> <POSITION>  Inserts elements to the POSITION ");
        System.out.println("remove <VALUE>             Deletes the element of given value");
        System.out.println("removeat <POSITION>        Deletes the element at the POSITION ");
        System.out.println("pop                        Pops the element at the end");
        System.out.println("help                       Displays this message");
        System.out.println("clear                      Clear the Terminal screen");
        System.out.println("exit                       Exits the program");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DLL list = new DLL();
        String cmd;
        help();
        while (true) {
            System.out.print("\r >>>> ");
            cmd = sc.next();
            if (cmd.equalsIgnoreCase("append"))
                list.append(sc.nextInt());
            else if (cmd.equalsIgnoreCase("insert"))
                list.insert(sc.nextInt(), sc.nextInt());
            else if (cmd.equalsIgnoreCase("pop"))
                list.pop();
            else if (cmd.equalsIgnoreCase("remove"))
                list.remove(sc.nextInt());
            else if (cmd.equalsIgnoreCase("removeat"))
                list.removeAt(sc.nextInt());
            else if (cmd.equalsIgnoreCase("display"))
                list.print();
            else if (cmd.equalsIgnoreCase("exit"))
                break;
            else
                System.out.println("INVALID CHOICE");
        }
        System.out.println("THANK YOU\n");
        sc.close();
    }
}