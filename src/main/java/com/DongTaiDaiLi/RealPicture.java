package com.DongTaiDaiLi;

public class RealPicture implements Picture {
    private String filename;
    
    public RealPicture(String filename){
        this.filename=filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Loading picture: "+filename);
    }

    public void display() {
        System.out.println("Displaying picture:"+filename);
    }
}
