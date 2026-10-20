package models;

public class Task {

    private int id;
    private String title;
    private String description;
    private Priority priority;
    private TaskStatus taskStatus;

    public Task() {

    }

    public Task(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.priority = priority.LOW;
        this.taskStatus = taskStatus.TODO;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            System.out.println("érreur ! le titre ne peut pas être vide");
        } else {
            this.title = title;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPriority(Priority priority) {
        if (priority == null) {
            System.out.println("érreur ! la priorité ne peut pas être null");
        } else {
            this.priority = priority;
        }
    }

    public Priority getPriority() {
        return priority;
    }

    public void setTaskStatus(TaskStatus taskStatus) {
        if (taskStatus == null) {
            System.out.println("érreur ! le statut ne peut pas être null");
        } else {
            this.taskStatus = taskStatus;
        }
    }

    public TaskStatus getTaskStatus() {
        return taskStatus;
    }

    @Override
    public String toString() {
        return " ID  : " + getId() + "\n" +
                " Title  : " + getTitle() + "\n" +
                " Description  : " + getDescription() + "\n" +
                " Priorité  : " + getPriority() + "\n" +
                " Statut  : " + getTaskStatus();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || o.getClass() != this.getClass()) {
            return false;
        }
        Task task = (Task) o;

        return this.getId() == task.getId();
    }

    @Override
    public int hashCode() {
        return this.getId();
    }

}