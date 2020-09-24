public class practice7 {
    public static void main(String[] args) {
        
        System.out.println("Hello, World")
        
        int a = max(10,8);
        System.out.println(z+" is bigger");
        
        int a = min(10,8);
        System.out.println(z+" is smaller");
    }
    
    public static int min(int x, int y){
        if (x < y) {
            return x;
        }
        else 
            return y;
    }
    
    public static int max(int x, int y){
        if (x > y) {
            return x;
        }
        else 
            return y;
    }
    
}
    
