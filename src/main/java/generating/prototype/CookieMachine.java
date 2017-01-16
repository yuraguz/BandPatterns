package generating.prototype;

/**
 * Created by Yura on 16.01.2017.
 */
public class CookieMachine {

    private Cookie cookie;

    public CookieMachine() {

    }

    public CookieMachine(Cookie cookie) {
        this.cookie = cookie;
    }

    public void setCookie(Cookie cookie) {
        this.cookie = cookie;
    }

    public Cookie makeCookie() throws CloneNotSupportedException {
        return (Cookie) this.cookie.clone();
    }

    public static void main(String[] args) {

        try {
            CookieMachine cm = new CookieMachine();

            cm.setCookie( new CoconoutCookie(120) );
            for (int i = 0; i < 10; i++) {
                System.out.println(cm.makeCookie());
            }

            cm.setCookie( new AnotherCookie(21315, "Bobik") );
            for (int i = 0; i < 10; i++) {
                System.out.println(cm.makeCookie());
            }


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
