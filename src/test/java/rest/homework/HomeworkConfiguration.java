package rest.homework;

import io.restassured.RestAssured;
import org.junit.Before;

public class HomeworkConfiguration {
    @Before
    public void setup() {
        RestAssured.baseURI = "https://jsonplaceholder.typicode.com";
    }

}
