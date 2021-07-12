package fundamental_knowledge;

/*
输出 9 * 9 乘法表
 */
public class demo03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {// 控制行
            for (int j = 1; j <= i; j++) { // 控制列
                System.out.print(j + "*" + i + "=" + j * i + "\t");
            }
        }
        System.out.println(); // 输入一行后就换行
    }
}