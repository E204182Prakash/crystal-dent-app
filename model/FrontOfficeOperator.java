package model;

public class FrontOfficeOperator {
    // Attributes
    private int operatorID;
    private String operatorName;

    // Constructor
    public FrontOfficeOperator(int operatorID, String operatorName) {
        this.operatorID = operatorID;
        this.operatorName = operatorName;
    }

    // Getter methods
    public int getOperatorID() {
        return operatorID;
    }

    public String getOperatorName() {
        return operatorName;
    }

}
