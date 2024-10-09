public class iCookieIterator implements Iterator {
    private iCookie[] icookies;
    private int position = 0;

    public iCookieIterator(iCookie[] icookies) {
        this.icookies = icookies;
    }

    @Override
    public boolean hasNext() {
        return position < icookies.length && icookies[position] != null;
    }

    @Override
    public Object next() {
        iCookie icookie = icookies[position];
        position++;
        return icookie;
    }
}