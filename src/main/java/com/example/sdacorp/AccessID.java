package com.example.sdacorp;

public class AccessID {


    private static int managerId;

    private static int HRId;

    public static int getManagerId() {
        return managerId;
    }

    public static void setManagerId(int id) {
        managerId = id;
    }

    public static int getHRId()
    {
        return HRId;
    }

    public static void setHRId(int id)
    {
        HRId=id;
    }
}
