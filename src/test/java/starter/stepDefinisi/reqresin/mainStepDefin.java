package starter.stepDefinisi.reqresin;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class mainStepDefin {

    @Then("respone status code should be {int}")
    public void responeStatusCodeShouldBe(int statusCode) {
        restAssuredThat(respone -> respone.statusCode(statusCode));
    }

    @And("respone structure sould match json scema {string}")
    public void respone(String scema) {
        String Path = String.format("scema/%s", scema);
        restAssuredThat(response -> response.assertThat().body(matchesJsonSchemaInClasspath(Path)));
    }
}
