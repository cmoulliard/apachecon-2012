package org.apache.con2012.karafee.monitoring;

import org.apache.openejb.api.jmx.Description;
import org.apache.openejb.api.jmx.MBean;
import org.apache.openejb.api.jmx.ManagedAttribute;

import javax.enterprise.context.ApplicationScoped;
import java.util.concurrent.atomic.AtomicInteger;

@MBean
@Description("Monitor conference repository")
@ApplicationScoped
public class RepositoryMonitoring {
    private final AtomicInteger SAVED = new AtomicInteger();

    public void inc() {
        SAVED.incrementAndGet();
    }

    @ManagedAttribute
    @Description("number of saved conferences")
    public int getSavedConferenceNumber() {
        return SAVED.get();
    }
}
