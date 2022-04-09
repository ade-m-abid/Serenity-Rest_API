package starter.stepDefinisi.reqresin;

import io.cucumber.java.en.When;
import starter.service.reqresin.reqresin;
public class registerStepDefin {
    reqresin Reqresin = new reqresin();
    @When("user success send POST register reques in reqresin")
    public void POSTRegister() {
        Reqresin.postRegister();
    }
    @When("user Unsuccess send POST register reques in reqresin")
    public void POSTRegister1() {
        Reqresin.postRegister2();
    }

}
