package pipeline_mode.pipeline;

/**
 * 时间节点
 *
 * @Author： hongzhi.xu
 * @Date: 2022/7/26 9:29 下午
 * @Version 1.0
 */
public class TimePipelineContext extends PipelineContext {
    private String easyTime;
    private String washTime;
    private String goTime;

    public TimePipelineContext(String easyTime, String washTime, String goTime) {
        this.easyTime = easyTime;
        this.washTime = washTime;
        this.goTime = goTime;
    }

    public String getEasyTime() {
        return easyTime;
    }

    public String getWashTime() {
        return washTime;
    }

    public String getGoTime() {
        return goTime;
    }


}
