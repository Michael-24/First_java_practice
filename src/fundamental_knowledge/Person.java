package fundamental_knowledge;

public class Person {
    // 一个类什么不写都会有初始方法 在这里初始会有 public Person 这个无参方法
    String name;
    // 构造器 1.与类名相同 2.没有返回值
    // 初始化对象
    // (无参)构造器(默认)
    public Person(){
        this.name = "Michael"; // main中new的时候到这里初始化之后才算实例化完成
    }
    // 有参构造 一旦设置了有参构造 无参构造需显式定义
    public Person(String name){
        this.name = name;
    }

}
