package actors;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.ActorRefFactory;
import akka.actor.Props;
import akka.dispatch.Futures;
import akka.japi.pf.ReceiveBuilder;
import akka.pattern.Patterns;
import scala.concurrent.Future;

import java.util.UUID;

/**
 * Created by rashmin.gadhvi on 5/31/2016.
 */
public class TestActor extends AbstractActor {

    public static ActorRef create(ActorRefFactory context) {
        return context.actorOf(TestActor.props(), "testActor" + UUID.randomUUID().toString());
    }

    public static Props props() {
        return Props.create(TestActor.class);
    }

    private TestActor() {
        receive(
                ReceiveBuilder
                        .match(String.class, message -> {
                                    Future<String> future = Futures.successful("Test Response");
                                    Patterns.pipe(future, context().dispatcher()).to(sender());
                                }
                        )
                        .matchAny(o -> {
                            Patterns.pipe(Futures.failed(new Exception("Unknown")), context().dispatcher()).to(sender());
                        })
                        .build()
        );
    }
}