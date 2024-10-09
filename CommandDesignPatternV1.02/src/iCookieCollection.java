public class iCookieCollection {
    private iCookie[] icookies;
    private int index = 0;

    public iCookieCollection(int size) {
        icookies = new iCookie[size];
    }

    public void addiCookie(iCookie icookie) {
        if (index < icookies.length) {
            icookies[index] = icookie;
            index++;
        }
    }

    public Iterator createIterator() {
        return new iCookieIterator(icookies);
    }
}
