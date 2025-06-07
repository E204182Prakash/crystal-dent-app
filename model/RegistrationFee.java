package model;

import java.util.Scanner;

public class RegistrationFee {
    private double registrationFeeAmount;

    // Constructor
    public RegistrationFee() {
        this.registrationFeeAmount = 0.0;
    }

    // Getter method
    public double getRegistrationFeeAmount() {
        return registrationFeeAmount;
    }

    // Setter method
    public void setRegistrationFeeAmount(double registrationFeeAmount) {
        this.registrationFeeAmount = registrationFeeAmount;
    }

    // Method to accept registration fee
    public void acceptRegistrationFee() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the registration fee amount: $");
        double amount = scanner.nextDouble();

        // Validate that the amount is non-negative
        if (amount == 1000) {
            setRegistrationFeeAmount(amount);
            System.out.println("Registration fee accepted successfully!");
            
        } else  {
            System.out.println("Invalid amount. Registration fee cannot be negative."); 
        }

        scanner.close();
    }
}    
