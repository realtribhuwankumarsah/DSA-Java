public class starsPattern {
    public static void hollow_rectangle (int totalrows, int totalcolumns) {
        //outerloop
        for (int i = 1; i <=totalrows; i++) {
            //innerloop
            for (int j = 1; j <= totalcolumns; j++) {
                if(i==1 || i==totalrows || j==1 || j==totalcolumns) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }






    
    
    
    
    
    
    
    
    
    
    
    
    public static void InvertedAndRotatedHalfPyramid (int n) {
        //loop for lines n
        for (int i = 1; i <= n; i++) {
            //loop for spaces
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            //loop for stars
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Inverted_Half_Pyramid_using_Numbers (int n) {
        int count = 0;
        //outer loop
        for (int i = 1; i <=n; i++) {
            //inner loop 
            for (int j = 1; j <=n-count; j++) {
                //here we can also use j<= n-i+1 instad of the count variable.
                System.out.print(j);
                
            } 
            count ++;
            System.out.println();         
        }

    }



    
    
    
    
    
    
    
    
    
    
    
    
    public static void FLOYDs_Tringle (int n) {
        int count = 1;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(count+" ");
                count++;
                
            }
            System.out.println();
            
        }
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Traingle_0_1 (int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                if((i+j)%2==0) {
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
                
            }
            System.out.println();
            
        }

    }




    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Butterfly_Pattern (int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        for (int i = n; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            for (int j = 1; j <=2*(n-i); j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }

    }





    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Solid_Rhombus (int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static void Hollow_Rhombus(int n) {
        for (int i = 1; i<=n; i++) {
            for (int j = 1; j <=n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j <=n; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }


    }










    
    
    
    public static void Diamond(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j<=(2*i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
        }
        for (int i = n; i >=1; i--) {
             for (int j = 1; j <= n-i; j++) {
                System.out.print(" ");
                
            }
            for (int j = 1; j<=(2*i)-1; j++) {
                System.out.print("*");
                
            }
            System.out.println();
            
            
        }
    }







   public static void hollowDiamond(int n) {

    //upper part
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j<=n-i ; j++) {
            System.out.print(" ");
            
        }
        for (int j = 1; j < 2; j++) {
            System.out.print("*");
            
        }
        System.out.println();

        for (int j = 1; j < (2*i)-1; j++) {
            System.out.print(" ");
            
        }
        
    }
   }

    
    
    
    
    
    
    public static void main(String[] args) {
        // hollow_rectangle(5, 7);
        // InvertedAndRotatedHalfPyramid(5);
        // Inverted_Half_Pyramid_using_Numbers(5);
        // FLOYDs_Tringle(5);
        // Traingle_0_1(5);
        //Butterfly_Pattern(4);
        // Solid_Rhombus(5);
        //Hollow_Rhombus(5);
        hollowDiamond(4);

        
    }
    
}
