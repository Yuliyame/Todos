public class Epic extends Task {

    private int id;
    private String taskOne;
    private String taskTwo;
    private String taskThree;

    public Epic(int id, String taskOne, String taskTwo, String taskThree) {
        super(id);
        this.taskOne = taskOne;
        this.taskTwo = taskTwo;
        this.taskThree = taskThree;
    }

    public static void SimpleTask (String[] args) {
        String taskOne = "Open book";
        String taskTwo = "Find chapter";
        String TaskThree = "Read chapter";

    }
    public String getTaskOne() {
        return taskOne;
    }
    public String getTaskTwo() {
        return taskTwo;
    }
    public String getTaskThree() {
        return taskThree;
    }
}


