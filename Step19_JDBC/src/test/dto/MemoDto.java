package test.dto;

public class MemoDto {
	/*
	 * 안에 내용을 직접 작성할 수 있어야함.
	 * dbselect dbupdate 사용.
	 */
	 
	private int num;
	private String content;
	private String regdate;
	
	
	public MemoDto() {}
	public MemoDto(int num, String content, String regdate, String name, String birth) {
		super();
		this.num = num;
		this.content = content;
		this.regdate = regdate;
		
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	
	
}
