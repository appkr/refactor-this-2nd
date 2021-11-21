package dev.appkr.kata;

public class PaymentService {

  public String payWithCreditcard(long amount) {
    // 신용카드사와 통신하여 결제 처리하는 복잡한 로직
    return "신용카드로 " + amount + "원을 결제합니다";
  }

  public String payWithPaypal(long amount) {
    // Paypal과 통신하여 결제 처리하는 복잡한 로직
    return "페이팔로 " + amount + "원을 결제합니다";
  }
}
