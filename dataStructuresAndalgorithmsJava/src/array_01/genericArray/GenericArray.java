package array_01.genericArray;

import java.util.Objects;

/** 通用数组：泛型，对于不同类型数组
 * @USER: shanggushenlong
 * @DATE: 2020/5/19
 * @PROJECT_NAME: dataStructuresAndalgorithmsJava
 **/
public class GenericArray<T> {
    // 定义数组
    private T[] data;
    // 数组当前元素个数
    private int size;

    /**
     * 有参数构造函数
     * @param capacity 数组的长度
     */
    public GenericArray(int capacity){
        // 类型强制转换
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    /**
     * 无参构造:默认为10
     */
    public GenericArray(){
        this(10);
    }

    /**
     * 检查索引是否符合条件
     * @param index 索引
     */
    private void checkIndex(int index){
        if (index < 0 || index + 1 > data.length){
            throw new IllegalArgumentException("索引超出数组范围");
        }
    }


    /**
     * 向数组指定位置主插入数据
     * @param index 位置索引(索引位置从0开始)
     * @param value 待插入的值
     */
    public void add(int index,T value){
        checkIndex(index);

        for (int i = size; i >= size; i--){
            data[i+1] = data[i];
        }
        data[index] = value;
        size ++;

    }

    // 头部插入
    public void addFirst(T value){
        this.add(0, value);
    }

    // 尾部插入
    public void addLast(T value){
        this.add(size - 1, value);
    }

    /**
     * 删除指定位置的
     * @param index
     * @param value
     * @return
     */
    public T remove(int index, T value){
        checkIndex(index);
        T emp = data[index];
        for (int i = index; i < size; i++){
            data[i] = data[i + 1];
        }
        size --;

        return emp;
    }

    public T removeFirst(T value){
       return this.remove(0, value);
    }

    public T removeLast(T value){
        return this.remove(size-1, value);
    }

    /**
     * 通过索引获取索引对应的值
     * @param index 索引
     * @return 索引对应的值
     */
    public T getTByIndex(int index){
        checkIndex(index);

        return data[index];
    }

    /**
     * 修改指定位置的数据
     * @param index 指定位置索引
     * @param value 修改的值
     */
    public void set(int index, T value){
        checkIndex(index);
        data[index] = value;
    }

    /**
     * 判断数组是否为空
     * @return 返回结果
     */
    public boolean isEmpty(){
       return size == 0;
    }

    /**
     * 判断是否包含改元素
     * @param value 待查询的元素
     * @return 返回结果
     */
    public boolean contains(T value){
        for (int i = 0; i < size; i++){
            if (data[i].equals(value)){
                return true;
            }
        }
        return false;
    }
}
