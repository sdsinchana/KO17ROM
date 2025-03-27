class Bill{
	Bill(){
		System.out.println("the constructor got invoked:");
	}
	Bill(String billReferenceNo,String billDueDate,String billIssueDate,double billamount, boolean isBillOverDue, boolean isBillPaid,String servicesProvider){
	
		this();
		this.billReferenceNo = billReferenceNo;
		this.billDueDate = billDueDate;
		this.billIssueDate = billIssueDate;
		this.billamount = billamount;
		this.isBillOverDue = isBillOverDue;
		this.isBillPaid = isBillPaid;
		this.servicesProvider = servicesProvider;
		System.out.println("the constructor got excuted");
	
	}
	String billReferenceNo;
	String billDueDate;
	String billIssueDate;
	double billamount;
	boolean isBillOverDue;
	boolean isBillPaid;
	String servicesProvider;
	
	public void getInfo(){
		System.out.println("the ref no is:"+billReferenceNo);
		System.out.println("the billDueDate is:"+billDueDate);
		System.out.println("the billIssueDate is:"+billIssueDate);
		System.out.println("the billamount is:"+billamount);
		System.out.println("the isBillOverDue is:"+isBillOverDue);
		System.out.println("the isBillPaid is:"+isBillPaid);
		System.out.println("the servicesProvider is:"+servicesProvider);
	
	}

}