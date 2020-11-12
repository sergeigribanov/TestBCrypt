import java.security.NoSuchAlgorithmException;
import org.mindrot.jbcrypt.BCrypt;
    
public class TestBCrypt {
    public static void main(String[] args) throws NoSuchAlgorithmException {
        String  originalPassword = "password";
        String generatedSecuredPasswordHash = BCrypt.hashpw(originalPassword, BCrypt.gensalt(12));
        System.out.println(generatedSecuredPasswordHash);
         
        boolean matched = BCrypt.checkpw(originalPassword, generatedSecuredPasswordHash);
        System.out.println(matched);
    }
}
