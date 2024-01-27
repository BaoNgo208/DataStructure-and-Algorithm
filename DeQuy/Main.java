package DeQuy;

public class Main {
    public static int GiaiThua(int n) {
        if(n == 0) return 1;

        return n *GiaiThua(n-1);
    }
    public static int Fibonancci(int n) {
        if(n== 1 || n == 2 )  return  1;

        return Fibonancci(n-1) + Fibonancci(n-2);
    }
    public static void main(String[] args){
        int x = Fibonancci(1);
        System.out.println(x);
    }
}
