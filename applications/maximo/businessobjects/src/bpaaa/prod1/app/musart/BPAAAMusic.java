package bpaaa.prod1.app.musart;

import java.rmi.RemoteException;

import psdi.mbo.Mbo;
import psdi.mbo.MboSet;
import psdi.util.MXException;

public class BPAAAMusic extends Mbo implements BPAAAMusicRemote {

	public BPAAAMusic(MboSet ms) throws RemoteException {
		super(ms);
	}
	
	@Override
	public void init() throws MXException {
		super.init();
		if (!toBeAdded()){
			setFieldFlag("title", READONLY, true);
		}
	}
	
}
