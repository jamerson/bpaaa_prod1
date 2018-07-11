package bpaaa.prod1.webclient.beans.musart;

import java.rmi.RemoteException;

import psdi.mbo.MboRemote;
import psdi.mbo.MboSetRemote;
import psdi.util.MXApplicationException;
import psdi.util.MXException;
import psdi.webclient.system.beans.DataBean;

public class BPAAAArtistMusicBean extends DataBean {

	public int associateMusic() throws MXException, RemoteException{
		MboRemote artist = app.getAppBean().getMbo();
		MboSetRemote musicWithoutArtistSet = artist.getMboSet("BPAAAMUSICWITHOUTARTIST");
		if (musicWithoutArtistSet.isEmpty()){
			throw new MXApplicationException("bpaaatrartist","NoMusicToSelect");
		}
		return EVENT_CONTINUE;
	}

}
