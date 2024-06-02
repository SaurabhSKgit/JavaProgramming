class FinallyExample7 {
    public static void main(String[] args) {
        System.out.println("EXC STARTS");
        for(; ;){
            System.out.println("hello");
        }
        System.out.println(10/0);
    }    
}
