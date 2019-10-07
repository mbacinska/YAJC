package org.mb.calcl;

public class AnotherSwitchWithEnum5Implements {

    private interface HasMessage{
        String getMessage();
    }
    private enum HtmStatus implements HasMessage{
        NOT_FOUND(404, "Page not found"),
        NOT_AUTHENTICATED(401, "Auth required"),
        ;

        private int status;
        private String message;

        HtmStatus(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        @Override
        public String getMessage() {
            return message;
        }
    }

    public static void main(String[] args) {

        HtmStatus status = HtmStatus.NOT_AUTHENTICATED;
        System.out.println(status);
        System.out.println(status.getMessage());
        System.out.println(status.getStatus());
    }
}
