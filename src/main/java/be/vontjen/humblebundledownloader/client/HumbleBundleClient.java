package be.vontjen.humblebundledownloader.client;


import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.ResourceBundle;

@Service
public class HumbleBundleClient extends RestClient {

    private static ResourceBundle properties = ResourceBundle.getBundle("config");


    public String login(String uri) {
        MultiValueMap<String, String> data = new LinkedMultiValueMap<>();
        data.add("ajax", "true");
        data.add("username", properties.getString("username"));
        data.add("password", properties.getString("password"));
        data.add("recaptcha_challenge_field", "");
        data.add("recaptcha_response_field", properties.getString("recaptcha_response_field"));


        return super.post(uri, data);
    }
}
