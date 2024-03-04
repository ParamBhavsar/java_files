package Fundamentals;

public class pattern {
    public static void main(String[] args) {
        int n = 4;
        for(int i =1;i<2*n;i++){
            int col=(n+1)-i;
            if(i>n){
                col=(i-n+1);
            }
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
