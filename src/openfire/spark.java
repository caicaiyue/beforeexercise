package openfire;

import java.util.Collection;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class spark {
	
	static XMPPConnection con;
	
	public static void connect(String servername) throws XMPPException{
		con = new XMPPConnection(servername);
		con.connect();
		System.out.println(con.getServiceName());
		
	}
	
	public static void login(String username,String pwd) throws XMPPException{
		con.login(username, pwd);
		ChatManager chatmanager = con.getChatManager();
		
	}
	
	public static void chat(String receiver,String message) throws XMPPException{
		ChatManager chatmanager = con.getChatManager();
		Chat newChat = chatmanager.createChat(receiver, new MessageListener() {
		    public void processMessage(Chat chat, Message message) {
		        System.out.println("Received message: " + message);
		    }
		});
		
		newChat.sendMessage(message);

	}

}
