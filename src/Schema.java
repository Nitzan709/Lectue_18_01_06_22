public class Schema {
    private static final String COL_NAME = "name";
    private static final String COL_EMAIL = "email";
    private static final String COL_PASSWORD = "password";

    public static final String INSERT_INTO_COMPANY = "insert into company("
            + COL_NAME + "," + COL_EMAIL + "," + COL_PASSWORD + ")"
            + " values" + " (?,?,?)";

    private static final String COL_COMPANY_ID = "company_id";
    private static final String COL_CATEGORY = "category";
    private static final String COL_TITLE = "title";
    private static final String COL_START_DATE = "start_date";
    private static final String COL_END_DATE = "end_date";
    private static final String COL_AMOUNT = "amount";
    private static final String COL_DESC = "description";
    private static final String COL_PRICE = "price";
    private static final String COL_IMAGE_URL = "image_url";

    public static final String INSERT_INTO_COUPON = "insert into coupon("
            + COL_COMPANY_ID + ","
            + COL_CATEGORY + ","
            + COL_TITLE + ","
            + COL_START_DATE + ","
            + COL_END_DATE + ","
            + COL_AMOUNT + ","
            + COL_DESC + ","
            + COL_PRICE + ","
            + COL_IMAGE_URL +
            ")" +
            "values"
            + " (?,?,?,?,?,?,?,?,?)";

    private Schema() {
        throw new AssertionError("Enforce non instability");
    }
}
