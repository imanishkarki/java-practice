import java.util.*;
class exam{
    public static void main (String[] args){
        int n = 0; 
        int Sum = 0;
        float Average;
        Scanner s =new Scanner(System.in);
        System.out.println("Enter the numner: ");

        n =s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements: ");
        for (int i=0; i<n; i++){
            a[i] = s.nextInt();
            Sum = Sum +a[i];
        }
        System.out.println("sum: "+Sum);
        Average = (float)Sum/n;
        System.out.println("average: "+Average);
    } 
}