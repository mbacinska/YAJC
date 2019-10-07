package org.mbacinska;

public enum TriBool {

    OTHER("unknown"){
        @Override
        public TriBool and(TriBool another) {
            switch(another){
                case TRUE:
                    return OTHER;
                case FALSE:
                    return FALSE;
                case OTHER:
                    return OTHER;
                    default:
                        throw new IllegalArgumentException();
            }
        }
    },
    FALSE("no") {
        @Override
        public TriBool and(TriBool another) {
            switch (another){
                case TRUE:
                    return FALSE;
                case FALSE:
                    return FALSE;
                case OTHER:
                    return FALSE;
                default:
                    throw new IllegalArgumentException();
            }
        }
    },

    TRUE("yes"){
        @Override
        public TriBool and(TriBool another) {
            switch (another){
                case TRUE:
                    return TRUE;
                case FALSE:
                    return FALSE;
                case OTHER:
                    return OTHER;
                default:
                    throw new IllegalArgumentException();
            }
        }
    };

    private String message;

    TriBool(String message) {

        this.message = message;
    }

    @Override
    public String toString() {
        return message;
    }

    abstract public TriBool and(TriBool another);

}
