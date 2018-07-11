package bpaaa.prod1.app.musart;

import psdi.mbo.MAXTableDomain;
import psdi.mbo.MboValue;

public class BPAAAFldMusicArtistNum extends MAXTableDomain {

	public BPAAAFldMusicArtistNum(MboValue mbv) {
		super(mbv);
		setRelationship("BPAAAARTIST", "artistnum=:artistnum");
		setListCriteria("artistnum <> 'JOAO'");
		setLookupKeyMapInOrder(new String[]{"artistnum"}, new String[]{"artistnum"});
	}
	
}
