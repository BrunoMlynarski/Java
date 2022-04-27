package com.company.homework.loginSystem;

import java.util.HashMap;

public class IDandPasswords {
    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {
        logininfo.put("Kasia", "milka");
        logininfo.put("Adam", "korek");
        logininfo.put("Dawid", "Uciecha");
    }

    protected HashMap getLoginInfo() {
    return logininfo;
    }
}
