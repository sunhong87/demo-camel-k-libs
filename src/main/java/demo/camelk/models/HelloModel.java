package demo.camelk.models;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.Optional;

public class HelloModel {
  private String name;

  public HelloModel(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static Optional<HelloModel> convertFromJson(String json) {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    return Optional.ofNullable(json)
        .map(jsonString -> gson.fromJson(jsonString, HelloModel.class));
  }
}
