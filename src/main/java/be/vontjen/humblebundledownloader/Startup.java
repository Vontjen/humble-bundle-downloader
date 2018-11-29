package be.vontjen.humblebundledownloader;

import be.vontjen.humblebundledownloader.client.HumbleBundleClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Startup implements ApplicationListener<ApplicationReadyEvent> {


    private HumbleBundleClient client;

    public Startup(@Autowired HumbleBundleClient client) {
        this.client = client;
    }

    @Override
    public void onApplicationEvent(ApplicationReadyEvent event) {

        System.out.println(client.login("processlogin"));
    }
}
