package openfire;

import java.sql.Connection;
import java.util.Collection;

import org.jivesoftware.smack.Chat;
import org.jivesoftware.smack.ChatManager;
import org.jivesoftware.smack.ConnectionConfiguration;
import org.jivesoftware.smack.MessageListener;
import org.jivesoftware.smack.Roster;
import org.jivesoftware.smack.RosterEntry;
import org.jivesoftware.smack.XMPPConnection;
import org.jivesoftware.smack.XMPPException;
import org.jivesoftware.smack.packet.Message;

public class sendmessage {

	public static void main(String[] args) throws XMPPException {
		// TODO Auto-generated method stub
		//ConnectionConfiguration config = new ConnectionConfiguration("192.168.21.128",5222);
		XMPPConnection con =  new XMPPConnection("192.168.21.128");
	    con.connect();
		con.login("wy", "1");
		ChatManager chatmanager = con.getChatManager();
		Chat newchat = chatmanager.createChat("yw@192.168.21.128", new MessageListener(){

			@Override
			public void processMessage(Chat chat, Message message) {
				// TODO Auto-generated method stub
				//System.out.println("Received message:"+ message);
			}
			
		});
		
		Roster roster = con.getRoster();
		Collection<RosterEntry> entries = roster.getEntries();
		for(RosterEntry entry:entries){
			System.out.println(entry);
		}
		
		Message newMessage = new Message();
		newMessage.setBody("superman");
		newMessage.setProperty("favoriteColor", "red");
		newchat.sendMessage(newMessage);
		
		con.disconnect();
		
        
        
	}

}
