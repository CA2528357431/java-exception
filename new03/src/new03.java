// 自定义exception与throw

public class new03 {
    public static void main(String[] args){
        System.out.println("start");

        System.out.println();

        try{
            done(1,0);
        }catch (zeroException x){
            System.out.println(x.getMessage());
        }

        System.out.println();

        try{
            done(1,3);
        }catch (zeroException x){
            System.out.println(x.getMessage());
        }

        System.out.println();

        System.out.println("end");
    }


    public static void done(int x,int y) throws zeroException {

        if (y==0){
            throw new zeroException("it shouldn't be zero");
        }else {
            int r = x / y;
            System.out.println(r);
        }
        System.out.println("done");
        // 一旦掷出exception则后续不执行
    }


}

class zeroException extends Exception{
    zeroException(){ }
    zeroException(String x){
        super(x);
    }

}



