import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class DataProviderTest {
@DataProvider(name = "testing data")
    public Object [][] datatest(){

      Object[][] data = new Object[2][5];

      data[0][0] = "asma";
        data[0][1] = 20;
        data[0][2] = "blue";
        data[0][3] = "cricket";
        data[0][4] = "teacher";


        data[1][0] = "Akhi";
        data[1][1] = 25;
        data[1][2] = "purple";
        data[1][3] = "football";
        data[1][4] = "player";

return data;


    }



@Test(dataProvider = "testing data")
  public void dataprovider(String name, int age, String colour,String hobby,String profession)
    {
        JSONObject request = new JSONObject();
        request.put ("name", name);
        request.put ("age", age);
        request.put ("colour", colour);
        request.put ("hobby", hobby);
        request.put ("profession", profession);
        System.out.println(request);
        given().
                body(request.toJSONString()).when().
                post("http://localhost:3000/Fake_api").then().
                statusCode(201).log().all();

    }
}
