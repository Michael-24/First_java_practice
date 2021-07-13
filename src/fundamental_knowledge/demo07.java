package fundamental_knowledge;

/*
 存储稀疏数组
 还原稀疏数组
 */
public class demo07 {
    public static void main(String[] args){
        int[][] array1 = new int[11][11]; //创建稀疏数组 并赋初值
        array1[1][2] = 1;
        array1[2][3] = 1;
        array1[3][2] = 1;
        System.out.println("输出原始的数组");
        for(int[] ints: array1){
            for(int x: ints){
                System.out.print(x+"\t");
            }
            System.out.println();
        }

        int sum = 0;
        for(int i = 0; i<11;i++){
            for(int j = 0; j<11;j++){
                if(array1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("有效值的个数"+sum);

        // 创建稀疏数组
        int[][] array2 = new int[sum+1][3];
        array2[0][0] = 11;
        array2[0][1] = 11;
        array2[0][2] = sum;

        int count = 0;
        for(int i = 0; i<array1.length;i++){ // 行
            for(int j = 0; j<array1[i].length;j++){ //读取array1的信息 列
                if(array1[i][j]!=0){
                    count++; // 统计为第几个有效值 并存进array2数组中
                    array2[count][0] = i;
                    array2[count][1] = j;
                    array2[count][2] = array1[i][j];
                }
            }
        }
        System.out.println("------------------------------");
        System.out.println("稀疏数组");
        System.out.println("行"+"\t"+"列"+"\t"+"有效值"+"\t");
        for (int[] ints : array2) {
            System.out.println(ints[0] + "\t" + ints[1] + "\t" + ints[2]);
        }
        // 那么可以还原原来的稀疏数组吗？

        //读取数组的值
        int[][] array3 = new int[array2[0][0]][array2[0][1]]; // 运用array2第一行来确定array3的数组大小
        for(int i = 1;i< array2.length;i++){ // 第一行是头部信息 11行 11列 2个有效值
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }
        System.out.println("---------------------------------------");
        // 打印还原的数组
      for(int[] ints:array3){
          for(int anInt:ints){
              System.out.print(anInt+"\t");
          }
          System.out.println();
      }
        }

}
