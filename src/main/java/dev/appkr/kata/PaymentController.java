package dev.appkr.kata;

public class PaymentController {

  public String pay(String payMethod, long amount) {
    PaymentService service = new PaymentService();

    switch (payMethod) {
      case "creditcard":
      case "c":
        return service.payWithCreditcard(amount);
      case "paypal":
      case "p":
        return service.payWithPaypal(amount);
      default:
        throw new IllegalArgumentException("처리할 수 없는 지불 방법입니다");
    }
  }
}
