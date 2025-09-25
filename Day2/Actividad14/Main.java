import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import models.Task;

public class Main {

    public static void main(String[] args) throws Exception {
        ArrayList<Task> tasks = new ArrayList<>();

        // Add 6 tasks with different priorities
        tasks.add(new Task("T001", "Review code", 2));
        tasks.add(new Task("T002", "Fix critical bug", 5));
        tasks.add(new Task("T003", "Write documentation", 1));
        tasks.add(new Task("T004", "Update dependencies", 3));
        tasks.add(new Task("T005", "Implement new feature", 4));
        tasks.add(new Task("T006", "Optimize performance", 3));

        System.out.println("All tasks:");
        for (Task task : tasks) {
            System.out.println("- " + task);
        }

        // Filter tasks with priority >= 3
        ArrayList<Task> highPriorityTasks = new ArrayList<>();
        for (Task task : tasks) {
            if (task.getPriority() >= 3) {
                highPriorityTasks.add(task);
            }
        }

        // Sort by ascending priority
        Collections.sort(highPriorityTasks, new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return Integer.compare(t1.getPriority(), t2.getPriority());
            }
        });

        System.out.println("\nHigh priority tasks (priority >= 3), sorted by priority:");
        for (Task task : highPriorityTasks) {
            System.out.println("- " + task);
        }
    }
}
