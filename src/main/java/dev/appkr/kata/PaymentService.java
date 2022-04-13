package dev.appkr.kata;

public class PaymentService {

  // 동시성 문제는 고려하지 않는다
  // 현재 코드에서 버그가 발생하는 지점
  private long paypalBalance = 100_000L;

  public String payWithCreditcard(long amount) {
    // 신용카드사와 통신하여 결제 처리하는 복잡한 로직
    return String.format("신용카드로 %d원을 결제합니다", amount);
  }

  public String payWithPaypal(long amount) {
    // Paypal과 통신하여 결제 처리하는 복잡한 로직
    paypalBalance = paypalBalance - amount;
    return String.format("페이팔로 %d원을 결제합니다, 잔액은 %d원입니다", amount, paypalBalance);
  }
}
