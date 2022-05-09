public enum HTTP_Error {
    BadRequest("Bad request"), Unauthorized("Unauthorized"), PaymentRequired("Payment Required"), Forbidden("Forbidden"), NotFound("Not Found");

    public String getDescription() {
        return description;
    }

    private final String description;

    HTTP_Error(String descr) {
        this.description = descr;
    }
}

