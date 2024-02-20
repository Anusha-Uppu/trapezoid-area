import java.util.*;
/**
 * logic
 */
public class logic {
    public static int addition(){
        int a,b;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        sc.close();
        int additionresult=a+b;
        return additionresult;
    }
    public static void main(String args[]){
        addition();
    }
}