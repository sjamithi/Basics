import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class EncodingDecoding {
    String chars = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Random rand = new Random();
    String key = getRandom();
    Map<String, String> map =  new HashMap<>();

    public String getRandom() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< 6; i++) {
            sb.append(chars.charAt(rand.nextInt(62)));
        }
        return sb.toString();
    }

    public String encode(String longUrl) {
        while (map.containsKey(key)) {
            key = getRandom();
        }
        map.put(key, longUrl);
        return "http://tinyUrl.com" + key;
    }

    public String decode(String tinyUrl) {
        return  map.get(tinyUrl.replace("http://tinyUrl.com", ""));
    }

    public static void main(String[] args) {
        EncodingDecoding encodingDecoding = new EncodingDecoding();
        encodingDecoding.encode("abcbcbbcbc");
        System.out.println(encodingDecoding.decode(encodingDecoding.encode("abcbcbbcbc")));

    }
}
