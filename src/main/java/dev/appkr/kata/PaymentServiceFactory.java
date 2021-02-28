package dev.appkr.kata;

public class PaymentServiceFactory {

  public static PaymentService create(String payMethod) {
    switch (payMethod) {
      case "creditcard":
      case "c":
        return new CreditcardPaymentService();
      case "paypal":
      case "p":
        return new PaypalPaymentService();
      case "wire":
      case "w":
        return new WireTransferPaymentService();
      default:
        throw new IllegalArgumentException("처리할 수 없는 지불 방법입니다");
    }
  }
}
