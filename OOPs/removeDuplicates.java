package OOPs;

public class removeDuplicates {

    public static void remover(String str,StringBuilder sb, boolean  map[], int idx) {
       if(idx==str.length()) {
        System.out.println(sb);
        return;
       }
       char currentchar = str.charAt(idx);

       if(map[currentchar-'a'] == true) {
        remover(str, sb, map, idx+1);
       }
       else {
        map[currentchar-'a']=true;
        remover(str, sb.append(currentchar), map, idx+1);
       }
    }
    public static void main(String[] args) {
        String str = "appnnacollege";
        StringBuilder sb = new StringBuilder("");


        boolean map[] = new boolean[26];
        remover(str,sb,map,0);

    }
    
}
