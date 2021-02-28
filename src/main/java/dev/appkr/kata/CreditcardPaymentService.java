package dev.appkr.kata;

public class CreditcardPaymentService implements PaymentService {

  public String pay(long amount) {
    return "신용카드로 " + amount + "원을 결제합니다";
  }
}
