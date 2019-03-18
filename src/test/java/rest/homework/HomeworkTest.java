package rest.homework;

import io.restassured.http.ContentType;
import org.junit.Test;
import rest.homework.model.Homework;

import java.util.Map;

import static io.restassured.RestAssured.*;

public class HomeworkTest extends HomeworkConfiguration{

    @Test
        public void shouldGetAlbum() {
        Map response =
            when()
                .get("albums/1")
            .then()
                .statusCode(200)
                .extract().path("");
        assert response.get("id").equals(1);
        assert response.get("title").equals("quidem molestiae enim");
    }

    @Test
    public void shouldPostPost () {
        given()
                .body(new Homework(10, "przykładowy title", "przykładowe body"))
                .contentType(ContentType.JSON)
        .when()
                .post("posts")
        .then()
                .statusCode(201);
    }

    @Test
    public void shouldDeletePost () {
        when()
                .delete("posts/1")
        .then()
                .statusCode(200);
    }

    @Test
    public void shouldPutPost(){
        given()
                .body(new Homework(11, "przykładowy title dla puta", "przykładowe body dla puta"))
                .contentType(ContentType.JSON)
        .when()
                .put("posts/1")
        .then()
                .statusCode(200);
    }

}
