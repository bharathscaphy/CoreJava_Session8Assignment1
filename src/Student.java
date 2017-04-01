public class Student {
	private int sid;
	private String sname;
	private String subject;

	public Student(int sid, String sname, String subject) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.subject = subject;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		  return getClass().getSimpleName() + " [id=" + sid + ", name=" + sname + ", subject=" + subject + "]";
		}

}
