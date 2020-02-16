import java.util.ArrayList;

public class CipherTest {
    public static void main(String[] args) throws BadKeywordException {
        String keyword = "RHINO";
//        try {
//            Mono m = new Mono(keyword);
//            String message = "THIS IS A MESSAGE TO ENCODE";
//            String output = "";
//            for(int i=0;i<message.length();i++) {
//                output += m.encode(message.charAt(i));
//            }
//            System.out.println(output); 
//        }catch(BadKeywordException e) {
//            e.printStackTrace();
//        }
        
        ArrayList<CipherX> cipherTool = new ArrayList<CipherX>();
        CipherX m1 = new Mono(keyword);
        CipherX v1 = new Vignere(keyword);
        
        cipherTool.add(m1);
        cipherTool.add(v1);
        String message = "THIS IS A MESSAGE TO ENCODE";
        String output = "";
        
        for(int i=0; i<2; i++) {
        	for(int j=0;j<message.length();j++) {
        		output += cipherTool.get(i).encode(message.charAt(j));
        	}
        	 System.out.println(output); 
        	 output = "";
        }
        
        ArrayList<CipherS> cipherTool2 = new ArrayList<CipherS>();
        CipherS m2 = new Mono(keyword);
        CipherS v2 = new Vignere(keyword);
        
        cipherTool2.add(m2);
        cipherTool2.add(v2);
        for(int i=0; i<2; i++) {
        	
        		output += cipherTool2.get(i).encode(message);
        	
        	 System.out.println(output); 
        	 output = "";
        }
        
        
        
        
        
        
        
        
        
    }    
}