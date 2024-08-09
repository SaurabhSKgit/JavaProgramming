public class StringBufferSelfPrac {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("Helloo");
        StringBuffer s=new StringBuffer("ollea");

        String str1=new String("bye");
        String str2="bye";

        // System.out.println(sb.toString().equals(s.toString()));//true
        //System.out.println(str1.equals(str2));//true
        
        // sb.append("bye");
        // System.out.println(sb);//hellobye

        // System.out.println(sb.capacity());
        // System.out.println(sb.length());

        // sb.delete(5,6);
        // System.out.println(sb.toString());//Hello

        // s.replace(4, 5, "H");
        // System.out.println(s.toString());

        // s.reverse();
        // System.out.println(s);

        // sb.insert(sb.length(), "World");
        // System.out.println(sb);//HellooWorld
    }
}
