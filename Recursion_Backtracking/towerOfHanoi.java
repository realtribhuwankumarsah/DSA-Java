package Recursion_Backtracking;

public class towerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        HanoiTower(n, "S", "H", "D");
        
    } 
    public static void HanoiTower(int n, String src, String help, String dest) {
        if(n==1) {
            System.out.println("Disk "+n+" is transferred from "+src+" to "+dest);
            return;
        }
        HanoiTower(n-1, src, dest, help);
        System.out.println("Disk "+n+" is transferred from "+src+" to "+dest);
        HanoiTower(n-1, help, src, dest);

        
    }    
}
