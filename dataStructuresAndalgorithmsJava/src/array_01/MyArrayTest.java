package array_01;

/** 测试数组相关方法
 * @USER: shangushenlong
 * @DATE: 2020/5/16
 * @PROJECT_NAME: dataStructuresAndalgorithmsJava
 **/
public class MyArrayTest {

    public static void main(String[] args) {
        MyArray myArray = new MyArray(6);
        myArray.myArrayInsert(0,0);
        myArray.myArrayInsert(1,1);
        myArray.myArrayInsert(2,2);
        myArray.myArrayInsert(3,3);
        myArray.myArrayInsert(4,4);
        myArray.myArrayInsert(5,5);

        // 新增
      //  myArray.myArrayInsert(2,3);
        // 删除
      //  myArray.myArrayDel(0);

        // 查询
//        int i = myArray.myArrayFind(4);
//        System.out.println("对应的索引位置：" + i);

        myArray.myArrayModify(1,9);

        myArray.printAll();
    }
}
