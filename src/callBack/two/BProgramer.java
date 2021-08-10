package callBack.two;

import callBack.one.Caller;
import callBack.one.ICallBack;

/**
 * B程序员写的B程序
 *
 * @Author： hongzhi.xu
 * @Date: 2021/7/30 下午10:51
 * @Version 1.0
 */
public class BProgramer {
    //B中的ICallBack 实现
    public static ICallBack callBackB = new ICallBack() {
        @Override
        public void callBack() {
            System.out.println("终于回调成功了！");
        }
    };

    public static void main(String[] args) {
        //
        Caller caller = new Caller();
        caller.call(callBackB);
    }
}
