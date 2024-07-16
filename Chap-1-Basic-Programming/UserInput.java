import java.util.Scanner;

class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        //for string input use nextLine() method
        String name = sc.nextLine();
        System.out.println("Hello, " + name + "!");
        
        System.out.println("Enter your age: ");
        //for integer input use nextint() method
        int age = sc.nextInt();
        System.out.println("You are " + age + " years old.");

        sc.close();
    }
}