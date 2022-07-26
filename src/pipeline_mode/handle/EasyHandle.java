package pipeline_mode.handle;

import pipeline_mode.pipeline.PipelineContext;
import pipeline_mode.pipeline.TimePipelineContext;

/**
 * 眼睛处理器
 *
 * @Author： hongzhi.xu
 * @Date: 2022/7/26 9:14 下午
 * @Version 1.0
 */
public class EasyHandle extends ContextHandle<TimePipelineContext> {
    @Override
    public boolean handle(TimePipelineContext pipelineContext) {
        System.out.println(pipelineContext.name + "在" + pipelineContext.getEasyTime() + "睁开了双眼");
        return true;
    }

}
