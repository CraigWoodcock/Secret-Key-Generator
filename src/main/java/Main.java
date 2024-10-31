import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
         final Logger log = Logger.getLogger(Main.class.getName());
         log.info("Starting Secret Key Generator");
         String key = SecretKeyGenerator.generateSecretKey(32);
         log.info("The Secret key will be....... \n" + key);
    }
}
