import java.security.SecureRandom;
import java.util.Base64;
import java.util.logging.Logger;

public class SecretKeyGenerator {

    private static final SecureRandom random = new SecureRandom();
    private static final Logger logger = Logger.getLogger(SecretKeyGenerator.class.getName());

    public static String generateSecretKey(int keyLength) {
        byte[] key = new byte[keyLength];
        random.nextBytes(key);
        logger.info("Encoding string with Base64");
        return Base64.getEncoder().encodeToString(key);
    }

}
