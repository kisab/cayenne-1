package org.apache.cayenne.testdo.binary_pk.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;
import org.apache.cayenne.testdo.binary_pk.BinaryPKTest2;

/**
 * Class _BinaryPKTest1 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _BinaryPKTest1 extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    @Deprecated
    public static final String NAME_PROPERTY = "name";
    @Deprecated
    public static final String BINARY_PKDETAILS_PROPERTY = "binaryPKDetails";

    public static final String BIN_ID_PK_COLUMN = "BIN_ID";

    public static final Property<String> NAME = new Property<String>("name");
    public static final Property<List<BinaryPKTest2>> BINARY_PKDETAILS = new Property<List<BinaryPKTest2>>("binaryPKDetails");

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToBinaryPKDetails(BinaryPKTest2 obj) {
        addToManyTarget("binaryPKDetails", obj, true);
    }
    public void removeFromBinaryPKDetails(BinaryPKTest2 obj) {
        removeToManyTarget("binaryPKDetails", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<BinaryPKTest2> getBinaryPKDetails() {
        return (List<BinaryPKTest2>)readProperty("binaryPKDetails");
    }


}
