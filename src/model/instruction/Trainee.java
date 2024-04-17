package model.instruction;

import java.time.LocalDate;

public class Trainee extends Person {
//todo один инструктируемый много инструктажей
    private SafetyInstructor instructor;
    private LocalDate instructedDate;
    private boolean isInstructed = false;

    public Trainee(String name, int age) {
        super(name, age);
    }

    public SafetyInstructor getInstructor() {
        return instructor;
    }

    public void setInstructor(SafetyInstructor instructor) {
        this.instructor = instructor;
    }

    public LocalDate getInstructedDate() {
        return instructedDate;
    }

    public void setInstructedDate(int year, int  month, int date) {
        this.instructedDate = LocalDate.of(year, month, date);
    }

    public boolean isInstructed() {
        return isInstructed;
    }

    public void setInstructed(boolean instructed) {
        isInstructed = instructed;
    }
}
