package openfire;

import org.jivesoftware.smack.XMPPException;

public class usespark {

	public static void main(String[] args) throws XMPPException {
		// TODO Auto-generated method stub
		spark s = new spark();
		s.connect("192.168.21.128");
		s.login("wy", "1");
		s.chat("yw@192.168.21.128","goodtime");
	}

}
