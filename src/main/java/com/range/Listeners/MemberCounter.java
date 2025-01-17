package com.range.Listeners;

import com.range.VariablesKt;
import net.dv8tion.jda.api.entities.channel.concrete.TextChannel;
import net.dv8tion.jda.api.events.guild.member.GuildMemberJoinEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MemberCounter extends ListenerAdapter {

    @Override
    public void onGuildMemberJoin(@NotNull GuildMemberJoinEvent event) {

        String userName =event.getUser().getAsMention();
        int totalmembers = event.getGuild().getMemberCount();
        String welcomemessage = "Sunucumuza hosgeldin  " + userName+" seninle birlikte **"
                +totalmembers +"** kişi olduk";
        String channelid = VariablesKt.getWelcomeCHannelId();

       TextChannel textchannel = event.getGuild().getTextChannelById(channelid);
       textchannel.sendMessage(welcomemessage).queue();
    }
}
