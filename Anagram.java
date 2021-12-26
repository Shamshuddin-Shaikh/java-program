
public class Anagram {
    public static void main(String[] args) {

//--------------------------------first method----------------------------------------------------
        /* String a = "aab";
        String b = "abc";
        boolean isAnagram = false;
        boolean visited[] = new boolean[b.length()];

        if(a.length() == b.length()){
            for(int i=0;i<a.length();i++){
                char c = a.charAt(i);
                isAnagram = false;
                for(int j=0;j<b.length();j++){
                    if(b.charAt(j)== c && !visited[j]){
                        visited[j]= true;
                        isAnagram = true;
                        break;
                    }
                }
                if(! isAnagram) break;
            }
        }
        if(isAnagram){
            System.out.println("it is an anagram");
        }else{
            System.out.println("it is not an anagram");
        } */


   //--------------------------------second  method----------------------------------------------------
        /* String a = "aassaxb";
        String b = "absasxa";
        int al[] = new int[256];
        int bl[] = new int[256];
        boolean isAnagram = true;

        for(char c:a.toCharArray()){
            int index = (int) c;
           al[index]++;
        }

        for(char c:b.toCharArray()){
            int index = (int) c;
           bl[index]++;
        }
        for(int i=0;i<256;i++){
            if (al[i] != bl[i]){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("it is an anagram");
        }else{
            System.out.println("it is not an anagram");
        }  */

 
   //--------------------------------third  method----------------------------------------------------
        String x = "aassaxb";
        String y = "absasxa";
        int xl[] = new int[256];
        boolean isAnagram = true;

        for(char c:x.toCharArray()){
            int index = (int) c;
           xl[index]++;
        }

        for(char c:y.toCharArray()){
            int index = (int) c;
           xl[index]--;
        }
        for(int i=0;i<256;i++){
            if (xl[i] !=0){
                isAnagram = false;
                break;
            }
        }
        if(isAnagram){
            System.out.println("it is an anagram");
        }else{
            System.out.println("it is not an anagram");
        } 


    }
}