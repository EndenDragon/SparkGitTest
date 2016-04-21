import static spark.Spark.*;

public class Main {
    public static void main(String[] args) {
    	get("/", (request, response) -> {
    	    return "Hello: " + request.userAgent();
    	});
    }
}