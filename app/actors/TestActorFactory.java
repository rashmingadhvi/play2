package actors;

import akka.actor.ActorRef;
import akka.actor.ActorRefFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by rashmin.gadhvi on 5/31/2016.
 */
@Configuration
public class TestActorFactory {
    @Bean(name = "testActor")
    public ActorRef createActors(ActorRefFactory context){
        return TestActor.create(context);
    }
}
