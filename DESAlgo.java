import java.util.*;
import javax.crypto.*;

public class DesAlgorithm {
    public static void main(String[] args) {
        try {
    	Scanner sc= new Scanner(System.in); 
    	System.out.print("Enter message :  ");  
    	String message= sc.nextLine();
        
        byte[] myMessage =message.getBytes(); 

        //Generating Key
        KeyGenerator Mygenerator = KeyGenerator.getInstance("DES");
        SecretKey myDesKey = Mygenerator.generateKey();

        //initializing crypto algorithm
        Cipher myCipher = Cipher.getInstance("DES");

        //setting encryption mode
        myCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
        byte[] myEncryptedBytes=myCipher.doFinal(myMessage);
        
        //setting decryption mode
        myCipher.init(Cipher.DECRYPT_MODE, myDesKey);
        byte[] myDecryptedBytes=myCipher.doFinal(myEncryptedBytes);

        String encrypteddata=new String(myEncryptedBytes);
        String decrypteddata=new String(myDecryptedBytes);

        System.out.println("\nMessage : "+ message);
        System.out.println("Encrypted - "+ encrypteddata);
        System.out.println("Decrypted Message - "+ decrypteddata);
        }
        catch(Exception s)
        {
        System.out.println("Exception has occurred");
        }
    }
}
