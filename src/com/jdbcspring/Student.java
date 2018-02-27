package com.jdbcspring;

public class Student {
    private String name;
    private Long QQ;
    private String onlineID;
    private String swear;
    private int ID;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getQQ() {
        return QQ;
    }

    public void setQQ(Long QQ) {
        this.QQ = QQ;
    }

    public String getOnlineID() {
        return onlineID;
    }

    public void setOnlineID(String onlineID) {
        this.onlineID = onlineID;
    }

    public String getSwear() {
        return swear;
    }

    public void setSwear(String swear) {
        this.swear = swear;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    @Override
    public String toString() {
        return "student[id="+ID+"name="+name+",QQ="+QQ+",onlineID="+onlineID+",swear"+swear+"]";
    }

}
