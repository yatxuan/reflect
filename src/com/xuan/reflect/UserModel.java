package com.xuan.reflect;

import java.io.Serializable;

/**
 * 用户uuid,name
 *
 * @author <a"283505495@qq.com">lxd</a>
 * @version 1.0 2017-3-20 下午1:56:33
 * @fileName UserModel.java
 */
interface Intera {
    public void aa();
}

public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private String uuid;
    private String name;
    private int type;
    private String pwd;

    public UserModel(String uuid, String name, int type, String pwd) {
        super();
        this.uuid = uuid;
        this.name = name;
        this.type = type;
        this.pwd = pwd;
    }

    public UserModel(String uuid, String name, int type) {
        super();
        this.uuid = uuid;
        this.name = name;
        this.type = type;
    }

    public UserModel() {

    }

    public void a() {
        System.out.println("我是接口的抽象方法");
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((uuid == null) ? 0 : uuid.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserModel other = (UserModel) obj;
        if (uuid == null) {
            if (other.uuid != null) {
                return false;
            }
        } else if (!uuid.equals(other.uuid)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ID：\t" + uuid + "  , \t" + name + "\t , " + (type);
    }
}
