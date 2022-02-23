package 뮤직플레이어;

public class MusicVO {

	// VO --> 객체
	// Value Object
	
	// 1. 필드
	private String song; // 제목
	private String singer; // 가수
	private String path; // 노래가 저장되어있는 파일경로 저장할 필드
	
	// 2. 메소드
	// 모든 필드 초기화시키는 생성자
	public MusicVO(String song, String singer, String path) {
		this.song = song;
		this.singer = singer;
		this.path = path;
	}

	// getter메소드
	public String getSong() {
		return song;
	}

	public String getSinger() {
		return singer;
	}

	public String getPath() {
		return path;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
