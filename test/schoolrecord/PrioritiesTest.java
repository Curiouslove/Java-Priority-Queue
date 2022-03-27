package schoolrecord;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class PrioritiesTest {

    @Test
    void getStudents() {
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("ENTER Samiha 3.85 36");
        events.add("SERVED");
        events.add("ENTER Ashley 3.9 42");
        events.add("ENTER Maria 3.6 46");
        events.add("ENTER Anik 3.95 49");
        events.add("ENTER Dan 3.95 50");
        events.add("SERVED");


       List<String> studentNames = new ArrayList<>();
            studentNames.add("Dan") ;
            studentNames.add("Ashley") ;
            studentNames.add("Shafaet") ;
            studentNames.add("Maria") ;

            Priorities priorities = new Priorities();

          List<Student> students = priorities.getStudents(events);

         for(int i = 0; i < students.size(); i++){

             assertEquals(studentNames.get(i),students.get(i).getName());
         }



    }

    @Test
    void testWhenListIsEmpty() {
        List<String> events = new ArrayList<>();

        Priorities priorities = new Priorities();

        assertTrue(priorities.getStudents(events).isEmpty());



    }

    @Test
    void testWhenThereAreNoStudentsLeftToBeServed() {
        List<String> events = new ArrayList<>();
        events.add("ENTER John 3.75 50");
        events.add("ENTER Mark 3.8 24");
        events.add("ENTER Shafaet 3.7 35");
        events.add("SERVED");
        events.add("SERVED");
        events.add("SERVED");

        Priorities priorities = new Priorities();

        assertTrue(priorities.getStudents(events).isEmpty());



    }
}