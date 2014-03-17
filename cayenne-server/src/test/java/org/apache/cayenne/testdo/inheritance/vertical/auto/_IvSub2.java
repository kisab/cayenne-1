package org.apache.cayenne.testdo.inheritance.vertical.auto;

import org.apache.cayenne.testdo.inheritance.vertical.IvRoot;

/**
 * Class _IvSub2 was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _IvSub2 extends IvRoot {

    public static final String SUB2ATTR_PROPERTY = "sub2Attr";
    public static final String SUB2NAME_PROPERTY = "sub2Name";

    public static final String ID_PK_COLUMN = "ID";

    public void setSub2Attr(String sub2Attr) {
        writeProperty(SUB2ATTR_PROPERTY, sub2Attr);
    }
    public String getSub2Attr() {
        return (String)readProperty(SUB2ATTR_PROPERTY);
    }

    public void setSub2Name(String sub2Name) {
        writeProperty(SUB2NAME_PROPERTY, sub2Name);
    }
    public String getSub2Name() {
        return (String)readProperty(SUB2NAME_PROPERTY);
    }

}