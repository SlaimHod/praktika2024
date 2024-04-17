package model.instruction;

import java.time.LocalDate;

public class SafetyInstruction {

    private String instructionName;
    private String instructionDescription;
    private String instructionType;
    private LocalDate instructionDate;
//todo сделать формат времени в мс, формат Date
    public SafetyInstruction(String name, String description, String type, int year, int  month, int date) {
        this.instructionName = name;
        this.instructionDescription = description;
        this.instructionType = type;
        this.instructionDate = LocalDate.of(year, month, date);
    }

    public String getInstructionName() {
        return instructionName;
    }

    public void setInstructionName(String instructionName) {
        this.instructionName = instructionName;
    }

    public String getInstructionDescription() {
        return instructionDescription;
    }

    public void setInstructionDescription(String instructionDescription) {
        this.instructionDescription = instructionDescription;
    }

    public String getInstructionType() {
        return instructionType;
    }

    public void setInstructionType(String instructionType) {
        this.instructionType = instructionType;
    }

    public LocalDate getInstructionDate() {
        return instructionDate;
    }

    public void setInstructionDate(int year, int  month, int date) {
        this.instructionDate = LocalDate.of(year, month, date);
    }
}
