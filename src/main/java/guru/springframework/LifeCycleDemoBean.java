package guru.springframework;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("XXX---> LifeCycleDemoBean > Constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("XXX---> LifeCycleDemoBean > setBeanFactory");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("XXX---> LifeCycleDemoBean > setBeanName");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("XXX---> LifeCycleDemoBean > destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("XXX---> LifeCycleDemoBean > afterPropertiesSet");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("XXX---> LifeCycleDemoBean > setApplicationContext");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("XXX---> LifeCycleDemoBean > postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("XXX---> LifeCycleDemoBean > preDestroy");
    }

    public void beforeInit() {
        System.out.println("XXX---> LifeCycleDemoBean > beforeInit");
    }

    public void afterInit() {
        System.out.println("XXX---> LifeCycleDemoBean > afterInit");
    }
}
