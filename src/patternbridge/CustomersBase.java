package patternbridge;

public class CustomersBase {

	private DataObject dataObject;
	public DataObject data;

	

 
	public void next() {
		dataObject.nextRecord();
	}

	public void prior() {
		dataObject.priorRecord();
	}

	public void add(String customer) {
		dataObject.addRecord(customer);
	}

	public void delete(String customer) {
		dataObject.deleteRecord(customer);
	}

	public void show() {
		dataObject.showRecord();
	}

	public void showAll() {
		dataObject.showAllRecords();
	}

	public DataObject getDataObject() {
		return dataObject;
	}

	public void setDataObject(DataObject dataObject) {
		this.dataObject = dataObject;
	}

	public DataObject getData() {
		return dataObject;
	}

	public void setData(DataObject data) {
		this.dataObject = data;
		this.data = data;
	}
//	public DataObject Data
//    {
//        set { dataObject = value; }
//        get { return dataObject; }
//    }
 
}
