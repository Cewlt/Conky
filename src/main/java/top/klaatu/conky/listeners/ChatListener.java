package top.klaatu.conky.listeners;

import com.samczsun.skype4j.Skype;
import com.samczsun.skype4j.chat.Chat;
import com.samczsun.skype4j.chat.messages.ChatMessage;
import com.samczsun.skype4j.events.EventHandler;
import com.samczsun.skype4j.events.Listener;
import com.samczsun.skype4j.events.chat.message.MessageEvent;
import top.klaatu.conky.Conky;

public class ChatListener implements Listener {
    private Skype api;

    public ChatListener(Skype api) {
        this.api = api;
    }

    @EventHandler
    public void join(MessageEvent event) {
        System.out.println(event.getMessage().getContent().asPlaintext());
        ChatMessage message = event.getMessage();
        String contents = event.getMessage().getContent().asPlaintext();
        Chat chat = event.getChat();
        if (!contents.toLowerCase().contains("conky")) return;
        if (contents.toLowerCase().contains("make fun of ricky")) {
            String response = Conky.getHandler("MOCK RICKY").getResponse();
            try {
                chat.sendMessage("[Ricky]: " + response);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } else if (contents.toLowerCase().contains("insult")) {
            String[] args = contents.split(" ");
            if (args.length > 2) {
                String staff = args[2];
                String response = Conky.getHandler("INSULT").getResponse(staff);
                try {
                    chat.sendMessage("[Conky]: " + response);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }
}
