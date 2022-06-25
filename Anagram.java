public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String s1="SILENT";
        String s2="LISENT";
        char a[]=s1.toCharArray();
        char b[]=s2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        boolean result=Arrays.equals(a,b);
        if(result==true) {
            System.out.println("String is Anagram");
        }
        else {
            System.out.println("String is not Anagram");
        }
    }

}
