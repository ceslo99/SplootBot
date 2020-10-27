package discordBot;

import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

public class discrodBot {
	public static JDA jda;
	public static String prefix = "!";

	public static void main(String[] args) throws LoginException {
		// TODO Auto-generated method stub
		jda = (JDA) new JDABuilder(AccountType.BOT).setToken("NzY3OTI5NjE1NjkxMTUzNDYw.X45ELw.2-6jdHPSsPVtl6RAMurcqLz_yh8").build();

		//jda.getPresence().setStatus(OnlineStatus.IDLE);
		//jda.getPresence().setGame(Game.watching("Sploot pictures"));
	}

}
