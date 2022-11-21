public class Student {
    private String name;
    private int number;
    private String groupName;

    public Student(String name, int number, String groupName) {
        this.name = name;
        this.number = number;
        this.groupName = groupName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", groupName='" + groupName + '\'' +
                '}'+"\n";
    }
}
