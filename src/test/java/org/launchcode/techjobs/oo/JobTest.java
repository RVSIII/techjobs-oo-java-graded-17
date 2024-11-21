package org.launchcode.techjobs.oo;

import org.junit.Test;

import static java.lang.System.lineSeparator;
import static org.junit.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here

// Task 4, Test the Empty Constructor:
    @Test
public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(), job2.getId());
    }

    // Task 4, Test the Full Constructor:
    // I hit a wall here with testing both the class and the value.  I was struggling even with the terminology.
    @Test
    public void testJobConstructorSetsAllFields() {
        Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
assertEquals("Product tester", job3.getName());
assertEquals("ACME", job3.getEmployer().getValue());
assertEquals("Desert", job3.getLocation().getValue());
assertEquals("Quality control", job3.getPositionType().getValue());
assertEquals("Persistence", job3.getCoreCompetency().getValue());
assertTrue(job3 instanceof Job);
assertTrue(job3.getEmployer() instanceof Employer);
assertTrue(job3 instanceof Job);
assertTrue(job3 instanceof Job);
assertTrue(job3 instanceof Job);

    }

    // Task 4, Test the Equals Method:
    // Created 2 new Job objects with identical arguments and tested their equality.
    @Test
    public void testJobsForEquality() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job5 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         assertNotEquals(job5, job4);
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job6 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(job6.toString().startsWith(lineSeparator()));
        assertTrue(job6.toString().endsWith(lineSeparator()));
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
      Job job7 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job8 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
}
