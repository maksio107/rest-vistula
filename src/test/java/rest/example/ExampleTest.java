package rest.example;

import org.junit.Test;

import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ExampleTest extends ExampleConfiguration {

    @Test
    public void shouldGetSinglePost() {
        Map response =
            when()
                    .get("/posts/1")
            .then()
                    .statusCode(200)
                    .extract().path("");

        assert response.get("id").equals(1);
        assert response.get("userId").equals(1);
    }


}
