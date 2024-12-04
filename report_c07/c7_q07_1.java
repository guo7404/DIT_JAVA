package report_c07;

import java.util.HashMap;
import java.util.Scanner;

class Location {
	private String city;
    private double latitude;  // 위도
    private double longitude; // 경도
    
    public Location(double latitude, double longitude) {
    	this.latitude = latitude;
    	this.longitude = longitude;
    }
    
    public Location(String city, double latitude, double longitude) {
    	this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getter 메서드
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    // 위치 정보를 문자열로 표현
    @Override
    public String toString() {
        return "위도: " + latitude + ", 경도: " + longitude;
    }
}

class LocationManager{
	HashMap<String, Location> city = new HashMap<>();
	public LocationManager(HashMap<String, Location> city) {
//		this.city = city;
		findCity.
	}
	
}
public class c7_q07_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Location> city = new HashMap<>();

		Scanner scanner = new Scanner(System.in);
		
		int index = 0;
		
		System.out.println("도시,경도,위도를 입력하세요.");
		while(true) {
			String input = scanner.nextLine();
			String [] cityMap = input.split(",");
			
//		LocationManager locationManager = new LocationManager(null)
	}

}
