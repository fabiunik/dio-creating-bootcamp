import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Course;
import dominio.Dev;
import dominio.Tutorial;

public class App {
    public static void main(String[] args) throws Exception {
        
        Course course1 = new Course();
        course1.setTitle("Java");
        course1.setDescription("Java Course for Beginners");
        course1.setCreditHours(8);

        Course course2 = new Course();
        course2.setTitle("Java-OOP");
        course2.setDescription("Intro to Object Oriented Programming");
        course2.setCreditHours(12);

        Tutorial tutorial = new Tutorial();
        tutorial.setTitle("Build a Rest API");
        tutorial.setDescription("Rest API using Java, Spring Boot, PostgreSQL ");
        tutorial.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescription("Complete Java Development Bootcamp");
        bootcamp.getComponents().add(course1);
        bootcamp.getComponents().add(course2);
        bootcamp.getComponents().add(tutorial);

        Dev devMary = new Dev();
        devMary.setName("Mary J.");
        devMary.applyBootcamp(bootcamp);
        devMary.updateBootcamp();
        devMary.updateBootcamp();
        devMary.updateBootcamp();        
        System.out.println("Registered contents Mary: " + devMary.getComponentRegistered());
        System.out.println();
        System.out.println("Completed contents Mary: " + devMary.getComponentCompleted());
        System.out.println();
        System.out.println("XP: " + devMary.addTotalXP());
        System.out.println("---------------------\n");

        Dev devPaul = new Dev();
        devPaul.setName("Paul");
        devPaul.applyBootcamp(bootcamp);
        devPaul.updateBootcamp();
        devPaul.updateBootcamp();
        
        System.out.println("Registered contents Paul: " + devPaul.getComponentRegistered());
        System.out.println();
        System.out.println("Completed contents Paul: " + devPaul.getComponentCompleted());
        System.out.println("XP: " + devPaul.addTotalXP());
        System.out.println("-----------------\n");

        Dev devJohn = new Dev();
        devJohn.setName("John");
        devJohn.applyBootcamp(bootcamp);                
        System.out.println("Registered contents John: " + devMary.getComponentRegistered());
        System.out.println("Completed contents John: " + devMary.getComponentCompleted());
        System.out.println("XP: " + devJohn.addTotalXP());

    }
}
