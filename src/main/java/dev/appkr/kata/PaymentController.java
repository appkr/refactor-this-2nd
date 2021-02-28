package dev.appkr.kata;

public class PaymentController {

  PaymentService paymentService;

  public PaymentController(PaymentService paymentService) {
    this.paymentService = paymentService;
  }

  public String pay(long amount) {
    return paymentService.pay(amount);
  }
}
