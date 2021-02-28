package dev.appkr.kata;

public class PaypalPaymentService implements PaymentService {

  public String pay(long amount) {
    return "페이팔로 " + amount + "원을 결제합니다";
  }
}
