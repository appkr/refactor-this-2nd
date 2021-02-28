package dev.appkr.kata;

public class WireTransferPaymentService implements PaymentService{

  public String pay(long amount) {
    return "계좌이체로 " + amount + "원을 결제합니다";
  }
}
