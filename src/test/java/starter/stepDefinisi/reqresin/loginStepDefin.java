package starter.stepDefinisi.reqresin;

import io.cucumber.java.en.When;
import starter.service.reqresin.reqresin;

public class loginStepDefin {
    reqresin Reqresin = new reqresin();

    @When("user success send POST login reques in reqresin")
    public void POSTLogin() {
        Reqresin.postlogin();
    }
    @When("user Unsuccess send POST login reques in reqresin")
    public void POSTLogin1() {
        Reqresin.postlogin2();
    }
}
