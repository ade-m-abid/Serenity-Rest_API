package starter.service.reqresin;

import net.serenitybdd.rest.SerenityRest;
import org.json.JSONObject;

public class reqresin {
    private static final String BASEURL = "https://reqres.in";
//POST_LOGIN
    public void postlogin(){
        JSONObject bodyJson= new JSONObject();

        bodyJson.put("email","eve.holt@reqres.in" );
        bodyJson.put("password","cityslicka");
    SerenityRest.given().header("Content-type", "application/json")
                        .body(bodyJson.toString())
                        .post(BASEURL + "/api/login");
    }
    public void postlogin2() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email", "peter@klaven");

        SerenityRest.given().header("Conten-type", "application/json")
                            .body(bodyJson.toString())
                            .post(BASEURL + "/api/login");
    }
//POST_REGISTER
    public void postRegister(){
        JSONObject bodyJson= new JSONObject();

        bodyJson.put("email", "eve.holt@reqres.in");
        bodyJson.put("password","pistol");
        SerenityRest.given().header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(BASEURL + "/api/register");
    }
    public void postRegister2() {
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("email","sydney@fife");

        SerenityRest.given().header("Content-type", "application/json")
                .body(bodyJson.toString())
                .post(BASEURL + "/api/register");
    }
//GET USER
    public void getSingel(){
        SerenityRest.given()
                    .get(BASEURL + "/api/users/2");
    }
    public void getList(){
        SerenityRest.given()
                    .get(BASEURL+ "/api/unknown");
    }
//CREATE ACCOUNT
    public void postcreate(){
        JSONObject bodyJson= new JSONObject();

        bodyJson.put("name", "Ade");
        bodyJson.put("job", "QE");

        SerenityRest.given()
                    .header("Content-type","application/json")
                    .body(bodyJson.toString())
                    .post(BASEURL+ "/api/users");
    }
//UPDATE DATA
    public void postupdate(){
        JSONObject bodyJson = new JSONObject();

        bodyJson.put("name", "morpheus");
        bodyJson.put("job", "QE Automation");

        SerenityRest.given()
                    .header("Content-type", "application/json")
                    .body(bodyJson.toString())
                    .put(BASEURL +"/api/users/2");
    }
//DELETE
    public void delete(){
        SerenityRest.given()
                    .delete(BASEURL + "/api/users/2");
    }
}
