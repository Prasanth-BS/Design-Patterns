public DbConnection {

    private static DbConnection instance;

    private DbConnection() {
        //
    }

    public static getConnectionInstance() {
        if(DbConnection.instance == null)
            DbConnection.instance = new DbConnection();
        
        return DbConnection.instance;
        
    }

    public executeQuery(String query) {
        System.out.println("Executing this query" + query + "with " + this.counter);
    }
}