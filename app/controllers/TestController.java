package controllers;

import models.Apples;
import org.springframework.beans.factory.annotation.Autowired;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import services.TestService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rashmin.gadhvi on 5/30/2016.
 */
@org.springframework.stereotype.Controller
public class TestController extends Controller {

    @Autowired
    TestService testService;

    public F.Promise<Result> test(){
        return testService.test();
    }

    public F.Promise<Result> filterApples(){
        List<Apples> apples = new ArrayList<>();
        apples.add(new Apples(1,"red"));
        apples.add(new Apples(2,"green"));
        apples.add(new Apples(3,"yellow"));
        apples.add(new Apples(4,"pink"));
        return testService.filterApples(apples);
    }
}
