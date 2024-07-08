import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;


public class apitest {

   /* @Test
    void testing()

    {

         given().get("https://dummyjson.com/products/1").then().statusCode(200).
                 log().all();
    }*/

/*
    @Test
    void testing2()
    {

        given().get("https://dummy.restapiexample.com/api/v1/employees").then().statusCode(200).
                body("data.employee_name[0]", Matchers.equalTo("Tiger Nixon")).
                body("data.employee_salary[3]", Matchers.equalTo(433060)).
                body("data.employee_age[2]", Matchers.equalTo(66)).

                log().all();
    }


    @Test
    void testing3()
        {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put ("name", "morpheus");
            map.put ("job", "leader");
            map.put ("age", 30);

JSONObject request = new JSONObject(map);
System.out.println(request);
            given().body(request.toJSONString()).when().
                    post("https://reqres.in/api/users").
                    then().statusCode(201).
                    log().all();


    }*/

    @Test
    void testing4()
    {
    JSONObject request = new JSONObject();
        request.put ("name", "morpheus");
        request.put ("job", "SQA engineer");
        System.out.println(request);
        given().
                body(request.toJSONString()).when().
                put("https://reqres.in/api/users/2").then().
                statusCode(200).log().all();

    }
}
