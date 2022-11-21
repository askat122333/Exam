import java.util.Arrays;

public class Group {
    private int idGroup;
    private String nameOfGroup;
    private Student[] students;

    public Group(int idGroup, String nameOfGroup, int groupSize) {
        this.idGroup = idGroup;
        this.nameOfGroup = nameOfGroup;
        this.students = new Student[groupSize];
    }

    public int getIdGroup() {
        return idGroup;
    }

    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    public String getNameOfGroup() {
        return nameOfGroup;
    }

    public void setNameOfGroup(String nameOfGroup) {
        this.nameOfGroup = nameOfGroup;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public boolean addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                students[i] = student;
                System.out.println("Ученик "+ students[i].getName()+ " добавлен");
                // System.out.println(students[i].getName());
                return true;
            }
        }
        System.out.println("Нет мест в группе !");
        return false;
    }
    public void searchStudent(String nameOfGroup) {
        Student[] students = this.students;
        System.out.println("Списрк учеников : ");
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null && students[i].getGroupName().equals(nameOfGroup)) {
                System.out.println(students[i].getName());
            }
        }
    }
//    public void showStudents() {
//        for (Student student : students) {
//            if (student != null) {
//                System.out.println(student);
//            }
//        }
//        System.out.println();
//    }
    public static void printGroups(Group[] groups){
        for (int i = 0; i < groups.length; i++) {
            if (groups[i] != null) {
                System.out.println(groups[i]);
            }
        }
        System.out.println();
        }


    @Override
    public String toString() {
        return "Group{" +
                "idGroup=" + idGroup +
                ", nameOfGroup='" + nameOfGroup + '\'' +
                ", students=" + Arrays.toString(students) +
                '}';
    }
}
