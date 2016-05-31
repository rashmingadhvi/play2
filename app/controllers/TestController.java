package controllers;

import org.springframework.beans.factory.annotation.Autowired;
import play.libs.F;
import play.mvc.Controller;
import play.mvc.Result;
import services.TestService;

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
}
