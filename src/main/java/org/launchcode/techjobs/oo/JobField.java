package org.launchcode.techjobs.oo;

import java.util.Objects;

public abstract class JobField {
// COMMON FIELDS:
    private int id;
    private static int nextId = 1;
    private String value;

// COMMON CONSTRUCTORS:
    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String aValue) {
        this();
        this.value = aValue;
    }

// COMMON GETTERS AND SETTERS:
    public int getId() {
    return id;
}

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

// COMMON METHODS:
    @Override
    /* abstract? */ public String toString() {
        return value;
    }

    // This method is MOSTLY common, except for the name of each variable(?) that matches the class name (e.g., Employer employer = (Employer).  My guess is that this method is therefore NOT interitable.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    // change something here:
        if (!(o instanceof Location)) return false;
        Location location = (Location) o;
        return getId() == location.getId();
    }

    // This one is common, except for some reason I have it written 3 different ways between the four classes
    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
