package bpaaa.prod1.app.musart;

import java.rmi.RemoteException;

import psdi.mbo.Mbo;
import psdi.mbo.MboServerInterface;
import psdi.mbo.MboSet;
import psdi.util.MXException;

public class BPAAAMusicSet extends MboSet implements BPAAAMusicSetRemote {

	public BPAAAMusicSet(MboServerInterface ms) throws RemoteException {
		super(ms);
	}

	@Override
	protected Mbo getMboInstance(MboSet ms) throws MXException, RemoteException {
		return new BPAAAMusic(ms);
	}

}
