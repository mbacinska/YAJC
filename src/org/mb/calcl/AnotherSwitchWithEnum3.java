package org.mb.calcl;

public class AnotherSwitchWithEnum3 {

    private enum HtmlStatus {

        NOT_FOUND(404, "Page not found"),
        NOT_AUTHENTICATED(401, "Auth required");

        private int status;
        private String message;

        HtmlStatus(int status, String message) {
            this.status = status;
            this.message = message;
        }

        HtmlStatus(int status) {
            this.status = status;
            this.message = "unknown";
        }

        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        public int getDoubleStatus() {
            return status * 2;
        }

        public static void main(String[] args) {

            final int NO_AUTH = 401;
            int myStatus = NO_AUTH;

           // HtmlStatus status = new HtmlStatus(200, "OK");// konstruktor enuma jest package-private

            HtmlStatus status = HtmlStatus.NOT_AUTHENTICATED;
            System.out.println(status);
            System.out.println(status.getMessage());
            System.out.println(status.getStatus());
            System.out.println("++++++++++++++++++++");
            HtmlStatus status2 = HtmlStatus.NOT_FOUND;
            System.out.println(status2);
            System.out.println(status2.getMessage());
            System.out.println(status2.getStatus());
        }

    }
}
