package runner;

import helpers.CompararJsons;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class Ej1 {

    private Response response;

    @Given("Tengo acceso a Todo.ly")
    public void tengoAccesoATodoLy() {

    }

    @When("Mando un POST al url {} con el json")
    public void mandoUnPOSTAlUrlHttpsTodoLyApiUserJsonConElJson(String url, String body) {
        response = given().
                contentType(ContentType.JSON).
                body(body).
                log().all().
                when().post(url);
    }

    @Then("Espero el codigo de respuesta {int}")
    public void esperoElCodigoDeRespuesta(int code) {
        response.then().statusCode(code);
    }

    @And("Espero que el body de la respuesta sea")
    public void esperoQueElBodyDeLaRespuestaSea(String body) {
        response.then().log().all();
        Assert.assertTrue(CompararJsons.compararJsons(response.getBody().asString(), body));
    }

    @When("Mando un PUT al url {} con el json el email {} y el password {}")
    public void mandoUnPUTAlUrlHttpsTodoLyApiUserJsonConElJsonElEmailMauriTestMauriComYElPassword(String url, String email, String pwd, String body) {
        response = given().
                auth().preemptive().basic(email,pwd).
                contentType(ContentType.JSON).
                body(body).
                log().all().
                when().put(url);

    }

    @When("Mando un DELETE al url {} el email {} y el password {}")
    public void mandoUnDELETEAlUrlHttpsTodoLyApiUserJsonElEmailMauriTestMauriComYElPassword(String url, String email, String pwd) {
        response = given().
                auth().preemptive().basic(email, pwd).
                contentType(ContentType.JSON).
                log().all().
                with().delete(url);
    }
}
