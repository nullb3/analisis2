public class iCookie {
    private String type;

    public iCookie(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "iCookie: " + type;
    }
}
