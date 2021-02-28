package dev.appkr.kata;

public class PaymentController {

  public String pay(String payMethod, long amount) {
    return PaymentServiceFactory.create(payMethod).pay(amount);
  }
}
