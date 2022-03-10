package Model;

public class MemberDTO {

	private String id;
	private String pw;
	private String name;
	private int score;

	public MemberDTO(String id, String pw, String name, int score) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.score = score;

	}

	@Override
	public String toString() {
		return id + "\t" + name + "\t" + score;
	}

	public MemberDTO(String id, String pw, String name) {
		this.id = id;
		this.pw = pw;
		this.name = name;
	}

	public MemberDTO(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}

	public MemberDTO(String id, String name, int score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
