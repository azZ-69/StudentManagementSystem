package model;

import java.util.ArrayList;

public class Team {
    public Team(String name, int seat, ArrayList<Student> student) {
        this.name = name;
        this.seat = seat;
        this.student = student;
    }

    String name;
    int seat;
 ArrayList<Student> student;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public ArrayList<Student> getStudent() {
        return student;
    }

    public void setStudent(ArrayList<Student> student) {
        this.student = student;
    }
}
