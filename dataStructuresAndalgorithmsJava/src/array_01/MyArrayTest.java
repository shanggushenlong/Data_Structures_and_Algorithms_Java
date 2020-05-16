package array_01;

/** 测试数组相关方法
 * @USER: shangushenlong
 * @DATE: 2020/5/16
 * @PROJECT_NAME: dataStructuresAndalgorithmsJava
 **/
public class MyArrayTest {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(8);
        myArray.myArrayInsert(0,0);
        myArray.myArrayInsert(1,1);
        myArray.myArrayInsert(2,2);

        myArray.myArrayInsert(2,3);
        myArray.printAll();
    }
}
