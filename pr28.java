import java.util.Scanner;

public class pr28 {
    public static void main(String args[]){
        Scanner  in = new Scanner(System.in);
        int r = in.nextInt();
        float PI = 3.14f;
        circumference(r,PI);

        in.close();
    }

    static void circumference(int r, float pI) {
        float circ=2*r*pI;
        System.out.println("Circumference ="+circ); 
    }
}
