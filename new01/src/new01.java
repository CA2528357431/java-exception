// 问题分为 error和exception
// error: 严重问题，程序无需处理
// exception分为runtime和非runtime

// runtime：执行到此报错
// int[] li = {1,3,2}; li[3]


// 非runtime：无法执行--跳红
// int r = "asdsa";
// 必须处理才能执行




public class new01 {
    public static void main(String[] args){
        int[] li = {1,3,2};


        System.out.println("start");

        // 即使出错也能继续
        try {
            System.out.println(li[3]);
            // 此处出现错误，创建IndexOutOfBoundsException对象
            // new IndexOutOfBoundsException("xxx")
            // xxx即是getMessage获得的信息
        }catch (IndexOutOfBoundsException x){

            x.printStackTrace();     // 在程序最后高亮问题

            String bug = x.getMessage();   // 错误具体信息
            System.out.println(bug);

            String shortcut = x.toString();     // 错误信息
            System.out.println(shortcut);
            System.out.println("nope");
        }
        // catch的参数捕捉的exception

        System.out.println("finish");

    }
}
