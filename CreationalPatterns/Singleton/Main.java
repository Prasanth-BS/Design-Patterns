Class Main {
    Public static void main(String args[]) {
        DbConnection instanceObj = DbConnection.getConnectionInstance();
        instanceObj.executeQuery("Select * from some table");
    }
}