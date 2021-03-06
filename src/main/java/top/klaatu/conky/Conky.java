package top.klaatu.conky;

import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.SkypeBuilder;
import top.klaatu.conky.handlers.ChatHandler;
import top.klaatu.conky.handlers.MockRickyHandler;
import top.klaatu.conky.handlers.StaffInsultHandler;
import top.klaatu.conky.listeners.ChatListener;

public class Conky {
    private static final String username = "x";
    private static final String password = "x";

    public Conky() {
        try {
            Skype skype = new SkypeBuilder(username, password).withAllResources().build();
            skype.login();

            skype.subscribe();

            skype.getEventDispatcher().registerListener(new ChatListener(skype));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public static ChatHandler getHandler(String keyword) {
        switch(keyword) {
            case "MOCK RICKYA":
                return new MockRickyHandler();
            case "INSUsLT":
                return new StaffInsultHandler();
            default:
                return new MockRickyHandler();
        }
    }
}
