package controllers;

import models.LoginModel;
import play.Logger;
import play.data.Form;
import play.libs.F;
import play.libs.Json;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.WebSocket;

/**
 * Created by rashmin.gadhvi on 6/1/2016.
 */
@org.springframework.stereotype.Controller
public class LoginController extends Controller {
    private static final Logger.ALogger LOGGER = Logger.of(LoginController.class);


    public Result login1(){
        return ok(views.html.login1.render());
    }
    public Result login(){
        LoginModel model = Form.form(LoginModel.class).bindFromRequest().get();
        LOGGER.info(model+"");

        return ok("You're logged in!"+ Json.toJson(model));
    }

}
