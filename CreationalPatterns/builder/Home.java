public Home {
    public HomeType type;
    public int noBedRooms;
    public int noKitchens;
    public int gardenPlants = 0;
    public boolean pool = False;
    public int sqFeet;

    public Home (type, noBedRooms, noKitchens, noPlants, pool, sqFeet) {
        this.type = type;
        this.noBedRooms = noBedRooms;
        this.noKitchens = noKitchens;
        this.gardenPlants = noPlants;
        this.pool = True;
        this.sqFeet = sqFeet;
    }
}