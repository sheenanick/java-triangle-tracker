import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/form.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/triangle", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      Integer sideA = Integer.parseInt(request.queryParams("number1"));
      Integer sideB = Integer.parseInt(request.queryParams("number2"));
      Integer sideC = Integer.parseInt(request.queryParams("number3"));
      Triangle firstTriangle = new Triangle(sideA, sideB, sideC);
      String output = firstTriangle.triangleTypeChecker();
      model.put("output", output);
      model.put("template", "templates/triangle.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
