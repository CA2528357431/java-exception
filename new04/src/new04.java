// 多种exception的throw

public class new04 {
    public static void main(String[] args){
        System.out.println("start");

        try{
            done(1,0);
        }catch (zeroException x){
            System.out.println("1: "+x.getMessage());
        }catch (zeroException1 x){
            System.out.println("2: "+x.getMessage());
        }


        System.out.println("end");
    }


    public static void done(int x,int y) throws zeroException, zeroException1 {

        if (y==0){
            throw new zeroException("last shouldn't be zero");
        }else if(x<0){
            throw new zeroException1("first shouldn't be negative");
        }else {
            int r = x / y;
            System.out.println(r);
        }
    }


}

class zeroException extends Exception{
    zeroException(){ }
    zeroException(String x){
        super(x);
    }

}

class zeroException1 extends Exception{
    zeroException1(){ }
    zeroException1(String x){
        super(x);
    }

}
