import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;



public class Cookie {	
    public String genCookie() {
    	String cookie;
        Random random = new Random();
        int randomNumber1 = random.nextInt(1000);
        int randomNumber2 = random.nextInt(1000);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");

        cookie = randomNumber1 + now.format(formatter) + randomNumber2;

        return cookie;
    }
}
