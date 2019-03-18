package rest.example;

import io.restassured.RestAssured;
import org.junit.Before;

public class ExampleConfiguration {

    @Before
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

}
