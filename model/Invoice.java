package model;

import java.util.Scanner;

enum TreatmentType {
    CLEANINGS,WHITENING,FILLING,NERVEFILLING,ROOTCANALTHERAPY
}

public class Invoice {
    private Integer invoiceNumber;
    private TreatmentType treatmentType;
    private Double treatmentFee;
    private Double totalAmount;

    // Constructors
    public Invoice(Integer invoiceNumber, TreatmentType treatmentType, Double treatmentFee) 
    {
        this.invoiceNumber = invoiceNumber;
        this.treatmentType = treatmentType;
        this.treatmentFee = treatmentFee;
        calculateTotalAmount();
    }

    // Getters and Setters
    public Integer getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(Integer invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public TreatmentType getTreatmentType() {
        return treatmentType;
    }

    public void setTreatmentType(TreatmentType treatmentType) {
        this.treatmentType = treatmentType;
    }

    public Double getTreatmentFee() {
        return treatmentFee;
    }

    public void setTreatmentFee(Double treatmentFee) {
        this.treatmentFee = treatmentFee;
        calculateTotalAmount();
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    private void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // Methods
    public void calculateTotalAmount() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Invoice details:");
        System.out.print("Invoice Number: ");
        Integer invoiceNumber = scanner.nextInt();

        System.out.print("Treatment Type (CLEANINGS,WHITENING,FILLING,NERVEFILLING,ROOTCANALTHERAPY): ");
        TreatmentType treatmentType = TreatmentType.valueOf(scanner.next().toUpperCase());

        System.out.print("Treatment Fee: ");
        Double treatmentFee = scanner.nextDouble();
        
        setTotalAmount(getTreatmentFee());

        scanner.close();
    }

    public void viewInvoice() {
        System.out.println("Invoice Number: " + getInvoiceNumber());
        System.out.println("Treatment Type: " + getTreatmentType());
        System.out.println("Treatment Fee: " + getTreatmentFee());
        System.out.println("Total Amount: " + getTotalAmount());
    }
}
