package com.emergon.jpacallbacks;

import javax.persistence.PostLoad;
import javax.persistence.PostPersist;
import javax.persistence.PostRemove;
import javax.persistence.PostUpdate;
import javax.persistence.PrePersist;
import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;

public class CustomerListener {

    private static final Logger LOG = LoggerFactory.logger(CustomerListener.class);
    
    @PrePersist
    public void userPrePersist(Customer ob) {
        LOG.info("*****Listening Customer Pre Persist : " + ob.getCname()+"*****");
    }

    @PostPersist
    public void userPostPersist(Customer ob) {
        LOG.info("*****Listening Customer Post Persist : " + ob.getCname()+"*****");
    }

    @PostLoad
    public void userPostLoad(Customer ob) {
        LOG.info("*****Listening Customer Post Load : " + ob.getCname()+"*****");
    }

    @PreUpdate
    public void userPreUpdate(Customer ob) {
        LOG.info("*****Listening Customer Pre Update : " + ob.getCname()+"*****");
    }

    @PostUpdate
    public void userPostUpdate(Customer ob) {
        LOG.info("*****Listening Customer Post Update : " + ob.getCname()+"*****");
    }

    @PreRemove
    public void userPreRemove(Customer ob) {
        LOG.info("*****Listening Customer Pre Remove : " + ob.getCname()+"*****");
    }

    @PostRemove
    public void userPostRemove(Customer ob) {
        LOG.info("*****Listening Customer Post Remove : " + ob.getCname()+"*****");
    }
}
