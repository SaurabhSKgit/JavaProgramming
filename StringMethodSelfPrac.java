import java.util.*;
class StringMethodSelfPrac {
    public static void main(String[] args) {
        String str=new String("HEllO");
        String str2="Aye";
        String str3="Hello my Name is SAurabh korde";
        String trimX="     onlySK     ";
        String name="Saurabh";

        String lower=str.toLowerCase();
        String upper=str.toUpperCase();
        // System.out.println(lower);
        // System.out.println(upper);
/////////////////////////////////////////////////////////
        String concatX=str.concat(str2);
        // System.out.println(concatX);
/////////////////////////////////////////////////////////
        String sub=str.substring(0,4);
        // System.out.println(sub);
/////////////////////////////////////////////////////////
        int index1=str.indexOf("l");
        int index2=str.lastIndexOf("l");
        // System.out.println(index1);
        // System.out.println(index2);
/////////////////////////////////////////////////////////
        int beforeX=str2.codePointBefore(1);
        // System.out.println(beforeX);
/////////////////////////////////////////////////////////
        String []splitX=str3.split(" ");
        // System.out.println(Arrays.toString(splitX));
/////////////////////////////////////////////////////////
        String X=trimX.trim();
        // System.out.println(X);
/////////////////////////////////////////////////////////
        // if(str3.startsWith("ell")){
        //     System.out.println("yes");
        // }else if(str3.endsWith("orde")){
        //     System.out.println("yes end");
        // }   
    }    
}
