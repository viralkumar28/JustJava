import java.util.Arrays;
import java.util.Scanner;

public class HeightSort {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        String[] names= new String[n];
        int[] height = new int[n];
        for(int i=0;i<n;i++)
        {
            names[i] = sc.next();
        }
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }
        sortHeight(names,height);
        System.out.println(Arrays.toString(names));
        sc.close();
    }
    public static String[] sortHeight(String[] name, int[] height){
            for(int i=0;i<height.length;i++){
                for(int j=i+1;j<height.length;j++){
                    if(height[i] > height[j]){
                        int temp = height[i];
                        height[i] = height[j];
                        height[j] = temp;
                    }
                    if(name[i].compareTo(name[j])>0){
                        String temp = name[i];
                        name[i] = name[j];
                        name[j] = temp;
                    }
                }
            }
            return name;
    }
}
