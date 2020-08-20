package java_regular.data.type.collections.type.queues.delay_queue;

import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

public class DelayObject implements Delayed {
    private String name;
    private long time;

    public DelayObject(String name, long delayTime) {
        this.name = name;
        this.time = System.currentTimeMillis() + delayTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = time - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed obj) {
        if (this.time < ((DelayObject)obj).time) {
            return -1;
        }

        if (this.time > ((DelayObject)obj).time) {
            return 1;
        }

        return 0;
    }

    @Override
    public String toString(){
        return "\t{"
                + "name=" + name
                + ", time=" + time
                + "}";
    }
}
