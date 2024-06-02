Interface IBuilder {
    void setHomeType(HomeType type);
    void setBedRooms(int noBedRooms);
    void setKitchen(int noKitchens);
    void setGarden(int noPlants);
    void setPool();
    void setSqFeet(int sqFeet);
    Home getHome();
}