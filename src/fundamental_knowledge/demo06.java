package fundamental_knowledge;


import java.util.Arrays;

public class demo06 {
   public static void main(String[] args){
       int[] a = {1,2,3,4,213213,321321,1231,451122};
       System.out.println(a); // 这样输出的是一个对象
       System.out.println(Arrays.toString(a)); //打印数组
       Arrays.sort(a);
       System.out.println(Arrays.toString(a));
//       Arrays.fill(a,0); //填充数组
//       System.out.println(Arrays.toString(a));
       System.out.println(Arrays.toString(sort(a)));
   }
   public static int[] sort(int[] array){
       int temp = 0;
       // 外层循环，判断进行多少次比较
       for(int i=0;i<array.length - 1; i++){
           boolean flag = false;
           for(int j = 0; j<array.length-i-1;j++){
               if(array[j] >array[j+1] && !flag){
                   temp = array[j+1];
                   array[j+1] = array[j];
                   array[j] = temp;
                   flag = true;
               }
           }
       }
       return array;
   }

}
