public class Teacher extends User {
    // private String name;
    private String subject;

    public Teacher(String name, String subject) {
        // this.name = name;
        super(name);
        this.subject = subject;
    }

    // public String getName() {
    //     return name;
    // }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Teacher{Name: " + name + ", Subject: " + subject + "}";
    }
}