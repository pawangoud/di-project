package guru.springframework.diproject;

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
        System.out.println("## - I am in LifeCycleDemoBean constructor ");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("## - Bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("## - My bean name is :: "+s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("## - The LifeCycleDemoBean has been terminated");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("## - The LifeCycleDemoBean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("## - Application context has been set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("## - The post construct annotated method has been called");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("## - The pre destroy annotated method has been called");
    }

    public void beforeInit(){
        System.out.println("## - Before init called by Bean Post Processor");
    }

    public void afterInit(){
        System.out.println("## - After init called by Bean Post Processor");
    }
}
