package starter.stepDefinisi.reqresin;

import io.cucumber.java.en.When;
import starter.service.reqresin.reqresin;

public class userStepDefin {
    reqresin Reqresin = new reqresin();
    @When("user successful send Get singel user request in reqresin")
    public void GETsinggel() {
        Reqresin.getSingel();
    }
    @When("user successful send Get List User resource request in reqresin")
    public void GETlistUser() {
        Reqresin.getList();
    }
    @When("user successful send Create new accont request in reqresin")
    public void POSTcreateAccont() {
        Reqresin.postcreate();
    }
    @When("user successful send Put update data request in reqresin")
    public void PUTupdateData() {
        Reqresin.postupdate();
    }
    @When("user successful send Delete accont request in reqresin")
    public void DELETEaccount() {
        Reqresin.delete();
    }


}
