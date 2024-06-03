public class HomeBuilder {
    public HomeType type;
    public int noBedRooms;
    public int noKitchens;
    public int gardenPlants = 0;
    public boolean pool = False;
    public int sqFeet;

    public void setHomeType(HomeType type) {
        this.type = type;
    }

    public void setBedRooms(int noBedRooms) {
        this.noBedRooms = noBedRooms;
    }

    public void setKitchen(int noKitchens) {
        this.noKitchens = noKitchens;
    }

    public void setGarden(int noPlants) {
        this.gardenPlants = noPlants;
    }

    public void setPool() {
        this.pool = True;
    }

    public void setSqFeet(int sqFeet) {
        this.sqFeet = sqFeet;
    }

    public Home getHome() {
        return new Home(this.type, this.noBedRooms, this.noKitchens, this.noPlants, this.pool, this.sqFeet);
    }
    
}