public class Meeting extends Task {
    private int id;
    private  String topic;
    private String project;
    private String start;

    public Meeting(int id, String topic, String project, String start) {
        super(id);
        this.topic = topic;
        this.project = project;
        this.start = start;
    }
    public static void SimpleTask (String[] args) {
        String topic = "How to make home work done";
        String project = "QA";
        String start = "October, 31, 2023";

    }
    public String getTopic() {
        return topic;
    }
    public String getProject() {
        return project;
    }
    public String getStart() {
        return start;
    }
}

