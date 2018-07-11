package bpaaa.prod1.app.musart;

import java.rmi.RemoteException;
import java.util.Vector;

import psdi.mbo.Mbo;
import psdi.mbo.MboRemote;
import psdi.mbo.MboSet;
import psdi.mbo.MboSetRemote;
import psdi.util.MXApplicationException;
import psdi.util.MXException;

public class BPAAAArtist extends Mbo implements BPAAAArtistRemote {

	public BPAAAArtist(MboSet ms) throws RemoteException {
		super(ms);
	}
	
	@Override
	public void canDelete() throws MXException, RemoteException {
		super.canDelete();
		if (!this.getMboSet("BPAAAMUSIC").isEmpty()){
			Object[] params = new Object[]{this.getString("name")};
			throw new MXApplicationException("BPAAAartist", "CannotDeleteArtistWithMusic", params);
		}
	}
	
	public void associateSelectedMusic(MboSetRemote musicSet) throws MXException, RemoteException{
		Vector selectedMusics = musicSet.getSelection();
		for (Object music: selectedMusics){
			((MboRemote)music).setValue("artistnum", this.getString("artistnum"), NOACCESSCHECK);
		}
	}

}
