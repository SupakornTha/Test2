package com.example.user.test2;

import android.app.Activity;

public class GreenhouseCard extends Activity{
    private String Name;
    private String Zone;

    public GreenhouseCard(String Name, String Zone) {
        this.Name = Name;
        this.Zone = Zone;
    }

    public String getName(){
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getZone(){ return Zone; }

    public void setZone(String Zone) {
        this.Zone = Zone;
    }

}
