package mmt_Tuan1;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class bai1 {
	public static void main(String[] args) {
		 try {
	            InetAddress address = InetAddress.getByName("www.google.com");
	            
	            boolean isConnected = address.isReachable(5000); // Thời gian chờ kết nối (5 giây)
	            if (isConnected) {
	                System.out.println("Kết nối Internet thành công!");
	            } else {
	                System.out.println("Không thể kết nối Internet!");
	            }
	        } catch (UnknownHostException e) {
	            System.out.println("Lỗi: Không thể tìm thấy máy chủ!");
	        } catch (Exception e) {
	            System.out.println("Lỗi: " + e.getMessage());
	        }
	}

}
