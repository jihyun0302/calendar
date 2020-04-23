package calendar.model;

public class CalDO {
	private String snidate;
	private String schedule;
	private String memo;
	
	public String getSnidate() {
		return snidate;
	}
	public void setSnidate(String snidate) {
		this.snidate = snidate;
	}
	public String getSchedule() {
		return schedule;
	}
	public void setSchedule(String schedule) {
		this.schedule = schedule;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		return "CalDO [snidate=" + snidate + ", schedule=" + schedule + ", memo=" + memo + "]";
	}
	
	
	

}
