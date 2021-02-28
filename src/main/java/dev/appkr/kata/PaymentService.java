package dev.appkr.kata;

public class PaymentService {

  public String payWithCreditcard(long amount) {
    return "신용카드로 " + amount + "원을 결제합니다";
  }

  public String payWithPaypal(long amount) {
    return "페이팔로 " + amount + "원을 결제합니다";
  }
}
