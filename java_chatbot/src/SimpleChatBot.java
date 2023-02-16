import java.util.Scanner;

public class SimpleChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! I'm a simple chatbot. What's your name?");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "! How can I assist you today?");

        String input;
        do {
            System.out.print("> ");
            input = scanner.nextLine();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("Hi there!");
            } else if (input.contains("how are you")) {
                System.out.println("I'm doing well, thank you for asking.");
            } else if (input.contains("bye")) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("I'm sorry, I don't understand. Can you please rephrase your question?");
            }

        } while (!input.equals("bye"));

        scanner.close();
    }
}