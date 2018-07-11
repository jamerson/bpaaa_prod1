package bpaaa.prod1.app.musart;

import java.rmi.RemoteException;

import psdi.mbo.Mbo;
import psdi.mbo.MboServerInterface;
import psdi.mbo.MboSet;
import psdi.util.MXException;

public class BPAAAArtistSet extends MboSet implements BPAAAArtistSetRemote {

	public BPAAAArtistSet(MboServerInterface ms) throws RemoteException {
		super(ms);
	}

	@Override
	protected Mbo getMboInstance(MboSet ms) throws MXException, RemoteException {
		return new BPAAAArtist(ms);
	}

}
