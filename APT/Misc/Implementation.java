package Misc;

public class Implementation {
    public static void main(String[] args) {
        CreateNewDatabase.createNewDatabase("Contacts.db");
        CreateNewTable.createNewTable();
        Import.readCsv();
        ShowDatabaseContent.showDatabaseContent();
         
    }
    
    
}
