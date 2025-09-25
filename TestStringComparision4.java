public class TestStringComparision4 {
        public static void main(String[] args) {
        String s1 = "Sachin";
        String s2 = "Sachin";
        String s3 = new String("Sachin");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(Integer.toHexString(s1.hashCode()));
        System.out.println(Integer.toHexString(s2.hashCode()));
        System.out.println(Integer.toHexString(s3.hashCode()));
    
    }
}
