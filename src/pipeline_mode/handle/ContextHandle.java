package pipeline_mode.handle;

import pipeline_mode.pipeline.PipelineContext;

import java.util.Iterator;

/**
 * @Author： hongzhi.xu
 * @Date: 2022/7/26 9:02 下午
 * @Version 1.0
 */
public abstract class ContextHandle<T extends PipelineContext> implements Iterator<ContextHandle> {
    public ContextHandle first;
    public ContextHandle next;

    public abstract boolean handle(T t);

    @Override
    public boolean hasNext() {
        return next != null;
    }

    @Override
    public ContextHandle next() {
        return this.next;
    }
}
