package org.mbacinska;

public class EnumWithAbstract {

    private enum HtmStatus {

        NOT_FOUND(404, "Page not found") {
            int getMajorStatus() {
                return 400;
            }
        },
        SERVER_ERROR(500, "Server error") {
            int getMajorStatus() {
                return 500;
            }
        };
        private int status;
        private String message;

        HtmStatus(int status, String message) {
            this.status = status;
            this.message = message;

        }

        public int getStatus() {
            return status;
        }

        public String getMessage() {
            return message;
        }

        abstract int getMajorStatus();
    }
}
