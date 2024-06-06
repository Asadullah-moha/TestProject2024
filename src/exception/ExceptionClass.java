package exception;

public class ExceptionClass{
    public static void main(String[] args) {
//        System.out.println("hello world");
//
//        double num1= 3;
//        double num2= 0;
//
//        System.out.println(num1/num2);
//
//        // this is Exception handling: this will continue after the exception
//        int[] nums = {2,6,9};
//        try {
//            System.out.println(nums[3]);
//        }catch (Exception e){
//            System.out.println("There was an exception");
//            e.printStackTrace();
//        }
//        catch (ArrayIndexOutOfBoundsException){
//
//        }
//        System.out.println("finished");
        try {
            addException();
        }catch (Exception e){
            System.out.println("");
        }
    }
    public static void addException()throws Exception{
        int[] nums = {2,5,8};
        System.out.println(nums[3]);
    }
}
