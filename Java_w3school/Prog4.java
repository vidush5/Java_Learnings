public class Prog4 {
    public static void main(String args[]){
        String Org = "Hello World!";
        String Rev = "";

        for(int i = Org.length()-1;i>=0;i--){
            Rev+=Org.charAt(i);

        
        }
        System.out.println(Rev);

        
    }
    
}
