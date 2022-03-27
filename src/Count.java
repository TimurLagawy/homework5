public class Count {
    private final int max=9;
    private final int min=0;
    private int value=15;



    Count (){    }
    public Count(int value) throws  Exception{
        if (value> max || value< min) {
            throw new Exception("неверно");
        }
        this.value=value;
        }
        public void IncrementPlus(){
        if (value==max){
            value=0;}else {
            value++;
        }
    }
    public void IncrementMinus(){
        if (value==min){
            value=9;}else {
            value--;
        }
    }
    public int countCurrentType(){
        return value;
    }
    public static void main(String[] args){
        Count count=new Count();
        for (int i = 0; i < 10; i++) {
                        count.IncrementPlus();
            System.out.println(count.countCurrentType());
        }
    }
}