public class Prog5 {
    public static void main(String[] args){
        int[] myArray = {1,5,10,25};
        int sum = 0;
        int i;

        for (i=0;i<myArray.length;i++){
            sum+=myArray[i];
        }
        System.out.println(sum);
    }
    
}
