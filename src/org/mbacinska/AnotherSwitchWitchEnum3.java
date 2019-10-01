package org.mbacinska;

public class AnotherSwitchWitchEnum3 {

    private enum HtmStatus {

        NOT_FOUND(404, "Page not found"),
        NOT_AUTHENTICATED(401, "Auth required"),
        ;
        private int status;
        private String message;

        HtmStatus(int status, String message) {
            this.status =status;
            this.message =message;

        }


        public int getStatus() {
            return status;
        }

        public String getMessage(){
            return  message;
        }
    }

    public static void main(String[] args) throws Exception {

       // HtmStatus wrong = new HtmStatus();//nie mozemy bo konstruktor defaultowy jest private

        HtmStatus status = HtmStatus.NOT_AUTHENTICATED;
        System.out.println(status);
        System.out.println(status.getStatus());
        System.out.println(status.getMessage());
    }
}
