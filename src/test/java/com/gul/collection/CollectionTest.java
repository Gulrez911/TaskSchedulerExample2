package com.gul.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionTest {
	public static void main(String[] args) {
		List<City> cities = new ArrayList<City>();
		cities.add(new City("Phoenix", "Arizona", "US"));
		cities.add(new City("Miami", "Florida", "US"));
		cities.add(new City("Patna", "Bihar", "IN"));
		cities.add(new City("Samastipur", "Bihar", "IN"));
		cities.add(new City("Brisbane", "Queensland", "AU"));
		cities.add(new City("Caboolture", "Queensland", "AU"));
		cities.add(new City("Airdrie", "Alberta", "CA"));
		cities.add(new City("Camrose", "Alberta", "CA"));
//		System.out.println(cities);
		Map<String, Map<String, List<String>>> mapOfMaps = new HashMap<String, Map<String, List<String>>>();
		for (City cityObj : cities) {
			if (mapOfMaps.containsKey(cityObj.country)) {
				System.out.println(mapOfMaps.get(cityObj.country));
				if (mapOfMaps.get(cityObj.country).containsKey(cityObj.state)) {

					System.out.println("::::      " + mapOfMaps.get(cityObj.country).get(cityObj.state)
							.add(cityObj.cityName));
				} else {
					List<String> cities3 = new ArrayList<String>();
					cities3.add(cityObj.cityName);
					Map<String, List<String>> stateToCities = new HashMap<String, List<String>>();
					stateToCities.put(cityObj.state, cities3);
					mapOfMaps.get(cityObj.country).put(cityObj.state, cities3);
				}

			} else {
				List<String> cities2 = new ArrayList<String>();
				cities2.add(cityObj.cityName);
				Map<String, List<String>> stateToCities = new HashMap<String, List<String>>();
				stateToCities.put(cityObj.getState(), cities2);
				mapOfMaps.put(cityObj.country, stateToCities);
			}

		}
		System.out.println(mapOfMaps);

	}
}

class City {

	String cityName;
	String state;
	String country;

	public City(String cityName, String state, String country) {
		super();
		this.cityName = cityName;
		this.state = state;
		this.country = country;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "City [cityName=" + cityName + ", state=" + state + ", country=" + country + "]";
	}

}