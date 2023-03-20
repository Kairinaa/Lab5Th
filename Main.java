
public class Main {
	public static void main() {
		XeNoiThanh xnt = new XeNoiThanh("57", "Bao Thien", 100, 1000, 5000000);
		XeNgoaiThanh xnt1 = new XeNgoaiThanh("08", "Nhat Truong", 99, 150, 10000000);
		
		System.out.println("Tong Doanh thu xe noi thanh: " + xnt.getDoanhThu());
		System.out.println("Tong Doanh thu xe ngoai thanh: " + xnt1.getDoanhThu());
		System.out.println("Tong cong: " + (xnt.getDoanhThu() + xnt1.getDoanhThu()));
	}
}
 