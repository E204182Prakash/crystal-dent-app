package model;

import java.util.Scanner;

 enum PaymentMethod {
    CREDIT_CARD, CASH, CHEQUE
}

public class Payment {

    private Integer paymentId;
    private Double paymentAmount;
    private Invoice invoice;
    private PaymentMethod paymentMethod;

    // Constructors
    public Payment(Integer paymentId, Double paymentAmount, Invoice invoice, PaymentMethod paymentMethod) {
        this.paymentId = paymentId;
        this.paymentAmount = paymentAmount;
        this.invoice = invoice;
        this.paymentMethod = paymentMethod;
    }

    // Getters and Setters
    public Integer getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Integer paymentId) {
        this.paymentId = paymentId;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public Invoice getInvoice() {
        return invoice;
    }

    public void setInvoice(Invoice invoice) {
        this.invoice = invoice;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    // Methods
    public void processPayment() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Payment details:");
        System.out.print("Payment Id: ");
        Integer paymentId = scanner.nextInt();

        System.out.print("Payment Amount: ");
        Double paymentAmount = scanner.nextDouble();

        System.out.print("Payment Method (CREDIT_CARD, CASH, CHEQUE): ");
        PaymentMethod paymentMethod = PaymentMethod.valueOf(scanner.next().toUpperCase());

        // Your logic to process payment (e.g., update records, perform transactions, etc.)
        System.out.println("Payment processed successfully!");

        scanner.close();
    }
}
