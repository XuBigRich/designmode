package pipeline_mode;

import pipeline_mode.handle.ContextHandle;
import pipeline_mode.handle.EasyHandle;
import pipeline_mode.handle.GoHandle;
import pipeline_mode.handle.WashHandle;
import pipeline_mode.pipeline.PipelineContext;
import pipeline_mode.pipeline.TimePipelineContext;

import java.util.ArrayList;

/**
 * 一个关于早上都干了什么的处理累
 *
 * @Author： hongzhi.xu
 * @Date: 2022/7/26 9:05 下午
 * @Version 1.0
 */
public class Morning {
    public ContextHandle contextHandle;

    {
        //建立处理流程链表
        this.contextHandle = new EasyHandle();
        ContextHandle washHandle = new WashHandle();
        contextHandle.first = contextHandle;
        contextHandle.next = washHandle;
        ContextHandle goHandle = new GoHandle();
        washHandle.first = contextHandle;
        washHandle.next = goHandle;
    }

    public void start(PipelineContext pipelineContext) {
        ContextHandle current = contextHandle.first;
        while (current != null) {
            current.handle(pipelineContext);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        TimePipelineContext timePipelineContext = new TimePipelineContext("7:40", "8:10", "8:30");
        timePipelineContext.name = "许鸿志";
        Morning morning = new Morning();
        morning.start(timePipelineContext);

    }
}
