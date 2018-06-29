package OnePlus;

import java.util.Arrays;

public class onePlusClass {

    public int[] plus(int[] digits){
        int lastDigit = digits[digits.length-1];

        if(lastDigit >=0 && lastDigit <9){
           digits[digits.length-1] +=1;
        }
        else{
            //System.out.println("9");
            for(int i=digits.length-1;i>=0;i--){

                System.out.println("p1 " + i);
                if(digits[i]==9 && i!=0){
                    System.out.println("p2");
                    if(digits[i-1]>=0 && digits[i-1]<9) {
                        System.out.print ( " i = "+i);
                        System.out.println(digits[i-1]);
                        digits[i - 1] = digits[i - 1] + 1;
                        digits[i]=0;
                        break;
                    }

                    digits[i] =0;

                }
                else   if(digits[i] == 9 && i==0) {
                        System.out.println("o" + i);
                        int[] temp = new int[digits.length+1];
                        //System.out.println(temp.length);
                        //System.out.println(digits.length);
                        for(int x=0;x<temp.length;x++){
                            if(x==0){
                                temp[0]=1;
                            }
                            else {
                                digits[i]=0;
                                temp[x] = digits[x-1];

                            }

                        }
                        digits=temp;
                        //System.out.println(Arrays.toString(temp));
                    }




            }
        }


        return digits;
    }
}
