public class Testimmutablestring {
    public static void main(String args[]){
        String s = "Sachin";
        String s1 = new String("Sachin");
        s= s.concat("Tendulkar");
        s1 = s1.concat(" Tendulkar");
        System.out.println(s1);
        System.out.println(s);
    }
}
