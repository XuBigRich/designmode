package pipeline_mode.handle;

import pipeline_mode.pipeline.PipelineContext;
import pipeline_mode.pipeline.TimePipelineContext;

/**
 * 洗漱处理器
 *
 * @Author： hongzhi.xu
 * @Date: 2022/7/26 9:15 下午
 * @Version 1.0
 */
public class WashHandle extends ContextHandle<TimePipelineContext> {

    @Override
    public boolean handle(TimePipelineContext pipelineContext) {
        System.out.println(pipelineContext.name + "在" + pipelineContext.getWashTime() + "开始洗漱了");
        return true;
    }
}
