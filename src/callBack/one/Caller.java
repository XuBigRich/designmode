package callBack.one;

//A程序员写的A程序
public class Caller {
    /**
     * 回调者
     *
     * @param callBack
     */
    public void call(ICallBack callBack) {
        System.out.println("start...");
        callBack.callBack();
        System.out.println("end...");
    }


    /**
     * 回调测试  理应由B程序员发起，详情 请看two包
     *
     * @param args
     */
    public static void main(String[] args) {
        Caller call = new Caller();
        call.call(new ICallBack() {
            @Override
            public void callBack() {
                System.out.println("终于回调成功了！");
            }
        });

    }
}