import model.Group;
import model.Student;
import model.Team;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Biplov", 23009, 18);
        Student s2 = new Student("Wizi", 23990, 15);
        Student s3 = new Student("Anshu", 23876, 17);
        Student s4 = new Student("Abhinav", 24590, 18);
        Student s5 = new Student("Ashutosh", 34000, 19);
        Student s6 = new Student("Aashraya", 340001, 17);
        Student s7 = new Student("Subham", 34022, 20);
        Student s8 = new Student("Ankit", 34590, 16);
        Student s9 = new Student("Ashna", 440987, 17);


        ArrayList<Student> row1 = new ArrayList<>();
        row1.add(s1);
        row1.add(s2);
        row1.add(s3);

        ArrayList<Student> row2 = new ArrayList<>();
        row2.add(s4);
        row2.add(s5);
        row2.add(s6);

        ArrayList<Student> row3 = new ArrayList<>();
        row3.add(s7);
        row3.add(s8);
        row3.add(s9);

        Team t1 = new Team("T1", 5, row1);
        Team t2 = new Team("T2", 5, row2);
        Team t3 = new Team("T3", 6, row3);


        ArrayList<Team> section1 = new ArrayList<>();
        section1.add(t1);
        ArrayList<Team> section2 = new ArrayList<>();
        section2.add(t2);
        ArrayList<Team> section3 = new ArrayList<>();
        section3.add(t3);

        Group g1 = new Group("Lobutse", section1);
        Group g2 = new Group("Khumbila", section2);
        Group g3 = new Group("Nilgiri", section3);


    }
}
