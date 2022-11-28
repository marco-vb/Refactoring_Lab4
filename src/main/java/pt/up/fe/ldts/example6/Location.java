package pt.up.fe.ldts.example6;

public class Location {
    public String latitude;
    public String longitude;
    public String name;

    public Location(String latitude, String longitude, String name){
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
    }

    public String toString() {
        return this.latitude + "," + this.longitude + " (" + this.name + ")";
    }
}
