package fundamental_knowledge;

/*
打印三角形
 */
public class demo04 {
    public static void main(String[] args){
        /*
        // 普通的直角三角形
        for(int i = 1;i <= 9;i++){
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
         */

        // 居中的三角形 第一行 1个* 需要空9个空位 第二行 3个* 需要空8个空格 以此类推....
        for(int i = 1;i <= 9;i++){
            for(int j = 9; j>=i;j--){
                System.out.print(" "); // 输出空格
            }
            for(int j = 1;j<=2*i-1;j++){
                System.out.print("*"); // 输出 *
            }
            System.out.println(); // 输出完一行 换行
        }
    }
}
