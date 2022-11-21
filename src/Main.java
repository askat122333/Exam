import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Group [] groups = new Group[10];
        Group group1 = new Group(1,"Gun",1);
        Group group2 =new Group(2,"Pistol",15);
        groups[0]= group1;
        groups[1]=group2;


        Student student1 = new Student("John",1,group1.getNameOfGroup());
        Student student2 = new Student("Jog",2,group1.getNameOfGroup());
        group1.addStudent(student1);
        group1.addStudent(student2);

        System.out.println("______________________________________________________");

        Student student3 = new Student("Ben",1,group2.getNameOfGroup());
        Student student4 = new Student("Den",2,group2.getNameOfGroup());
        group2.addStudent(student3);
        group2.addStudent(student4);

        System.out.println("______________________________________________________");


        group1.searchStudent("Gun");

        System.out.println("______________________________________________________");

        group2.searchStudent("Pistol");

        System.out.println("______________________________________________________");

        Group.printGroups(groups);
    }
}