class Pattern23{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i==j)||(j==1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                if((i+j==6)||(j==1)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
}    
}  

/* 

*      
* *     
*   *    
*     *   
*       *  
*     * 
*   * 
* * 
* 

*/