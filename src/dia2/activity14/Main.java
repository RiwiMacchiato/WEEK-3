package dia2.activity14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Task> tasks = new ArrayList<>();

        // create 6 tasks in spanish with different priorities

        tasks.add(new Task("1", "Tarea 1", 7));
        tasks.add(new Task("2", "Tarea 2", 2));
        tasks.add(new Task("3", "Tarea 3", 1));
        tasks.add(new Task("4", "Tarea 4", 4));
        tasks.add(new Task("5", "Tarea 5", 2));
        tasks.add(new Task("6", "Tarea 6", 3));

        ArrayList<Task> highPriorityTasks = new ArrayList<>();
        for (Task t : tasks) {
            if (t.getPriority() >= 3) {
                highPriorityTasks.add(t);
            }
        }

        highPriorityTasks.sort((t1, t2) -> Integer.compare(t1.getPriority(), t2.getPriority()));

        System.out.println("Tareas con alta prioridad (prioridad >= 3) ordenadas por prioridad:");
        for (Task t : highPriorityTasks) {
            System.out.println("ID: " + t.getId() + ", Título: " + t.getTitle() + ", Prioridad: " + t.getPriority());
        }

    }
}
