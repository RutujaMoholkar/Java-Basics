class SwapWithoutThirdVar{  
 public static void main(String arg[]) {  

  System.out.println("Before swapping");  
  int x = 90;  
  int y = 23;  

  System.out.println("value of x:" + x);  
  System.out.println("value of y:" + y);
  
  System.out.println("After swapping");  
  x = x + y;  
  y = x - y;  
  x = x - y;  

  System.out.println("value of x:" + x);  
  System.out.println("value of y:" + y);  
 }  
}   