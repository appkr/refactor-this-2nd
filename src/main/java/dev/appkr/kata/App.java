package dev.appkr.kata;

import static java.util.Arrays.asList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {

  static String[] allowedPayMethod = {"creditcard", "c", "paypal", "p"};

  public static void main(String[] args) throws IOException {
    final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    while (true) {
      message(">>> 지불방법을 입력하세요[creditcard(c)|paypal(p)] (종료하려면 exit 를 입력하고 Enter):");

      final String payMethod = reader.readLine();

      if (payMethod.startsWith("exit")) {
        break;
      }

      if (payMethod.length() < 1 || !asList(allowedPayMethod).contains(payMethod)) {
        error("잘못 입력했습니다: " + payMethod);
        continue;
      }

      PaymentController controller = new PaymentController();
      try {
        String result = controller.pay(payMethod, 10_000L);
        message(result);
      } catch (RuntimeException e) {
        error("결제 처리 오류: " + e.getMessage());
      }
    }
  }

  static void message(String message) {
    System.out.println(message);
  }

  static void error(String message) {
    System.out.println("\u001B[31m" + message + "\u001B[0m");
  }
}
