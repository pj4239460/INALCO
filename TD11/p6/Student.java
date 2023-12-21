public class Student extends User {
    // private String name;
    private int age;

    public Student(String name, int age) {
        // this.name = name;
        super(name);
        this.age = age;
    }

    // public String getName() {
    //     return name;
    // }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Student{Name: " + name + ", Age:" + age + "}";
    }

}