import java.util.*;
/**
 * logic
 */
public class logic {
    public static int division(int additionresult){
        if(additionresult!=0){
        return additionresult/2;
        }
        else{
            return 0;
        }
    }
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        division(a);
        sc.close();
    }
}