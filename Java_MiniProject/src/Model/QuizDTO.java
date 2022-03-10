package Model;

public class QuizDTO {
	private String question;
	private String answer;
	private String hint;
	private String path;
	
	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public QuizDTO(String question, String answer, String hint, String path) {
		this.question = question;
		this.answer = answer;
		this.hint = hint;
		this.path = path;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}
	
	
	
	
	

}
