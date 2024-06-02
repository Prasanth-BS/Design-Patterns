public class Director {
    public Home buildTinyHome() {
        Builder builder = new HomeBuilder();
        builder.setType(HomeType.TINY_HOME);
        builder.setBedRooms(1);
        builder.setKitchen(1);
        builder.setSqFeet(200);
        
        return builder.getHome();

    }

    public Home buildTinyHome() {
        Builder builder = new HomeBuilder();
        builder.setType(HomeType.MEDIUM_HOME);
        builder.setBedRooms(3);
        builder.setKitchen(1);
        builder.setSqFeet(450);
        builder.setGarden(4);
        
        return builder.getHome();

    }

    public Home buildTinyHome() {
        Builder builder = new HomeBuilder();
        builder.setType(HomeType.LARGE_HOME);
        builder.setBedRooms(4);
        builder.setKitchen(2);
        builder.setSqFeet(1500);
        builder.setGarden(10);
        builder.setPool();
        
        return builder.getHome();

    }
}