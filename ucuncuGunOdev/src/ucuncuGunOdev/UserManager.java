package ucuncuGunOdev;

public class UserManager {

	public void add(String message) {

		System.out.println(message + ": Oluşturuldu");
	}

	public void add() {

		System.out.println("Oluşturuldu");
	}

	public void remove(String message) {
		System.out.println(message + ": Silindi");

	}

	public void remove() {
		System.out.println("Silindi");

	}

	public void update(String message) {
		System.out.println(message + ": Güncellendi");
	}

	public void update() {
		System.out.println("Güncellendi");
	}
}
