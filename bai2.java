package mmt_Tuan1;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class bai2 {
	public static void main(String[] args) {
		String website = "www.google.com";
        try {
            InetAddress address = InetAddress.getByName(website);
            String ipAddress = address.getHostAddress();
            System.out.println("Địa chỉ IP của " + website + " là: " + ipAddress);
        } catch (UnknownHostException e) {
            System.out.println("Không thể tìm thấy địa chỉ IP cho " + website);
        }

}
}