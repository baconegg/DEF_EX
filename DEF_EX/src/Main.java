import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;


public class Main {

	
	public static void main(String[] args) {
	
		MessageDigest message;
		try {
			message = MessageDigest.getInstance("SHA-512");
			System.out.println(message.getAlgorithm());
			
			message.update("datagagag".getBytes());
//			message.update("gagag".getBytes());
			
			byte[] tmp = message.digest();
			
			
//			51FF98D42F81E45A987361969868D2D344581A13C9413709B196577E4A81424
			
			int num = tmp.length;
			System.out.println(num);
			
			System.out.printf("%x\n" ,tmp[0]); 
			
			System.out.printf("%s%n", Arrays.toString(tmp));
			
			StringBuffer sb = new StringBuffer();			
			for(int i = 0; i < tmp.length; i++){
//				System.out.printf("%X" ,tmp[i]); 
				sb.append(String.format("%X", tmp[i]));
			}
			
			System.out.println(sb.toString());
			
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
	}
		
}
