package ReverseStringII;

public class ReverseStringClass {


    public void ReverseString(char[] str){
        //ArrayList<Integer> arrayList = new ArrayList<>();
        int x =0;
        for(int i=0;i<str.length;i++){
            if(str[i]==' '){

                            reverse(str,x,i-1);
                            x = i +1;
            }
        }

        reverse(str,x,str.length-1);
        reverse(str,0,str.length-1);
        System.out.println(str);
    }
    public void reverse(char[] s, int i, int j) {
        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}
