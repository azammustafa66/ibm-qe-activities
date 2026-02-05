
package com.example;

class CustomException extends Exception {
    private String message;

    CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}

public class Activity8 {
    static void exceptionTest(String msg) throws CustomException {
        if (msg == null || msg.isEmpty()) {
            throw new CustomException("Message is null or empty!");
        }
        System.out.println("Message is fine: " + msg);
    }

    public static void main(String[] args) {
        try {
            exceptionTest("");
            // exceptionTest("Hello!");
        } catch (CustomException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
