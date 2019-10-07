package org.mbacinska;

public enum HttpStatus {

    OK(200, "OK"),
    CREATED(201, "Created"),
    UNAUTHORIZED(401, "Unauthorized"),
    FORBIDDEN (403,"Forbidden"),
    NOT_FOUND(404,"Not found"),
    INTERNAL_SERVER_ERROR(500, "Internal server error"),
    ;


    private static final String HTTP_STATUS = "Http status: ";
    private final int status;
    private final String message;


    HttpStatus(int status, String message) {
        this.status = status;
        this.message = message;
    }


    public static String searchHttpStatus(int status) {

        HttpStatus[] httpStatuses = HttpStatus.values();

        for (HttpStatus element : httpStatuses) {
            if (element.getStatus() == status) {
                return element.getMessage();
            }
        }
        return HTTP_STATUS + status;
    }

    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }
}
