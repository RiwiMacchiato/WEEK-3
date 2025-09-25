package models;

public class Task {
    private String id;
    private String title;
    private int priority;

    public Task(String id, String title, int priority) {
        this.id = id;
        this.title = title;
        this.priority = priority;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{id='" + id + "', title='" + title + "', priority=" + priority + "}";
    }
}
