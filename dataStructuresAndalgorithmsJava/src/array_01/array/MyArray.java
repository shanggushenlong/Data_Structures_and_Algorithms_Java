package array_01.array;

import com.sun.istack.internal.Nullable;

import javax.swing.text.StyledEditorKit;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

/** java实现数组
 *  数组的常见操作：新增 删除 修改 查询
 * @USER: shanggushenlong
 * @DATE: 2020/5/16
 * @PROJECT_NAME: dataStructuresAndalgorithmsJava
 **/
public class MyArray {
    // 数组申请空间的长度
    private int size = 0;
    // 数组实际长度
    private int count;
    // 数组实际存储
    private int[] array;

    /**
     * 构造方法-初始化
     * @param capacity 数组初始化长度
     */
    public MyArray(int capacity) {
        this.size = capacity;
        this.array = new int[capacity];
        this.count = 0;
    }

    /**
     * 根据索引在指定位置插入数据
     * @param index 索引
     * @param value 带插入的值
     */
    protected boolean myArrayInsert(int index,int value){

        // 判断数组是否还有空余空间
        if (count == size){
            System.out.println("没有可插入的空间");
            return false;
        }

        // 判断是否越界
        if (index < 0 || index >= size){
            System.out.println("数组越界异常");
            return false;
        }

        // 循环，从插入的位置开始依次将数据向后移动，将index所指向的位置腾出来，方便插入新的数据
        for (int i = count; i > index; i--) {
            array[i] = array[i-1];
        }
        array[index] = value;
        count ++ ;
        System.out.println("插入成功");
        return true;
    }

    /**
     * 删除指定位置的数
     * @param index 索引
     */
    protected boolean myArrayDel(int index){
        if (index < 0 || index >= count){
            System.out.println("索引越界");
            return false;
        }

        for (int i = index; i < count - 1; i++) {
            array[i] = array[i + 1];
        }
        count --;
        System.out.println("删除成功");
        return true;
    }

    /**
     * 数组查询
     * @param value 待查询的值
     * @return 返回该值对应的索引
     */
    protected int myArrayFind(int value){
        for (int i = 0; i < count; i++) {
            if (array[i] == value){
                System.out.println("查询成功");
                return i;
            }
        }
        System.out.println("查询不成功，该数不存在");
        return -1;
    }

    /**
     * 修改替换指定位置的数据
     * @param index 指定位置索引
     * @param value 值
     * @return 是否修改成功
     */
    protected boolean myArrayModify(int index,int value){
        if (index < 0 || index >= count){
            System.out.println("索引越界");
            return false;
        }

        array[index] = value;
        return true;
    }

    /**
     * 数组打印
     *
     */
    protected void printAll(){
        System.out.println("当前数组实际长度：" + count);
        System.out.println("申请的数组空间大小:" + size);
        for (int i = 0; i < count; i++) {
            System.out.println("位置:" + i + "----" + array[i]);
        }
    }

}
