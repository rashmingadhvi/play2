package services;

import akka.actor.ActorRef;
import akka.pattern.Patterns;
import models.Apples;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import play.libs.F;
import play.libs.F.Promise;
import play.libs.Json;
import play.mvc.Result;
import scala.concurrent.Future;

import java.util.List;
import java.util.stream.Collectors;

import static play.mvc.Results.ok;

/**
 * Created by rashmin.gadhvi on 5/30/2016.
 */
@Service
public class TestService {
    private final ActorRef testActor;

    @Autowired
    public TestService(@Qualifier("testActor") ActorRef testActor){
        this.testActor = testActor;
    }
    public Promise<Result> test(){
            Future future = Patterns.ask(testActor, "Test Request", 3000);
           return Promise.wrap(future).map(response -> ok(response.toString()));
    }

    public F.Promise<Result> filterApples(List<Apples> apples){
        apples= apples.parallelStream().filter((Apples a) -> a.getWeight() > 1).collect(Collectors.toList());
        return Promise.pure(ok(Json.toJson(apples).toString()));
    }
}
