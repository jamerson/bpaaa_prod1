package bpaaa.prod1;

import java.rmi.RemoteException;

import psdi.mbo.*;
import psdi.util.*;
import psdi.app.asset.FldAssetnum;

/**
 * Simple field validate that ensure that only letters and numbers can be used in the field.
 *
 * 
 * @author bpaaa
 */
public class BPAAAFLDSampleFieldValidator extends FldAssetnum {
    public BPAAAFLDSampleFieldValidator(MboValue mbv) throws MXException, RemoteException {
        super(mbv);
    }

    public void validate() throws MXException, RemoteException {
        super.validate();

        if (!getMboValue().isNull() && !getMboValue().getString().matches("[a-zA-Z0-9]+")) {
            throw new MXApplicationException("BPAAA", "letters_numbers_only");
        }
    }
}
