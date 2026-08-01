// Reverse String
class array14_344{
    public void reveseString(char[] str){
        
        int left=0;
        int right =str.length-1;
        while(left<right){
            char ch=str[left];
            str[left]=str[right];
            str[right]=ch;

            left++;
            right--;
        }

        

    }
}