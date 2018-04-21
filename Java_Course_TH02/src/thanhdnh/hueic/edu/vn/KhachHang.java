package thanhdnh.hueic.edu.vn;

public class KhachHang {
	private String username;
	//Tiếp tục cho các thuộc tính khác

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	//Tiếp tục cho các phương thức khác
}
private String password;

	public String getUsername() {
		return username;
	}

	public void setUsername(String usn) {
		username = usn;
	}
	//Tiếp tục cho các phương thức

	public String getPassword() {
		return password;
	}

	public void setPassword(String pw) {
		password = pw;
	}

	public KhachHang(String usn, String pw) {
		username = usn;
		password = pw;
	}

	public KhachHang() {
		username = "admin";
		password = "admin";
	}

	public void MuaHang(String th, String nsx, double dg, int sl) {
			HangHoa hh = new HangHoa();
			hh.setTenHang(th);
			hh.setNgaySanXuat(nsx);
			hh.setDonGia(dg);
			hh.setSoLuong(sl);
			hh.TinhTien();
			System.out.println(hh.toString());
		}
}
