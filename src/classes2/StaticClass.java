package classes2;

public class StaticClass {
    private static int num1;
//    private static int num2;

//    public void setNum(int num){
//        this.num1 = num1;
//    }
//
//    public static void setNum2(int num2){
//        num1 = num2;
//    }
//    public static void test(){
//        num2 = 5;
//    }
//
    public void addValue(int numParam){
        num1 = numParam;
    }

//    most important:
    public int getNum(){
        return num1;
    }
}
