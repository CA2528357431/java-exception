// throw

// 在可能出问题的部分加上throw,可以使本函数没问题
// 但调用函数的时候应当处理

public class new02 {
    public static void main(String[] args){
        System.out.println("start");

        try{
            say();
        }catch (IndexOutOfBoundsException x){
            System.out.println("nope");
        }

        System.out.println("end");
    }


    static void say() throws IndexOutOfBoundsException{
        int[] x = {1,2,3};
        System.out.println(x[3]);
    }


}
