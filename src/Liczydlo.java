public class Liczydlo {
    public static void main(String[] args) {
        int [] tableInt=new int[]{2, 3, 7, 3, 3, 5, 2};
        int count = 0;
                for (int i = 0;i < tableInt.length; i++){
                    if (tableInt[i] == 3){
                        count ++;
                    }
                }
        System.out.println(count);
    }
}
