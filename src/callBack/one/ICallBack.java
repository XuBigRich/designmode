package callBack.one;

/**
 * 什么是回调函数
 *
 * 所谓的回调，用于回调的函数。 回调函数只是一个功能片段，由用户按照回调函数调用约定来实现的一个函数。
 * 有这么一句通俗的定义：就是程序员A写了一段程序（程序a），其中预留有回调函数接口，并封装好了该程序。
 * 程序员B要让a调用自己的程序b中的一个方法，于是，他通过a中的接口回调自己b中的方法。
 *
 * @Author： hongzhi.xu
 * @Date: 2021/7/30 下午10:46
 * @Version 1.0
 */
//A程序员写的A程序
public interface ICallBack {
     void callBack();
}
