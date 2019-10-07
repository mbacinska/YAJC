package org.mb.calcl;

public class AnotherSwitchWithEnum6Abstract {

    private enum HtmlStatus {
        NOT_FOUND(404, "Page not found") {
            int getMajorStatus() {
                return 400;
            }

            int getMajorStatusUpdated(int extra) {
                return 400 + extra;
            }
        };

            private int status;
            private String message;


            private HtmlStatus(int status, String message) {
                this.status = status;
                this.message = message;
            }

            abstract int getMajorStatus();

            abstract int getMajorStatusUpdated(int extra);


            public int getStatus() {
                return status;
            }

            public String getMessage() {
                return message;
            }
        }
    public static void main(String[] args) throws Exception {

        HtmlStatus status = HtmlStatus.NOT_FOUND;

        System.out.println(status);
        System.out.println(status.getStatus());
        System.out.println(status.getMessage());
    }

    }
