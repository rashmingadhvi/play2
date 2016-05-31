import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import play.Application;
import play.GlobalSettings;
import play.Logger;


/**
 * Created by rashmin.gadhvi on 5/24/2016.
 */
public class Global extends GlobalSettings {

    private static ApplicationContext applicationContext;

    @Override
    public void onStart(Application application) {
        ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("application-context.xml");
        c.refresh();
        Global.applicationContext = c;
        Logger.info("**********************Application context received " + Global.applicationContext);
    }

    public <A> A getControllerInstance(Class<A> clazz)
    {
        return Global.applicationContext.getBean(clazz);
    }

}
