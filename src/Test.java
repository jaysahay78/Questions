import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import com.google.gson.*;

class Main {

    public static int fetchAndCountPosts() {
        String apiUrl = "https://coderbyte.com/api/challenges/json/all-posts";
        int count = 0;

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.setReadTimeout(5000);

            int status = conn.getResponseCode();

            // Edge Case: Non-200 HTTP response
            if (status != 200) return 0;

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            JsonObject json = JsonParser.parseString(response.toString()).getAsJsonObject();

            // Edge Case: Missing "posts" key
            if (!json.has("posts") || json.get("posts").isJsonNull()) return 0;

            JsonArray posts = json.getAsJsonArray("posts");

            // Edge Case: Not an array
            if (posts == null) return 0;

            count = posts.size();

        } catch (Exception e) {
            return 0; // Edge Case: API down / JSON invalid / timeout
        }

        return count;
    }

    public static void main(String[] args) {
        int numberOfPosts = fetchAndCountPosts();
        System.out.println("Number of posts: " + numberOfPosts);
    }
}