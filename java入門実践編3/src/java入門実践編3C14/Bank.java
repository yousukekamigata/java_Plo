package java������H��3C14;

public class Bank {
	private String name;// ��s��(�K���O�����ȏオ�ݒ肳���)

	public String getName() {
		return this.name;
	}

	public void setName(String newName) {
		if (newName.length() <3) {
			throw new IllegalArgumentException("���O���s���ł�");

		}
		this.name = newName;
	}
}
