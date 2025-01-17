package com.range;

import com.range.Listeners.MemberCounter;
import com.range.Listeners.MessageListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.requests.GatewayIntent;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args)
    {
        JDA jda = JDABuilder.createDefault(VariablesKt.getBotToken())
              // enables explicit access to message.getContentDisplay()
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MEMBERS)
                .setActivity(Activity.playing(VariablesKt.getBotplaying()))
                .addEventListeners(new MessageListener()).addEventListeners(new MemberCounter())
                .build();


    }

}