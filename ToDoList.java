import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String task;
        
        System.out.println("ToDo List Application");
        while (true) {
            System.out.println("1. Add Task");
            System.out.println("2. Delete Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. View Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter task to add: ");
                    scanner.nextLine(); // Consume newline
                    task = scanner.nextLine();
                    tasks.add(task);
                    break;
                case 2:
                    System.out.print("Enter index of task to delete: ");
                    int index = scanner.nextInt();
                    if (index >= 0 && index < tasks.size()) {
                        tasks.remove(index);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 3:
                    System.out.print("Enter index of task to mark as completed: ");
                    int completedIndex = scanner.nextInt();
                    if (completedIndex >= 0 && completedIndex < tasks.size()) {
                        System.out.println("Task \"" + tasks.get(completedIndex) + "\" marked as completed.");
                        tasks.remove(completedIndex);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;
                case 4:
                    System.out.println("Tasks:");
                    for (int i = 0; i < tasks.size(); i++) {
                        System.out.println((i + 1) + ". " + tasks.get(i));
                    }
                    break;
                case 5:
                    System.out.println("Exiting ToDo List Application.");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
