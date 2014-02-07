package upload.controller;

import java.util.LinkedList;
import java.util.concurrent.ExecutionException;

import objects.store;
import upload.dal.getListOfStoreFromCloud;

public class getListStoreControler 
{
//	private MobileServiceClient mClient;
//	private MobileServiceTable<store> mstoreTable;
//
//	public getListStoreControler(Context c) 
//	{
//		// Create the Mobile Service Client instance, using the provided
//		// Mobile Service URL and key
//		try {
//			mClient = new MobileServiceClient("https://androideli.azure-mobile.net/","HBEzicHpTPdxewCDacPRJAcnUfycqZ11",c);
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		// Get the Mobile Service Table instance to use
//		mstoreTable = mClient.getTable(store.class);
//	}



//	public void getList(Context c)
//	{
//		mstoreTable.execute(new TableQueryCallback<store>() 
//				{
//			@Override
//			public void onCompleted(List<store> stores, int arg1, Exception arg2,	ServiceFilterResponse arg3) 
//			{
//				for (store s : stores) {
//					Log.e("eli", s.toString());
//				}
//
//			}
//				});
//	}

	//	private void refreshItemsFromTable() 
	//	{
	//		// Get the items that weren't marked as completed and add them in the
	//		// adapter
	//		mToDoTable.where().field("complete").eq(val(false)).execute(
	//				new TableQueryCallback<store>() 
	//				{
	//			public void onCompleted(List<store> result, int count, Exception exception, ServiceFilterResponse response)
	//			{
	//				if (exception == null) 
	//				{
	//
	//					for (store item : result) 
	//					{
	//						mAdapter.add(item);
	//					}
	//
	//				} else {
	//					// error
	//				}
	//			}
	//				});
	//	}


	//	private final int ID = 0 ;
	//	private final int NAME = 1 ;
	//	private final int PIC = 2 ;
	//	private final int COOR = 3;
	//	private final int EXTRA = 4 ;	
	//	
	//	public static final String LINEDELIMETER = "!";
	//	public static final String ELEMENTDELIMETER = "#";



		public static LinkedList<store> getList(String mallID)
		{
			LinkedList<store> ret = new LinkedList<store>();
			String sFromCloud = "";
			try 
			{
				sFromCloud = new getListOfStoreFromCloud().execute(mallID).get();
			} 
			catch (InterruptedException e) {	} 
			catch (ExecutionException e) {	}
			
			return ret;
		}

}
