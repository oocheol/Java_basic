package �����÷��̾�;

public class MusicVO {

	// VO --> ��ü
	// Value Object
	
	// 1. �ʵ�
	private String song; // ����
	private String singer; // ����
	private String path; // �뷡�� ����Ǿ��ִ� ���ϰ�� ������ �ʵ�
	
	// 2. �޼ҵ�
	// ��� �ʵ� �ʱ�ȭ��Ű�� ������
	public MusicVO(String song, String singer, String path) {
		this.song = song;
		this.singer = singer;
		this.path = path;
	}

	// getter�޼ҵ�
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
