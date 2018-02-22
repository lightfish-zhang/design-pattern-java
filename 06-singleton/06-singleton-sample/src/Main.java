public class Main{
    public static void main(String args[]){
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.printf("s1==s2 ? %s\n", s1==s2?"yes":"no");
    }
}