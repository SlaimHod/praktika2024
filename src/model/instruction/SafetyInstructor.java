package model.instruction;

public class SafetyInstructor extends Person {

    private final SafetyInstruction instruction;

    public SafetyInstructor(String name, int age, SafetyInstruction instruction) {
        super(name, age);
        this.instruction = instruction;
    }

    public SafetyInstruction getInstruction() {
        return instruction;
    }
}
