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
    public static int multiplication(int result,int h){
        return result*h;
    }
    public static void main(String args[]){
        int a;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
       int res= division(a);
        System.out.println("enter the h value");
        int h=sc.nextInt();
        int result=multiplication(res, h);
        System.out.println(result);
        sc.close();
    }
}