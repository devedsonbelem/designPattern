package patternbridge;

public abstract class DataObject {
	
	public abstract void nextRecord();
	public abstract void priorRecord();
	public abstract void addRecord(String name);
	public abstract void deleteRecord(String name);
	public abstract String getCurrentRecord();
	public abstract void showRecord();
	public abstract void showAllRecords();
}
