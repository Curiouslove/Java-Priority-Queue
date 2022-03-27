package schoolrecord;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApp {


    private final static Scanner collector = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        System.out.println("number of events: ");
        int numberOfEvents = Integer.parseInt(collector.nextLine());
        List<String> events = new ArrayList<>();
        for (int index = numberOfEvents; index > 0; index--) {
            System.out.println("add event: ");
            String event = collector.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            JOptionPane.showMessageDialog(null,"EMPTY");
        } else {
            for (Student student : students) {
                System.out.println(student.getName());
            }

        }
    }
}

