package fundamental_knowledge;

public class demo05 {
    /*
    证明 Java是值传递 就是函数里修改参数的值不影响实际参数的值
     */
    public static void main(String[] args){
        int a = 10;
        int[] array = new int[]{1,2,3,4,5};
        System.out.println(array.length);
        fun(a);
        System.out.println(a);
        // 实际参数传进去的时候是10，但在fun()函数中进行修改 a = 20, 返回值为20. 即是在fun()里 a的值
        // 但是实际参数的值没有改变
        // 证明:实际参数的值不会因函数里参数修改而影响。
    }

    public static int fun(int a){
        a = 20;
        System.out.print(a);
        return a;
    }
}
