public class Puppy {
    int puppyAge;

    // 构造方法
    public Puppy(String name) {
        System.out.println("小狗的名字是:" + name);
    }

    public static void main(String[] args) {
        Puppy myPuppy = new Puppy("liang");
        myPuppy.setAge(2);
        myPuppy.getAge();
        System.out.println("变量值：" + myPuppy.puppyAge);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("小狗的年龄为：" + puppyAge);
        return puppyAge;
    }

}
