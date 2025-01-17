package com.range.Listeners;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        Message message = event.getMessage();
        String content = message.getContentRaw();
        if (content.equalsIgnoreCase("selam")
                ||content.equalsIgnoreCase("selam aleyküm")
                ||content.equalsIgnoreCase("selam aleykum")
        ||content.equalsIgnoreCase("sa"))
        {
            System.out.printf(event.getChannel().getId());
            event.getChannel().sendMessage("aleyküm selam").queue();
        }
    }
}
