public class Todos {

    private Task[] tasks = new Task[0];
    private Task[] addToArray(Task[] current, Task task) {
        Task[] tmp = new Task[current.length + 1];
        for (int i = 0; i < current.length; i++) {
            tmp[i] = current[i];
        }
        tmp[tmp.length - 1] = task;
        return tmp;
    }
    public void add(Task SimpleTask) {
        tasks = addToArray(tasks, SimpleTask);
    }
    public void add(Task Epic) {
        tasks = addToArray(tasks, Epic);
    }

    public void add(Task Meeting) {
        tasks = addToArray(tasks, Meeting);
    }
    public Task[] findAll() {
        return tasks;
    }
    public static void todos(String[] args) {
        SimpleTask SimpleTask = new SimpleTask(
                1,
                "Make a home work"
        );
        Epic Epic = new Epic(
                2,
                "open book",
                "find chapter",
                "read a text"
        );
        Meeting Meeting = new Meeting(
                3,
                "How to make home work done",
                "QA",
                "October, 31, 2023"
        );
    }

}

