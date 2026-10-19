
package Day11;

import java.util.function.Consumer;

public class Ex3 {
    public static void main(String[] args) {

        Consumer<String> smsNotifier = mobno -> {
            System.out.println("Sending the OTP to the ph no.: " + mobno);
        };

        smsNotifier.accept("+91 123456789");
    }
}

    

