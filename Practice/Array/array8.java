// Running Sum-1d Array 
class array8{
    public int [] sumArray(int [] array){
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i-1]+array[i];
        }
        return array;
    }

   
}