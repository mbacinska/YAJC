package org.mb.calcl;

public class AnotherSwitchWithEnum4Setter {

    private enum HtmlStatus{
        NOT_FOUND(404, "Page not found"),
        NOT_AUTHENTICATED(401, "Auth required")
        ;

        private int status;
        private String message;

        HtmlStatus(int status, String message) {
            this.status = status;
            this.message = message;
        }

        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        static public int function(){
            return 0;
        }

        public void setMessage(String message) {
            this.message = message;
        }

    }

    public static void main(String[] args) {

        HtmlStatus status = HtmlStatus.NOT_AUTHENTICATED;

        System.out.println(status);
        System.out.println(status.getMessage());
        System.out.println(status.getStatus());
        System.out.println("-----------------------");
        status.setMessage("Ouuuuuuu");
        System.out.println(status);
        System.out.println(status.getMessage());
        System.out.println(status.getStatus());

    }


}
